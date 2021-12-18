package bmstu.iu9;

import scala.Serializable;

public class Airport implements Serializable {
    public int code;
    public String name;

    public Airport(int code, String name){
        this.code = code;
        this.name = name;
    }

    public static Airport getData(String CSV){
        String[] list = CSV.replace().split(",", 2);
        return new Airport(
                Integer.parseInt(list[0])
        );
    }
}
