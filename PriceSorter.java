
import java.util.Comparator
public class PriceSorter implements Comparator<Device>{
	
	public int compare(Device a, Device b) {
		return b.getPrecio().compareToIgnoreCase(a.getPrecio());
	}
	
}