package bmstu.iu9;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class AirportComparator extends WritableComparator {
    protected AirportComparator(){
        super(AirportWritableComparable.class, true);
    }

    @Override
    public int compare(WritableComparable air1, WritableComparable air2){
        AirportWritableComparable airport1 = (AirportWritableComparable) air1;
        AirportWritableComparable airport2 = (AirportWritableComparable) air2;

        return  Integer.compare(airport1.getAirportID(), airport2.getAirportID());
    }
}
