

public class PCDes extends Device implements Web,Media,Gaming{

    public PCDes(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        super(price, serialNumber, manufacturer, productionDate, markerAR, deviceType, Name);
    }
	

	
        @Override
	public String AbrirPagina(String a){
		String n = ("El computador personal " + NAME + " esta mostrando la direccion web " + a + ".");
		return n;	
	}

        @Override
	public String playVideo(){
		String n = ("El computador personal " + NAME + " esta mostrando un video.");
		return n;	
	}
	
        @Override
	public String LetsPlayAGame(String a){
            String n = ("El usuario utiliza el computador personal " + NAME + " para jugar el videojuego "+ a + ".");
            return n;
	}

    @Override
    public String Interact() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String tomarFotos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}