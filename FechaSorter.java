

import java.util.Comparator
public class FechaSorter implements Comparator<Device>{

	public int compare(Device a, Device b) {
		return b.getFecha().compareToIgnoreCase(a.getFecha());
	}
}