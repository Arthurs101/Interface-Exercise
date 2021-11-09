

import java.util.Comparator
public class MarcaSorter implements Comparator<Device>{

	public int compare(Device a, Device b) {
		return b.getMarca().compareToIgnoreCase(a.getMarca());
	}
}