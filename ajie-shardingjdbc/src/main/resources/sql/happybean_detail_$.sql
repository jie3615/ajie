/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2020-01-14 16:12:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for happybean_detail_0
-- ----------------------------
DROP TABLE IF EXISTS `happybean_detail_0`;
CREATE TABLE `happybean_detail_0` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `happybeanId` bigint(20) NOT NULL COMMENT '乐豆id',
  `operationType` int(11) NOT NULL COMMENT '操作类型',
  `operationName` varchar(500) NOT NULL COMMENT '操作名称',
  `requirement` varchar(500) DEFAULT NULL COMMENT '描述',
  `sign` tinyint(4) NOT NULL COMMENT '1：收，2：支（正负）',
  `changeNum` int(11) NOT NULL COMMENT '变化数量',
  `num` int(11) unsigned NOT NULL COMMENT '最终数量',
  `isDeleted` int(11) NOT NULL COMMENT '是否删除',
  `createdBy` bigint(20) NOT NULL COMMENT '创建人',
  `createdOn` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建日期',
  `modifiedBy` bigint(20) DEFAULT NULL COMMENT '修改人',
  `modifiedOn` timestamp NULL DEFAULT NULL COMMENT '修改日期',
  PRIMARY KEY (`id`),
  KEY `index_operationName` (`operationName`(255)),
  KEY `index_sign_isDeleted_createdOn` (`sign`,`isDeleted`,`createdOn`),
  KEY `index_happyId` (`happybeanId`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='0：收，1：支  （正负）';

-- ----------------------------
-- Records of happybean_detail_0
-- ----------------------------

-- ----------------------------
-- Table structure for happybean_detail_1
-- ----------------------------
DROP TABLE IF EXISTS `happybean_detail_1`;
CREATE TABLE `happybean_detail_1` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `happybeanId` bigint(20) NOT NULL COMMENT '乐豆id',
  `operationType` int(11) NOT NULL COMMENT '操作类型',
  `operationName` varchar(500) NOT NULL COMMENT '操作名称',
  `requirement` varchar(500) DEFAULT NULL COMMENT '描述',
  `sign` tinyint(4) NOT NULL COMMENT '1：收，2：支（正负）',
  `changeNum` int(11) NOT NULL COMMENT '变化数量',
  `num` int(11) unsigned NOT NULL COMMENT '最终数量',
  `isDeleted` int(11) NOT NULL COMMENT '是否删除',
  `createdBy` bigint(20) NOT NULL COMMENT '创建人',
  `createdOn` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建日期',
  `modifiedBy` bigint(20) DEFAULT NULL COMMENT '修改人',
  `modifiedOn` timestamp NULL DEFAULT NULL COMMENT '修改日期',
  PRIMARY KEY (`id`),
  KEY `index_operationName` (`operationName`(255)),
  KEY `index_sign_isDeleted_createdOn` (`sign`,`isDeleted`,`createdOn`),
  KEY `index_happyId` (`happybeanId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=423875412196589570 DEFAULT CHARSET=utf8 COMMENT='0：收，1：支  （正负）';

-- ----------------------------
-- Records of happybean_detail_1
-- ----------------------------
INSERT INTO `happybean_detail_1` VALUES ('423875412196589569', '33', '1', '卡1西', '冯绍峰', '1', '2', '100', '0', '232', '2020-01-14 16:09:29', '323', '2020-01-14 16:09:29');
