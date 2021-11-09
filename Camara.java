
public class Camara extends device implements Portable,Media{
	
	public Camara(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        this.price = price;
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.productionDate = productionDate;
        this.markerAR = markerAR;
        this.deviceType = deviceType;
        this.NAME = Name;
    }
	
	public String Mover(){
		String n = ("La camara " + NAME + " ha sido movido.");
		return n;	
	}
	
	public String tomarFotos(){
		String n = ("La camara " + NAME + " ha tomado una foto.");
		return n;	
	}
	
	public String playVideo(){
		String n = ("La camara " + NAME + " esta mostrando un video.");
		return n;	
	}
}