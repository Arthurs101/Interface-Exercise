
public abstract class Device {
    protected double price;
    protected String serialNumber;
    protected String manufacturer;
    protected String productionDate;
    protected String markerAR;
    protected String deviceType;
    protected String NAME; 
    //constructor
    public Device(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        this.price = price;
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.productionDate = productionDate;
        this.markerAR = markerAR;
        this.deviceType = deviceType;
        this.NAME = Name;
    }
    
    public String[] getData(){
        String[] me = new  String[7];
        return me;
    }
    
    
    
    
}

