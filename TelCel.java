

public class TelCel extends TelFijo implements Portable{
	
	public TelCel(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        this.price = price;
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.productionDate = productionDate;
        this.markerAR = markerAR;
        this.deviceType = deviceType;
        this.NAME = Name;
    }
	
	public String Mover(){
		String n = ("El telefono " + NAME + " ha sido movido.");
		return n;	
	}
}