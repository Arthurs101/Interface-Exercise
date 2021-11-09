

public class TelCel extends TelFijo implements Portable{

    public TelCel(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        super(price, serialNumber, manufacturer, productionDate, markerAR, deviceType, Name);
    }

    @Override
    public String mover(){
            String n = ("El telefono " + NAME + " ha sido movido.");
            return n;	
    }

    @Override
    public String Interact() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}