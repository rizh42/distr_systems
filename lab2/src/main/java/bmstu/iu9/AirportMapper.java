package bmstu.iu9;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;


public class AirportMapper extends Mapper<LongWritable, Text, AirportWritableComparable, Text>{
    @Override
    protected void map(LongWritable key, Text value, Context context){
        String[] params = value.toString().split("\",\"");

        if(key.get() > 0){
            String name;
            int airID = Integer.parseInt(params[0].split("\"")[1]);
            name = params[1].split("\"")[0];
            context.write(new AirportWritableComparable(airID, 0), new Text(name));
        }
    }
}
