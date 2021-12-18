package bmstu.iu9;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataOutput;

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
    public void readFields(DataOutput data){
        this.airportID = data.readInt();
        this.ind = data.readInt();
    }

    @Override
    public void writable(DataOutput data){
        this.airportID = data.readInt();
        this.ind = data.readInt();
    }
}
