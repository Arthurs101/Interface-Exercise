/******************************************************************
Database.java
Autor: Adrian Fulladolsa Palma y Arturo Heberto Argueta Avila
Última modificación: 2021-11-09
Clase que lee el archivo json con los datos de las tiendas y sus inventarios.
******************************************************************/
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Database{
	
	//Variables de clase
    private final String directory;
    public Database(String directory) {
        this.directory = directory;
    }
    
	//Metodo que lee un archivo JSon y guarda en un ArrayList
    public ArrayList<Store> read() throws IOException{
        ArrayList<Store> Stores  = new ArrayList<>();
        JSONParser Stored = new JSONParser();//lector del arvhivo JSON
        try{
            JSONArray json = (JSONArray) Stored.parse(new FileReader(directory + "DATA.json"));
            for(Object store: json){
                //crear el objeto referente a las tiendas
                JSONObject STORE = (JSONObject) store;
                ArrayList<Device> products = new ArrayList<>();
                //obtener el array de los productos
                JSONArray devices = (JSONArray) STORE.get("products");
                for(Object device:devices){//obtener todos los objetos de tipo dispositivo
                    JSONObject DEVICE = (JSONObject) device;
                    double price = (double) DEVICE.get("price");
                    String model = (String)  DEVICE.get("Model");
                    String brand = (String)  DEVICE.get("brand");
                    String fdate = (String)  DEVICE.get("fabric");
                    String barcode = (String)  DEVICE.get("barcode");
                    String type = (String)DEVICE.get("type");
                    String name = (String)  DEVICE.get("name");
                    
                    switch(type){//crear el objeto según su tipo
                        case "TV":
                            type = "SmartTV";
                            SmartTV TV = new SmartTV(price, model, brand, fdate, barcode,type, name);
                            products.add(TV);
                            break;
                        case "cellphone":
                            TelCel cp = new TelCel(price, model, brand, fdate, barcode,type, name);
                            products.add(cp);
                            break;
                        case "smartphone":
                            SPhone sp = new SPhone(price, model, brand, fdate, barcode,type, name);
                            products.add(sp);
                            break;
                        case "phone":
                            type = "telefono fijo";
                            TelFijo tp = new TelFijo(price, model, brand, fdate, barcode,type, name);
                            products.add(tp);
                            break;
                        case "tablet":
                            Tablet ta = new Tablet(price, model, brand, fdate, barcode,type, name);
                            products.add(ta);
                            break;
                        case "smartwatch":
                            Watch sw = new Watch(price, model, brand, fdate, barcode,type, name);
                            products.add(sw);
                            break;
                        case "Laptop":
                            PCLap lp = new PCLap(price, model, brand, fdate, barcode,type, name);
                            products.add(lp);
                            break;
                        case "Desktop":
                            PCDes pc = new PCDes(price, model, brand, fdate, barcode,type, name);
                            products.add(pc);
                            break;
                        case "camara":
                            Camara c = new Camara(price, model, brand, fdate, barcode,type, name);
                            products.add(c);
                            break;
                    }
                }
                Store shop = new Store((String) STORE.get("name"), (String) STORE.get("adress"), (String) STORE.get("country"), (String) STORE.get("city"), products);
                Stores.add(shop);
            }
        }catch(FileNotFoundException nf){
            System.out.println("Directorio Erróneo, cerrando programa");
            System.exit(0);
        } catch (ParseException ex) {
            System.out.println("Error, el archivo está dañado");
            System.out.println("Intente regresar al estado original el archivo e intente de nuevo");
            System.exit(0);
        }
        return Stores;
    }	
}