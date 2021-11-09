
public class Camara extends Device implements Portable,Media{

    public Camara(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        super(price, serialNumber, manufacturer, productionDate, markerAR, deviceType, Name);
    }	
    @Override
    public String mover(){
            String n = ("La camara " + NAME + " ha sido movido.");
            return n;	
    }

    @Override
    public String tomarFotos(){
            String n = ("La camara " + NAME + " ha tomado una foto.");
            return n;	
    }

    @Override
    public String playVideo(){
            String n = ("La camara " + NAME + " esta mostrando un video.");
            return n;	
    }

    @Override
    public String Interact() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}