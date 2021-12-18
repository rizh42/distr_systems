package bmstu.iu9;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class AirportReduce extends Reducer<AirportWritableComparable, Text, Text, Text>{
    @Override
    protected void reduce(AirportWritableComparable key, Iterable<Text> values, Context context){
        
    }
}
