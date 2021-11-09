

public class TelFijo extends Device implements Call{
	
	public TelFijo(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        this.price = price;
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.productionDate = productionDate;
        this.markerAR = markerAR;
        this.deviceType = deviceType;
        this.NAME = Name;
    }
	
	public String Llamar(String number){
		String n = ("Se esta llamando al numero: " + number);
		return n;	
	}
}