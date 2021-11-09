

public class TelFijo extends Device implements Call{

    public TelFijo(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        super(price, serialNumber, manufacturer, productionDate, markerAR, deviceType, Name);
    }

    
    @Override
    public String Llamar(String number){
            String n = ("Se esta llamando al numero: " + number);
            return n;	
    }

    @Override
    public String Interact() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}