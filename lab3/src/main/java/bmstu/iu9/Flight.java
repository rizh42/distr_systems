package bmstu.iu9;

import scala.Serializable;
import scala.Tuple2;

public class Flight implements Serializable {
    public int startAirportId;
    public int destAirportId;
    public float delayed;
    public boolean cancelled;

    public static int START_AIRPORT_ID_IND = 11;
    public static int DEST_AIRPORT_ID_IND = 14;
    public static int DELAY_IND = 17;
    public static int CANCELLED_IND = 19;

    public Flight(int startAirportId, int destAirportId, float delayed, boolean cancelled){
        this.startAirportId = startAirportId;
        this.destAirportId = destAirportId;
        this.delayed = delayed;
        this.cancelled = cancelled;
    }

    public Tuple2<Tuple2<Integer, Integer>, Flight> getTupleWithAirports(){
        return new Tuple2<>(new Tuple2<>(startAirportId, destAirportId), this);
    }

    public static Flight getData(String CSV){
        String[] list = CSV.replaceAll("\"", "").split(",");
        return new Flight(
                Integer.parseInt(list[START_AIRPORT_ID_IND]),
                Integer.parseInt(list[DEST_AIRPORT_ID_IND]),
                Float.parseFloat(list[DELAY_IND]),
                list[CANCELLED_IND].isEmpty()
        );
    }
}
