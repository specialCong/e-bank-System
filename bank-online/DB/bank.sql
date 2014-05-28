##  删除数据库
drop  database  bank;

##  创建数据库
create database bank;   

##  使用数据库
use bank;

##  用户登录信息表结构
create table user(
		user_id         int primary key auto_increment,
		user_loginname  varchar(32) not null,
		user_pwd        varchar(32) not null
		);


##  创建用户登录时间记录表
create table logindate(
		date_id			int primary key auto_increment,
		login_date		varchar(32)	not null,
		user_id         int references user(user_id)
		);
		
		
##  用户信息关联信息表结构
create table userinfo(
		userinfo_id     int primary key references user(user_id),		
		username        varchar(32),
		identityNum		varchar(32),
		gender		    varchar(2),
		address 	 	varchar(128),
		telephone    	varchar(32),
		birthday		varchar(32)
		);


##  创建管理员表结构
create table admin(
	  	admin_id        int primary key auto_increment,
		admin_name		varchar(32) not null,
		admin_pwd		varchar(32) not null
		);
		

##  创建管理员操作记录表结构
create table adminlog(
		log_id         int primary key auto_increment,
		log_content	   varchar(4000),
		admin_id       int references admin(admin_id)
		);
		

		
##  创建银行卡表结构
create table card(
		card_id			int primary key auto_increment,
		card_num		varchar(32) not null,
		balance			double not null,
		status			varchar(32) not null,
		userinfo_id		 int references userinfo(userinfo_id)
		);

##  创建订单表结构
create table orderline(
   		order_id            int primary key auto_increment,
   		order_status        varchar(32) not null,
   		order_cost          double not null,
   		card_id             int references card(card_id)
		);

		
##  创建用户交易记录表结构
create table record 
(
   	record_id           int primary key auto_increment,
   	record_amount       double not null,
   	record_state        varchar(32) not null,
  	record_date         varchar(32) not null,
  	card_id             int references card(card_id)
);

##  创建金融信息表结构
create table news 
(
	  news_id            int primary key auto_increment,
   	  news_title         varchar(32) not null,
      news_date          varchar(32) not null,
      news_content       varchar(4000) not null
 );

## =========================================================
##  模拟数据插入

##  插入管理员
INSERT INTO admin (admin_name , admin_pwd ) VALUES ('aaa', 'aaa');
INSERT INTO admin (admin_name , admin_pwd ) VALUES ('bbb', 'bbb');
INSERT INTO admin (admin_name , admin_pwd ) VALUES ('ccc', 'ccc');

##	插入用户
INSERT INTO user (user_loginname , user_pwd ) VALUES ('aaa', 'aaa');
INSERT INTO user (user_loginname , user_pwd ) VALUES ('bbb', 'bbb');
INSERT INTO user (user_loginname , user_pwd ) VALUES ('ccc', 'ccc');

