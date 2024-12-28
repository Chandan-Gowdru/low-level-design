package CreationalPattern.BuilderPattern.ComputerExample;

public class ComputerTest {
    public static void main(String[] args) {

        //chaining the methods which are optional
        Computer officeComputer = new ComputerBuilder("500 GB","4 GB")
                .setGraphicCardEnabled(true)
                .build();
        System.out.println(officeComputer);

        Computer gamingComputer = new ComputerBuilder("1 TB","16 GB")
                .setWifiEnabled(true)
                .build();
        System.out.println(gamingComputer);

    }
}
