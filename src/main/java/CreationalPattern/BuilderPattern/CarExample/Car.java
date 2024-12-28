package CreationalPattern.BuilderPattern.CarExample;

import java.util.List;

public class Car {

    private String engine;
    private String transmission;
    private String color; // Optional String
    private int numberOfSeats; // Optional int
    private boolean hasGPS; // Optional boolean
    private boolean hasSunroof; // Optional boolean
    private List<String> additionalFeatures; // Optional List

    Car(String engine, String transmission,String color,int numberOfSeats,boolean hasGPS,boolean hasSunroof,List<String> additionalFeatures ){
        this.engine = engine;
        this.transmission = transmission;
        this.color = color;
        this.numberOfSeats = numberOfSeats;
        this.hasGPS = hasGPS;
        this.hasSunroof = hasSunroof;
        this.additionalFeatures = additionalFeatures;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                ", color='" + color + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", hasGPS=" + hasGPS +
                ", hasSunroof=" + hasSunroof +
                ", additionalFeatures=" + additionalFeatures +
                '}';
    }
}
