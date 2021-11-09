
public class Tablet extends Device implements Web,Media,Portable{

    public Tablet(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        super(price, serialNumber, manufacturer, productionDate, markerAR, deviceType, Name);
    }
	

	
    public String AbrirPagina(String a){
            String n = ("La tablet " + NAME + " esta mostrando la direccion web " + a + ".");
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

    @Override
    public String Interact() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String mover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}