package bmstu.iu9;

import org.apache.hadoop.io.WritableComparable;

public class AirportWritableComparable implements WritableComparable {
    private int airportID;
    private int ind;

    pulic AirportWritableComparable(){}

    public void setAirportID(int airportID){
        this.airportID = airportID;
    }

    public void setInd(int ind){
        this.ind = ind;
    }

    public int getAirportID() {
        return airportID;
    }

    public int getInd() {
        return ind;
    }

    public AirportWritableComparable(int airportID, int ind){
        this.airportID = airportID;
        this.ind = ind;
    }

    @Override
    public void readFields(Data)
}
