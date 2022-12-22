module.exports ={
    admin(req,res){
        res.render("admin",{
            url: 'http://localhost:5050/login',
            userName: req.session.username,
        });
    }
}