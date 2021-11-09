
public class PCLap extends PCDes implements Portable{

    public PCLap(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        super(price, serialNumber, manufacturer, productionDate, markerAR, deviceType, Name);
    }
	

	
    @Override
    public String mover(){
            String n = ("El computador personal " + NAME + " ha sido movido.");
            return n;	
    }

}
