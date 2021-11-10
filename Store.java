/******************************************************************
Store.java
Autor: Adrian Fulladolsa Palma y Arturo Heberto Argueta Avila
Última modificación: 2021-11-09
Clase que representa una tienda de Electronica Latinoamericana.
******************************************************************/
import java.util.ArrayList;
public class Store{
	
	//Variables de clase
	private String name;
	private String adress;
	private String country;
	private String city;
	private ArrayList<Device> inventario;
	
	//constructor
	public Store(String name, String adress, String country, String city, ArrayList<Device> productos){
            this.name = name;
            this.adress = adress;
            this.country = country;
            this.city = city;
            this.inventario = productos;
	}
	
	//Metodos getter que regresan las variables de la clase
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