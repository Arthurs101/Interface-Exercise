
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
        String[] me = new  String[6];
        me[0] = NAME;
        me[1] = manufacturer;
        me[2] = serialNumber;
        me[3] = "fecha de producción: " + productionDate;
        me[4] = "código: " + markerAR;
        me[5] = "Precio: Q" + String.valueOf(price);
        return me;
    }
    
    public String getType(){
        return deviceType;
    }

    public String getNAME() {
        return NAME;
    }
    
    public abstract String Interact();
    
    public double getPrecio() {
    return price;
    }
	
	public String getFecha() {
        return productionDate;
    }
	
	public String getMarca() {
        return manufacturer;
    }
	
	
    
}

