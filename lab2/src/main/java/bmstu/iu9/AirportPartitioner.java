package bmstu.iu9;

import org.hadoop.io.Text;
import org.hadoop.mapreduce.Partitioner;

public class AirportPartitioner extends Partitioner<AirportWritableComparable, Text>{
    @Override
    public int getPartition(AirportWritableComparable key, Text value, int numReduceTasks){
        return key.getAirportID() % numReduceTasks;
    }
}
