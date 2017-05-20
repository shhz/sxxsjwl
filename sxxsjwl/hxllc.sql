/*
SQLyog Enterprise v12.09 (64 bit)
MySQL - 5.7.18 : Database - hxllc_web
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hxllc_web` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `hxllc_web`;

/*Table structure for table `hotact` */

DROP TABLE IF EXISTS `hotact`;

CREATE TABLE `hotact` (
  `h_id` int(10) NOT NULL COMMENT '索引',
  `h_title` varchar(50) NOT NULL COMMENT '标题',
  `h_url` varchar(50) NOT NULL COMMENT '连接',
  `h_flag` int(2) NOT NULL DEFAULT '1' COMMENT '标识',
  `h_photo` varchar(50) NOT NULL COMMENT '图片',
  `h_start_date` date NOT NULL COMMENT '起始时间',
  `h_over_data` date NOT NULL COMMENT '结束时间',
  PRIMARY KEY (`h_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `hotact` */

insert  into `hotact`(`h_id`,`h_title`,`h_url`,`h_flag`,`h_photo`,`h_start_date`,`h_over_data`) values (1,'【母亲节】感恩回馈 感谢有你 狐小狸理财投标有奖励','#',1,'images/hot_pic.jpg','2017-04-05','2017-06-05'),(2,'【狐小狸理财】邀请好友 获万元体验金','#',1,'images/hot_pic1.jpg','2017-04-05','2017-06-05'),(3,'【狐小狸理财】小狸钱包稳健计划','#',1,'images/hot_pic2.jpg','2017-04-05','2017-06-05');

/*Table structure for table `message` */

DROP TABLE IF EXISTS `message`;

CREATE TABLE `message` (
  `m_id` int(10) NOT NULL COMMENT '索引',
  `m_title` varchar(20) NOT NULL COMMENT '标题',
  `m_context` varchar(1000) NOT NULL COMMENT '内容',
  `m_date` date NOT NULL COMMENT '发布日期',
  PRIMARY KEY (`m_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `message` */

insert  into `message`(`m_id`,`m_title`,`m_context`,`m_date`) values (1,'测试公告','测试内容','2017-05-20'),(2,'感恩回馈','感恩回馈 感谢 有你邀请好友 获万元体验金 小狸钱包稳健计划','2017-06-01');

/*Table structure for table `news` */

DROP TABLE IF EXISTS `news`;

CREATE TABLE `news` (
  `n_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '索引',
  `n_title` varchar(100) NOT NULL COMMENT '标题',
  `n_content` varchar(5000) NOT NULL COMMENT '文',
  `n_author` varchar(10) DEFAULT '狐小狸理财' COMMENT '作者',
  `n_photo_1` varchar(50) NOT NULL DEFAULT 'images/notice_pic.jpg' COMMENT '缩略图地址',
  `n_photo_2` varchar(50) DEFAULT NULL COMMENT '图二地址',
  `n_photo_3` varchar(50) DEFAULT NULL COMMENT '图三地址',
  `n_date` date NOT NULL COMMENT '发布日期',
  `n_url` varchar(50) NOT NULL DEFAULT '#' COMMENT '跳转地址',
  PRIMARY KEY (`n_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `news` */

insert  into `news`(`n_id`,`n_title`,`n_content`,`n_author`,`n_photo_1`,`n_photo_2`,`n_photo_3`,`n_date`,`n_url`) values (1,'扎心！在最穷的年纪遇见最想照顾一生的人 老铁陪我哭会','前两天网易云音乐把用户们的乐评留言搬上了杭州地铁，5000 条优质乐评印满了杭州地铁 1前两天网易云音乐把用户们的乐评留言搬上了杭州地铁，5000 条优质乐评印满了杭州地铁 1','狐小狸理财','images/notice_pic.jpg',NULL,NULL,'2017-05-20','#');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `u_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '索引',
  `u_name` varchar(50) NOT NULL COMMENT '用户名',
  `u_pwd` varchar(50) NOT NULL COMMENT '密码',
  `u_power` int(1) DEFAULT '0' COMMENT '权限',
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`u_id`,`u_name`,`u_pwd`,`u_power`) values (1,'system','hxllc',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
