package bmstu.iu9;



public class FlightMapper extends Mapper<LongWritable, Text, AirportWritableComparable, Text> {

    public static String SEP = ",";
    public  static int 

    @Override
    protected ciod map(LongWritable key, Text value, Context context){
        String[] params = value.toString().split(SEP);

        if(key.get() > 0){
            String delay =  params[18];
            float delayFl = delay.isEmpty() ? 0.0f : Float.parseFloat(delay);
            if (delayFl > 0.0f){
                int airID = Integer.parseInt(params[14]);
                context.write(new AirportWritableComparable(airID, 1), new Text(delay))
            }
        }
    }
}
