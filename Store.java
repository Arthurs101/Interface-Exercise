
import java.util.ArrayList;
public class Store{
	private String name;
	private String adress;
	private String country;
	private String city;
	private ArrayList<Device> inventario;
	
	
	public Store(String name, String adress, String country, String city, ArrayList<Device> productos){
            this.name = name;
            this.adress = adress;
            this.country = country;
            this.city = city;
            this.inventario = productos;
	}
	
	public String getName(){
		return name;
	}
	
	public String getAdress(){
		return adress;
	}
	
	public String getCountry(){
		return country;
	}
	
	public String getCity(){
		return city;
	}
	
	public ArrayList<Device> getInventario(){
		return inventario;
	}
}