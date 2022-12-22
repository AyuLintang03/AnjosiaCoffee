const config = require('../configs/database');

let mysql      = require('mysql');
const { admin } = require('./controller-admin');
let pool       = mysql.createPool(config);

pool.on('error',(err)=> {
    console.error(err);
});

module.exports ={
    login(req,res){
        res.render("login",{
            url : 'http://localhost:5050/',
            colorFlash: req.flash('color'),
            statusFlash: req.flash('status'),
            pesanFlash: req.flash('message'),
        });
    },
    loginAuth(req,res){
        let username = req.body.username;
        let password = req.body.pass;
        if (username == 'adminanjosia' && password  == '12345') {
            pool.getConnection(function(err, connection) {
                if (err) throw err;
                connection.query(
                    `SELECT * FROM tbl_user WHERE username = ? AND password = SHA2(?,512)`
                , [username, password],function (error, results) {
                    if (error) throw error;  
                    if (results.length > 0) {
                        req.session.loggedin = true;
                        req.session.userid = results[0].user_id;
                        req.session.username = results[0].username;

                                 res.redirect('/admin');

                        
                    }

                    
                    else {
                        req.flash('color', 'danger');
                        req.flash('status', 'Oops..');
                        req.flash('message', 'Akun tidak ditemukan');
                        res.redirect('/login');
                    }
                });
                connection.release();
            })

            
        }
        
        else {
            if (username  && password) {
            pool.getConnection(function(err, connection) {
                if (err) throw err;
                connection.query(
                    `SELECT * FROM tbl_user WHERE username = ? AND password = SHA2(?,512)`
                , [username, password],function (error, results) {
                    if (error) throw error;  
                    if (results.length > 0) {
                        req.session.loggedin = true;
                        req.session.userid = results[0].user_id;
                        req.session.username = results[0].username;

                                 res.redirect('/');

                        
                    }

                    
                    else {
                        req.flash('color', 'danger');
                        req.flash('status', 'Oops..');
                        req.flash('message', 'Akun tidak ditemukan');
                        res.redirect('/login');
                    }
                });
                connection.release();
            })

            
        }
        }

        
    }, 
    logout(req,res){
        req.session.destroy((err) => {
            if(err) {
                return console.log(err);
            }
            res.clearCookie('secretname');
            res.redirect('/login');
        });
    },
}