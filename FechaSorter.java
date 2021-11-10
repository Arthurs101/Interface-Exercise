/******************************************************************
FechaSorter.java
Autor: Adrian Fulladolsa Palma y Arturo Heberto Argueta Avila
Última modificación: 2021-11-09
Clase que sortea un ArrayList de objetos tipo Device acorde a sus fechas de manufactura. Esta clase implementa el interfaz Comparator.
******************************************************************/

import java.util.Comparator;
public class FechaSorter implements Comparator<Device>{
	
	//Metodo que compara dispositivos por la fecha de manufactura
	public int compare(Device a, Device b) {
		return b.getFecha().compareToIgnoreCase(a.getFecha());
	}
}