package bmstu.iu9;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;


public class AirMapper extends Mapper<LongWritable, Text>{
    public statit int air_id = 0;

    @Override
    protected void map(LongWritable key, Text value){
        String[] params = value.toString().split("\",\"");

        if(key.get > 0){
            String name;
            int airID = Integer.parseInt(params[0].split("\"")[1]);
            name = params[1].split("\"")[0];
            context.write()
        }
    }
}
