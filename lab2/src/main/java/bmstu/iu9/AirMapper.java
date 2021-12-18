package bmstu.iu9;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;


public class AirMapper extends Mapper<LongWritable, Text>{
    public statit int air_id = 0;

    @Override
    protected void map(LongWritable key, Text value){
        
    }
}
