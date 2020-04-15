#!/bin/bash
source ./env.sh
$HADOOP_HOME/bin/hdfs --config $(pwd)/etc namenode -format
