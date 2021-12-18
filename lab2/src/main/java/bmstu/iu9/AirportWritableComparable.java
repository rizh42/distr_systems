package bmstu.iu9;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataOutput;
import java.io.DataInput;
import java.io.IOException;
import java.util.Objects;

public class AirportWritableComparable implements WritableComparable {
    private int airportID;
    private int ind;

    public AirportWritableComparable(){}

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
    public void readFields(DataInput data) throws IOException {
        this.airportID = data.readInt();
        this.ind = data.readInt();
    }

    @Override
    public void write(DataOutput data) throws IOException {
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
        AirportWritableComparable air = (AirportWritableComparable)t;
        if (this.airportID > air.airportID) return 1;
        if (this.airportID < air.airportID) return -1;
        return Integer.compare(this.ind, air.ind);
    }

    @Override
    public boolean equals(Object t){
        if (this == t) return true;
        if (t == null || getClass() != t.getClass()) return false;
        AirportWritableComparable air = (AirportWritableComparable)t;
        return (airportID == air.airportID) && (ind == air.ind);
    }

    @Override
    public int hash(){
        return Objects.hash(airportID, ind);
    }
}
