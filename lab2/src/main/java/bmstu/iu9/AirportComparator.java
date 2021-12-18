package bmstu.iu9;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class AirportComparator extends WritableComparator {
    protected AirportComparator(){
        super(AirportWritableComparable.class, true);
    }

    @Override
    
}
