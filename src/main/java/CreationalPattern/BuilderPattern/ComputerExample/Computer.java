package CreationalPattern.BuilderPattern.ComputerExample;

public class Computer {
    //required parameters
    private String HDD;
    private String RAM;

    //Optional parameters
    private boolean isGraphicCardEnabled;
    private boolean isWifiEnabled;

    //make the constructor as private or package-private
    Computer(String HDD, String RAM, boolean isGraphicCardEnabled, boolean isWifiEnabled){
        this.HDD = HDD;
        this.RAM = RAM;
        this.isGraphicCardEnabled = isGraphicCardEnabled;
        this.isWifiEnabled = isWifiEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isGraphicCardEnabled=" + isGraphicCardEnabled +
                ", isWifiEnabled=" + isWifiEnabled +
                '}';
    }
}
