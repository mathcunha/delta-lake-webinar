import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class ReadResourceFile {

    public static List<String> readFile(String fileName) {
        InputStream in = ReadResourceFile.class.getResourceAsStream(fileName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        return reader.lines().collect(Collectors.toList());
    }

    public static Dataset<Row> getCSVDataset(SparkSession spark, String filePath) {
        return spark.read().option("header", "true")
                .csv(spark.createDataset(ReadResourceFile.readFile(filePath), Encoders.STRING()));
    }

    public static Dataset<Row> loadPeopleDataset(SparkSession spark) {
        return getCSVDataset(spark, "/people.csv");
    }
}
