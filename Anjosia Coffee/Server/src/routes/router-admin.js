const router = require('express').Router();
const verifyUser = require('../configs/verify');
const adminController = require('../controllers').admin;

router.get('/', verifyUser.isLogin, adminController.admin);

module.exports = router;