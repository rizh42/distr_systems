package bmstu.iu9;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

public class AirportReduce extends Reducer<AirportWritableComparable, Text, Text, Text>{
    @Override
    protected void reduce(AirportWritableComparable key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        Iterator<Text> valIterated = values.iterator();
        String air = valIterated.next().toString();
        float max = 0.0f;
        float sum = 0.0f;
        int count = 0;
        float min = -1.0f;

        while (valIterated.hasNext()){
            float delay = Float.parseFloat(values.next().toString());
            if (delay > max){
                max = delay;
            }
            if (min == -1 || delay < min){
                min = delay;
            }
            sum += delay;
            count++;
        }

        if (count > 0){
            context.write(new Text("Airport name: " + air),
                            new Text("min: " + min))
        }
    }
}
