/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.25.110
 Source Server Type    : MySQL
 Source Server Version : 50648
 Source Host           : 192.168.25.110:3306
 Source Schema         : db2019

 Target Server Type    : MySQL
 Target Server Version : 50648
 File Encoding         : 65001

 Date: 23/09/2020 23:45:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for payment
-- ----------------------------
DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment`  (
  `id` int(32) NOT NULL,
  `serial` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of payment
-- ----------------------------
INSERT INTO `payment` VALUES (1, 'asd');

SET FOREIGN_KEY_CHECKS = 1;
