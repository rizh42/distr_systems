package bmstu.iu9;

import scala.Serializable;
import scala.Tuple2;

public class Airport implements Serializable {
    public int code;
    public String name;

    public Airport(int code, String name){
        this.code = code;
        this.name = name;
    }

    public static Airport getData(String CSV){
        String[] list = CSV.replace("\"", "").split(",", 2);
        return new Airport(
                Integer.parseInt(list[0]),
                list[1]
        );
    }

    public final Tuple2<Integer, String> getTupleAirport(){
        return new Tuple2<>()
    }
}
