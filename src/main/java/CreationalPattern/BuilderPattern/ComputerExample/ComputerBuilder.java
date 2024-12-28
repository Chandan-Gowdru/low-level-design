package CreationalPattern.BuilderPattern.ComputerExample;

public class ComputerBuilder {
    //required parameters
    private String HDD;
    private String RAM;

    // Optional parameters
    private boolean isGraphicCardEnabled;
    private boolean isWifiEnabled;

    // Build the constructor for required params
    public ComputerBuilder(String HDD, String RAM) {
        this.HDD = HDD;
        this.RAM = RAM;
    }

    // Method for optional params
    public ComputerBuilder setGraphicCardEnabled(boolean isGraphicCardEnabled) {
        this.isGraphicCardEnabled = isGraphicCardEnabled;
        return this;
    }

    // Method for optional params
    public ComputerBuilder setWifiEnabled(boolean isWifiEnabled) {
        this.isWifiEnabled = isWifiEnabled;
        return this;
    }

    //return computer object
    public Computer build() {
        return new Computer(HDD,RAM,isGraphicCardEnabled,isWifiEnabled);
    }
}