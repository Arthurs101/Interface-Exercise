
public class SPhone extends TelCel implements Media,Web{

    public SPhone(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        super(price, serialNumber, manufacturer, productionDate, markerAR, deviceType, Name);
    }
	

	
        @Override
	public String tomarFotos(){
		String n = ("El Smartphone " + NAME + " ha tomado una foto.");
		return n;	
	}
	
        @Override
	public String playVideo(){
		String n = ("El Smartphone " + NAME + " esta mostrando un video.");
		return n;	
	}
	
        @Override
	public String AbrirPagina(String a){
		String n = ("El Smartphone " + NAME + " esta mostrando la direccion web " + a + ".");
		return n;	
	}
}