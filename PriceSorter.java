
import java.util.Comparator;
public class PriceSorter implements Comparator<Device>{

    
    @Override
    public int compare(Device a, Device b) {
        int roundedpriceA = (int) a.getPrecio();
        int roudedpriceB = (int) b.getPrecio();
        return Integer.valueOf(roundedpriceA).compareTo(roudedpriceB);
    }
    
	
}