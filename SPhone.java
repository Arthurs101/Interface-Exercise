
public class SPhone extends TelCel implements Media,Web{
	
	public SPhone(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        this.price = price;
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.productionDate = productionDate;
        this.markerAR = markerAR;
        this.deviceType = deviceType;
        this.NAME = Name;
    }
	
	public String tomarFotos(){
		String n = ("El Smartphone " + NAME + " ha tomado una foto.");
		return n;	
	}
	
	public String playVideo(){
		String n = ("El Smartphone " + NAME + " esta mostrando un video.");
		return n;	
	}
	
	public String AbrirPagina(String a){
		String n = ("El Smartphone " + NAME + " esta mostrando la direccion web " + a ".");
		return n;	
	}
}