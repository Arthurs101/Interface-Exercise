
import java.util.ArrayList;
import java.util.Random;
import java.util.Comparator;
public class Carrito{
	private ArrayList<Device> compra;
        private String client;
        private String date;
        private Random r = new Random();

    public Carrito(String client, String date) {
        this.client = client;
        this.date = date;
    }
        
	
    public String addDevice(Device a){
        compra.add(a);
        String n = ("Usted a agregado " + a.getNAME() + " al carrito.");
        return n;
    }

    public String subDevice(int a){
        String n = ("Usted a eliminado " + compra.get(a).getNAME() + " al carrito.");
        compra.remove(a);
        return n;
    }
    
    public void sort(int i){
		//sortear por precio
		if (i == 1){
			compra.sort(new PriceSorter());
			return compra;
		}
		//sortear por fecha
		else if (i == 2){
			compra.sort( new FechaSorter());
			return compra;
		}
		
		else if (i == 3){
			compra.sort( new MarcaSorter());
			return compra;
		}
    }
    
    public ArrayList<Device> getBuy(){
            return compra;
    }

    //para la factura
    public String pay(){
        String bill = "Factura no: " + String.valueOf(r.nextInt(10000));
        bill += "cliente: " + client + "- Fecha: " + date ;
        //aca iría el for para todos los objetos
        return bill;
    }
        
}