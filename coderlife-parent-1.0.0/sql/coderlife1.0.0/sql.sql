
-- ---------------------------sql for coderlife 1.0.0-----------------------------------------------

-- -----创建数据库-------zhuyaoyao----2013-08-01----------------------------------------------------
create database default character set utf8;

-- -----用户表----------zhuyaoyao----2013-08-01-----------------------------------------------------
create table if not exists users(
	id bigint not null auto_increment,
	username varchar(50) not null,
	userpassword varchar(100) not null,
	primary key (id)
)engine=InnoDB default charset utf8;
