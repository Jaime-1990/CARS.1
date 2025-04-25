import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Car implements Serializable{
    private String make;
    private int year;
    private static final long serialVersionUIO = 1L;
    private transient String model;
    public  Car (String make, int year, String model) {
        this.make = make;
        this.year = year;
        this.model = model;
    }

    @Override
    public String toString() {
        String carInfo = "";
        carInfo += "\n Brand: " + this.make;
        carInfo += "\nYear: " + this.year;
        carInfo += "\n Model: " + this.model;
        return carInfo;
    }

}
