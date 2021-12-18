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
    public void readFields(DataInput data){
        this.airportID = data.readInt();
        this.ind = data.readInt();
    }

    @Override
    public void write(DataOutput data){
        data.writeInt(airportID);
        data.writeInt(ind);
    }

    @Override
    public String toString(){
        return "AirportWritable(" +
                "airportID = " + airportID +
                ", ind = " + ind + ")";
    }

    @Override
    public int compareTo(Object t){
        AirportWritableComparable air = 
    }
}
