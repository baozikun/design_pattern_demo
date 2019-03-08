/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 80015
Source Host           : localhost:3306
Source Database       : onlineqa

Target Server Type    : MYSQL
Target Server Version : 80015
File Encoding         : 65001

Date: 2019-02-27 23:05:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for answers
-- ----------------------------
DROP TABLE IF EXISTS `answers`;
CREATE TABLE `answers` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `ansContent` varchar(255) DEFAULT NULL,
  `ansDate` datetime NOT NULL,
  `qid` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of answers
-- ----------------------------
INSERT INTO `answers` VALUES ('1', '11', '2019-02-14 20:56:24', '1');
INSERT INTO `answers` VALUES ('2', '21', '2019-02-14 20:56:46', '2');
INSERT INTO `answers` VALUES ('3', '23', '2019-02-14 20:56:52', '2');
INSERT INTO `answers` VALUES ('4', '31', '2019-02-13 20:57:09', '3');
INSERT INTO `answers` VALUES ('5', '32', '2019-02-07 20:57:22', '3');

-- ----------------------------
-- Table structure for questions
-- ----------------------------
DROP TABLE IF EXISTS `questions`;
CREATE TABLE `questions` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `detailDesc` varchar(255) DEFAULT NULL,
  `answerCount` int(255) NOT NULL,
  `lastModified` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of questions
-- ----------------------------
INSERT INTO `questions` VALUES ('1', '第一？', '第一', '3', '2019-02-13 20:54:48');
INSERT INTO `questions` VALUES ('2', ' 第二？', '第二', '2', '2019-02-15 20:55:18');
INSERT INTO `questions` VALUES ('3', '第三？', '第三', '2', '2019-02-08 20:55:37');
