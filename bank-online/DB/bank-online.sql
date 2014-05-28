/*
MySQL Data Transfer
Source Host: localhost
Source Database: bank
Target Host: localhost
Target Database: bank
Date: 2011-4-20 16:09:02
*/
##  删除数据库
drop  database  bank;

##  创建数据库
create database bank;   

##  使用数据库
use bank;


SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL auto_increment,
  `admin_name` varchar(32) NOT NULL,
  `admin_pwd` varchar(32) NOT NULL,
  PRIMARY KEY  (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for adminlog
-- ----------------------------
DROP TABLE IF EXISTS `adminlog`;
CREATE TABLE `adminlog` (
  `log_id` int(11) NOT NULL auto_increment,
  `log_content` varchar(4000) default NULL,
  `admin_id` int(11) NOT NULL,
  PRIMARY KEY  (`log_id`),
  KEY `fk_adminlog_admin` (`admin_id`),
  CONSTRAINT `fk_adminlog_admin` FOREIGN KEY (`admin_id`) REFERENCES `admin` (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for card
-- ----------------------------
DROP TABLE IF EXISTS `card`;
CREATE TABLE `card` (
  `card_id` int(11) NOT NULL auto_increment,
  `card_num` varchar(32) NOT NULL,
  `balance` double NOT NULL,
  `status` bit(1) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY  (`card_id`),
  KEY `fk_card_user` (`user_id`),
  CONSTRAINT `fk_card_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for logindate
-- ----------------------------
DROP TABLE IF EXISTS `logindate`;
CREATE TABLE `logindate` (
  `date_id` int(11) NOT NULL auto_increment,
  `login_date` varchar(32) NOT NULL,
  `user_id` int(11) default NULL,
  PRIMARY KEY  (`date_id`),
  KEY `fk_logindate_user` (`user_id`),
  CONSTRAINT `fk_logindate_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `news_id` int(11) NOT NULL auto_increment,
  `news_title` varchar(32) NOT NULL,
  `news_date` varchar(32) NOT NULL,
  `news_content` varchar(4000) NOT NULL,
  PRIMARY KEY  (`news_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for orderline
-- ----------------------------
DROP TABLE IF EXISTS `orderline`;
CREATE TABLE `orderline` (
  `order_id` int(11) NOT NULL auto_increment,
  `order_status` varchar(32) NOT NULL,
  `order_cost` double NOT NULL,
  `card_id` int(11) default NULL,
  PRIMARY KEY  (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for record
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
  `record_id` int(11) NOT NULL auto_increment,
  `record_amount` double NOT NULL,
  `record_state` varchar(32) NOT NULL,
  `record_date` varchar(32) NOT NULL,
  `card_id` int(11) default NULL,
  PRIMARY KEY  (`record_id`),
  KEY `card_id` (`card_id`),
  CONSTRAINT `fk_record_card` FOREIGN KEY (`card_id`) REFERENCES `card` (`card_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL auto_increment,
  `user_loginname` varchar(32) NOT NULL,
  `user_pwd` varchar(32) NOT NULL,
  `username` varchar(32) NOT NULL,
  `identityNum` varchar(32) NOT NULL,
  `gender` varchar(2) default NULL,
  `address` varchar(128) default NULL,
  `telephone` varchar(32) default NULL,
  `birthday` varchar(32) default NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
-- Records 
-- ----------------------------

-- 插入管理员
INSERT INTO `admin` VALUES ('1', 'aaa', 'aaa');
INSERT INTO `admin` VALUES ('2', 'bbb', 'bbb');
INSERT INTO `admin` VALUES ('3', 'ccc', 'ccc');



