

public class PCDes extends device implements Web,Media,Gaming{
	
	public PCDes(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        this.price = price;
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.productionDate = productionDate;
        this.markerAR = markerAR;
        this.deviceType = deviceType;
        this.NAME = Name;
    }
	
	public String AbrirPagina(String a){
		String n = ("El computador personal " + NAME + " esta mostrando la direccion web " + a ".");
		return n;	
	}
	/*
	public String tomarFotos(){
			
	}
	*/
	public String playVideo(){
		String n = ("El computador personal " + NAME + " esta mostrando un video.");
		return n;	
	}
	
	public String LetsPlayAGame(String a){
		String n = ("El usuario utiliza el computador personal " + NAME + " para jugar el videojuego "+ a + ".");
		return n;
	}
}