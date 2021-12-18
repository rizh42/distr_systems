package bmstu.iu9;

import org.apache.hadoop.io.WritableComparable;

public class AirportWritableComparable implements WritableComparable {
    private int airportID;
    private int ind;

    pulic AirWritableComparable(){}

    public void setAirportID(int airportID){
        this.airportID = airportID;
    }

    public void setInd(int ind){
        this.ind = ind;
    }

    
}
