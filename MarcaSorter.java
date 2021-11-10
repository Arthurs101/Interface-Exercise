/******************************************************************
MarcaSorterSorter.java
Autor: Adrian Fulladolsa Palma y Arturo Heberto Argueta Avila
Última modificación: 2021-11-09
Clase que sortea un ArrayList de objetos tipo Device acorde a sus marcas. Esta clase implementa el interfaz Comparator.
******************************************************************/

import java.util.Comparator;
public class MarcaSorter implements Comparator<Device>{

	//Metodo que compara dispositivos por la marca
	public int compare(Device a, Device b) {
		return b.getMarca().compareToIgnoreCase(a.getMarca());
	}
}