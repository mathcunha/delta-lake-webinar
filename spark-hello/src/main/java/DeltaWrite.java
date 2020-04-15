import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class DeltaWrite {
    public static void main(String[] args) {
        SparkSession spark = SparkSession
                .builder()
                .appName("Java Spark SQL delta lake example")
                .config("spark.some.config.option", "some-value")
                //.master("local[*]")
                .getOrCreate();

        Dataset<Row> df = spark.read().json("hdfs://192.168.33.10:9000/user/vagrant/delta/health_tracker_data_2020_02.json");
        df.write().format("delta").save("hdfs://192.168.33.10:9000/user/vagrant/delta/silver/health_tracker");
    }
}
