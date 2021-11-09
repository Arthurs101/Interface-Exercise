
public class SmartTV extends device implements Web,Media{
	
	public SmartTV(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        this.price = price;
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.productionDate = productionDate;
        this.markerAR = markerAR;
        this.deviceType = deviceType;
        this.NAME = Name;
    }
	
	public String AbrirPagina(String a){
		String n = ("La Smart TV " + NAME + " esta mostrando la direccion web " + a ".");
		return n;	
	}
	/*
	public String tomarFotos(){
			
	}
	*/
	public String playVideo(){
		String n = ("La Smart Tv " + NAME + " esta mostrando un video.");
		return n;	
	}
	
	
}