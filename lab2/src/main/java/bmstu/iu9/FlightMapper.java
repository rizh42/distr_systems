package bmstu.iu9;



public class FlightMapper extends Mapper<LongWritable, Text, AirportWritableComparable, Text> {

    public static String SEP = ",";

    @Override
    protected ciod map(LongWritable key, Text value, Context context){
        String[] params = value.toString().split(SEP);

        if(key.get() > 0){
            String delay =  params[18];
            
        }
    }
}
