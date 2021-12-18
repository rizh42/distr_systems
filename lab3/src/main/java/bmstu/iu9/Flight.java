package bmstu.iu9;

import java.io.Serializable;

public class Flight implements Serializable {
    public int startAirportId;
    public int destAirportId;
    public float delayed;
    public boolean cancelled;

    public static int START_AIRPORT_ID_IND = 11;
    public static int DEST_AIRPORT_ID_IND = 14;
    public static int DELAY_IND = 17;
    public static int CANCELLED_IND = 19;

    public Flight(int startAirportId, int destAirportId, float delayed, )
}
