package bmstu.iu9;

public class AirportPartitioner extends Partitioner<AirportWritableComparable, Text>{
    @Override
    public int getPartition(AirportWritableComparable key, Text value, int numReduceTasks){
        return key.getAirportID() % numReduceTasks;
    }
}
