
public class SmartTV extends Device implements Web,Media{

    public SmartTV(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        super(price, serialNumber, manufacturer, productionDate, markerAR, deviceType, Name);
    }
	

        @Override
	public String AbrirPagina(String a){
		String n = "La Smart TV " + NAME + " esta mostrando la direccion web " + a + ".";
		return n;	
	}
	
        @Override
	public String tomarFotos(){
            return "";
	}
	
        @Override
	public String playVideo(){
		String n = ("La Smart Tv " + NAME + " esta mostrando un video.");
		return n;	
	}

    @Override
    public String Interact() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	
}