#!/bin/bash
export JAVA_HOME=/usr/local/jdk/jdk1.8.0_251
export NODE_PATH=$(pwd)
export HADOOP_LOG_DIR=$NODE_PATH/logs
export HADOOP_PID_DIR=$NODE_PATH
export HADOOP_HEAPSIZE=512
export HADOOP_HOME="/vagrant/hadoop/hadoop-3.2.1"
export HADOOP_YARN_HOME="/vagrant/hadoop/hadoop-3.2.1"
export HADOOP_COMMON_HOME="/vagrant/hadoop/hadoop-3.2.1"
export HADOOP_HDFS_HOME="/vagrant/hadoop/hadoop-3.2.1"
export YARN_LOG_DIR=$NODE_PATH/logs
export YARN_PID_DIR=$NODE_PATH
