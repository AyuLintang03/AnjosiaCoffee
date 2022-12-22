const router = require('express').Router();
const verifyUser = require('../configs/verify');
const lindexController = require('../controllers').lindex;

router.get('/', verifyUser.isLogout, lindexController.lindex);
module.exports = router;