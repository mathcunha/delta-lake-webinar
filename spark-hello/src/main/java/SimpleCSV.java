import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class SimpleCSV {

    public static void main(String[] args) {
        SparkSession spark = SparkSession
                .builder()
                .appName("Java Spark SQL basic example")
                .config("spark.some.config.option", "some-value")
                //.master("local[*]")
                .getOrCreate();


        Dataset<Row> df = ReadResourceFile.loadPeopleDataset(spark);

        // Displays the content of the DataFrame to stdout
        df.coalesce(1).write().csv("hdfs://192.168.33.10:9000/user/vagrant/people");
    }
}
