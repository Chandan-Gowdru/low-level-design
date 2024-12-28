package CreationalPattern.BuilderPattern.CarExample;

public class CarTest {
    public static void main(String[] args) {
        // Building a luxury car
        Car luxuryCar = new CarBuilder("V8 Engine", "Automatic")
                .setColor("Black")
                .setNumberOfSeats(5)
                .setHasGPS(true)
                .setHasSunroof(true)
                .setAdditionalFeature("Heated Seats")
                .setAdditionalFeature("Premium Sound System")
                .build();

        System.out.println(luxuryCar);

        // Building a basic car
        Car basicCar = new CarBuilder("V4 Engine", "Manual")
                .setColor("White")
                .build();

        System.out.println(basicCar);
    }
}
