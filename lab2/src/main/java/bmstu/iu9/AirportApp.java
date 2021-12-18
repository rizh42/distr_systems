package bmstu.iu9;

import java.io.FileOutputStream;

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
        MultipleInputs.addInputPath(job, new Path(args[0]), TextInputFormat.class, AirportMapper.class);

        job.setMapOutputKeyClass(AirportWritableComparable.class);
        job.setMapOutputValueClass(Text.class);
        job.setPartitionerClass(AirportPartitioner.class);
        job.setGroupingComparatorClass(AirportComparator.class);

        FileOutputFormat.setOutputPath(job, new Path(args[]))
    }
}
