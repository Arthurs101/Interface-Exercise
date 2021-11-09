
import java.util.ArrayList;
import java.util.Random;
public class Carrito {
	private ArrayList<Device> compra;
        private String client;
        private String date;
        private Random r = new Random();
        
	
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
	
        //para la factura
        public String pay(){
            String bill = "Factura no: " + String.valueOf(r.nextInt(10000));
            bill += "cliente: " + client + "Fecha: " + date ;
            
            return bill;
        }
        
}