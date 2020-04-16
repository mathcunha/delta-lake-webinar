# delta-lake-webinar
  repo for Delta Lake Rapid Start with Spark SQL
 
## start hdfs
Running at 192.168.33.10 
at infra dir.
```console
./namenode start
./datanode start
```

## start spark
```console
/usr/local/spark/spark-2.4.5-bin-hadoop2.7/sbin/start-master.sh -i 192.168.33.10
/usr/local/spark/spark-2.4.5-bin-hadoop2.7/sbin/start-slave.sh spark://192.168.33.10:7077
```

## submit a java job
```console
/usr/local/spark/spark-2.4.5-bin-hadoop2.7/bin/spark-submit --master spark://192.168.33.10:7077 --class DeltaWrite  --deploy-mode cluster target/spark-hello-1.0-SNAPSHOT.jar
```
