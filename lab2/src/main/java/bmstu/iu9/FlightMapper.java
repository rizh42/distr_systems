package bmstu.iu9;



public class FlightMapper extends Mapper<LongWritable, Text, AirportWritableComparable, Text> {

    public static 

    @Override
    protected ciod map(LongWritable key, Text value, Context context){
        String[] params = value.toString().split()
    }
}
