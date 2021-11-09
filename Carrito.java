

public class Carrito {
	private ArrayList<Device> compra;
	
	public String addDevice(Device a){
		compra.add(a);
		String n = ("Usted a agregado " + a.getName() + " al carrito.");
		return n;
	}
	
	public String subDevice(Device a){
		compra.remove(a);
		String n = ("Usted a eliminado " + a.getName() + " al carrito.");
		return n;
	}
	/*
	public void sort(int i){
		
	}
	*/
	public ArrayList<Device> getDevice(){
		return compra;
	}
	
}