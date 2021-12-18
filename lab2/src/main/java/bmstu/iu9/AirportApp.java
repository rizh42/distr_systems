package bmstu.iu9;

public class AirportApp {
    public static void main(String[] args) throws Exception {
        if (args.length != 3){
            System.err.println("Usage: AirportApp <flight data> <airport data> <output>");
            System.exit(-1);
        }

        Job job = Job.getInstance();
        job.getJarByClass(Airport.class);
        job.setJobName("Join App");
        MultipleInputs.addInputPath(job, new Path(args[0]), TextInputFormat.class, FlightMapper.class);
    }
}
