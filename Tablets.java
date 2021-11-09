
public class Tablet extends device implements Web,Media,Portable{
	
	public Tablet(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        this.price = price;
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.productionDate = productionDate;
        this.markerAR = markerAR;
        this.deviceType = deviceType;
        this.NAME = Name;
    }
	
	public String AbrirPagina(String a){
		String n = ("La tablet " + NAME + " esta mostrando la direccion web " + a ".");
		return n;	
	}
	
	public String tomarFotos(){
		String n = ("La tablet " + NAME + " ha tomado una foto.");
		return n;	
	}
	
	public String playVideo(){
		String n = ("La tablet " + NAME + " esta mostrando un video.");
		return n;	
	}
	
	public String Mover(){
		String n = ("La tablet " + NAME + " ha sido movido.");
		return n;	
	}
}