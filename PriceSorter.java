/******************************************************************
PriceSorter.java
Autor: Adrian Fulladolsa Palma y Arturo Heberto Argueta Avila
Última modificación: 2021-11-09
Clase que sortea un ArrayList de objetos tipo Device acorde a sus precios. Esta clase implementa el interfaz Comparator.
******************************************************************/
import java.util.Comparator;
public class PriceSorter implements Comparator<Device>{

    //Metodo que compara dispositivos por precio
    @Override
    public int compare(Device a, Device b) {
        int roundedpriceA = (int) a.getPrecio();
        int roudedpriceB = (int) b.getPrecio();
        return Integer.valueOf(roundedpriceA).compareTo(roudedpriceB);
    }
    
	
}