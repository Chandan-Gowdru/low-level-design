package CreationalPattern.BuilderPattern.CarExample;

import java.util.ArrayList;
import java.util.List;

public class CarBuilder {

    private String engine;
    private String transmission;
    private String color; // Optional
    private int numberOfSeats = 4; // Default value
    private boolean hasGPS = false; // Default value
    private boolean hasSunroof = false; // Default value
    private final List<String> additionalFeatures = new ArrayList<>(); // Default empty list

    public CarBuilder(String engine,String transmission){
        this.engine = engine;
        this.transmission =transmission;
    }

    public CarBuilder setColor(String color){
        this.color = color;
        return this;
    }

    public  CarBuilder setNumberOfSeats(int numberOfSeats){
        this.numberOfSeats = numberOfSeats;
        return this;
    }

    public CarBuilder setHasGPS(boolean hasGPS){
        this.hasGPS =hasGPS;
        return this;
    }

    public CarBuilder setHasSunroof(boolean hasSunroof){
        this.hasSunroof = hasSunroof;
        return this;
    }
    public CarBuilder setAdditionalFeature(String additionalFeature){
        this.additionalFeatures.add(additionalFeature);
        return this;
    }
     public Car build(){
        return new Car(engine,transmission,color,numberOfSeats,hasGPS,hasSunroof,additionalFeatures);
     }
}
