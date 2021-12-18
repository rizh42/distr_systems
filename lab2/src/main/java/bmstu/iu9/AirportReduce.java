package bmstu.iu9;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;
import java.utils.Iterator;

public class AirportReduce extends Reducer<AirportWritableComparable, Text, Text, Text>{
    @Override
    protected void reduce(AirportWritableComparable key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        Iterator<Text> valIterated = 
    }
}
