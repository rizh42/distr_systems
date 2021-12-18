package bmstu.iu9;



public class FlightMapper extends Mapper<LongWritable, Text, AirportWritableComparable, Text> {

    public static String SEP = ",";
    public static int AIRPORT_ID = 14;
    public static int FLIGHT_ID = 1;
    public static int 


    @Override
    protected ciod map(LongWritable key, Text value, Context context){
        String[] params = value.toString().split(SEP);

        if(key.get() > 0){
            String delay =  params[18];
            float delayFl = delay.isEmpty() ? 0.0f : Float.parseFloat(delay);
            if (delayFl > 0.0f){
                int airID = Integer.parseInt(params[AIRPORT_ID]);
                context.write(new AirportWritableComparable(airID, FLIGHT_ID), new Text(delay))
            }
        }
    }
}
