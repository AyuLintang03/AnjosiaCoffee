const config = require('../configs/database');
let mysql      = require('mysql');
let pool       = mysql.createPool(config);

pool.on('error',(err)=> {
    console.error(err);
});

module.exports ={
    formRegister(req,res){
        res.render("register",{
            url : 'http://localhost:5050/',
        });
    },
    saveRegister(req,res){
        let username = req.body.username;
        let nomer_hp = req.body.nomer_hp;
        let password = req.body.pass;
        if (username && nomer_hp && password) {
            pool.getConnection(function(err, connection) {
                if (err) throw err;
                connection.query(
                    `INSERT INTO tbl_user (username,nomer_hp,password) VALUES (?,?,SHA2(?,512));`
                , [username, nomer_hp, password],function (error, results) {
                    if (error) throw error; 
                    req.flash('color', 'success');
                    req.flash('status', 'Yes..');
                    req.flash('message', 'Registrasi berhasil');
                    res.redirect('/login');
                });
                connection.release();
            })
        } else {
            res.redirect('/login');
            res.end();
        }
    }
}