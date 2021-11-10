/******************************************************************
Device.java
Autor: Adrian Fulladolsa Palma y Arturo Heberto Argueta Avila
Última modificación: 2021-11-09
Clase abstracta que modela todos los dispositivos vendidos por las tiendas.
******************************************************************/
public abstract class Device {
    protected double price;
    protected String serialNumber;
    protected String manufacturer;
    protected String productionDate;
    protected String markerAR;
    protected String deviceType;
    protected String NAME; 
    //constructor
    public Device(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        this.price = price;
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.productionDate = productionDate;
        this.markerAR = markerAR;
        this.deviceType = deviceType;
        this.NAME = Name;
    }
    //Metodos Getters que al ser ejecutados regresan variables de la clase
    public String[] getData(){
        String[] me = new  String[6];
        me[0] = NAME;
        me[1] = manufacturer;
        me[2] = serialNumber;
        me[3] = "fecha de producción: " + productionDate;
        me[4] = "código: " + markerAR;
        me[5] = "Precio: Q" + String.valueOf(price);
        return me;
    }
    
    public String getType(){
        return deviceType;
    }

    public String getNAME() {
        return NAME;
    }
    
    
    public double getPrecio() {
    return price;
    }
	
	public String getFecha() {
        return productionDate;
    }
	
	public String getMarca() {
        return manufacturer;
    }
	//Metodo abstracto que representa la interaccion del usuario con un dispositivo
	public abstract void Interact();
	
	
    
}

