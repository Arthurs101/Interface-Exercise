

public class Watch extends Device implements Call,Media,Portable{

    public Watch(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        super(price, serialNumber, manufacturer, productionDate, markerAR, deviceType, Name);
    }
	

	
    @Override
    public String tomarFotos(){
            String n = ("La tablet " + NAME + " ha tomado una foto.");
            return n;	
    }


    @Override
    public String playVideo(){
            return "";
    }

    @Override
    public String mover(){
            String n = ("La tablet " + NAME + " ha sido movido.");
            return n;	
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