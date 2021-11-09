

public class Watch extends device implements Call,Media,Portable{
	
	public Watch(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        this.price = price;
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.productionDate = productionDate;
        this.markerAR = markerAR;
        this.deviceType = deviceType;
        this.NAME = Name;
    }
	
	
	public String tomarFotos(){
		String n = ("La tablet " + NAME + " ha tomado una foto.");
		return n;	
	}
	
	/*
	public String playVideo(){
		String n = ("La tablet " + NAME + " esta mostrando un video.");
		return n;	
	}
	*/
	
	public String Mover(){
		String n = ("La tablet " + NAME + " ha sido movido.");
		return n;	
	}
	
	public String Llamar(String number){
		String n = ("Se esta llamando al numero: " + number);
		return n;	
	}
}