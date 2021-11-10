
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Comparator;
public class Carrito{
	private ArrayList<Device> compra = new ArrayList<>();
        private String client;
        private String date;
        private Random r = new Random();
        private final int sortype;

    public Carrito(String client, String date,int sortype) {
        this.client = client;
        this.date = date;
        this.sortype = sortype;
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
        }
        //sortear por fecha
        
        else if (i == 2){
            compra.sort( new FechaSorter());
        }

        else if (i == 3){
            compra.sort( new MarcaSorter());
        }
        
    }
    
    public ArrayList<Device> getBuy(){
            return compra;
    }

    //para la factura
    public String pay(){
        String bill = "Factura no: " + String.valueOf(r.nextInt(10000)) + " ";
        sort(sortype);
        bill += "cliente: " + client + "- Fecha: " + date + "\n";
        for(Device item: compra){
            String[] item_data = item.getData();
            String information = "";
            for(String info: item_data){
                information+= info + "-";
            }
           bill += (String.valueOf(compra.indexOf(item) +1 ) + ". " + information ) +"\n";
        }
        return bill;
    }
    
    
        
}