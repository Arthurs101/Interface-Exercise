
import java.io.IOException;
import java.util.ArrayList;

public class Controlador{
	public void Start(){
            try {
                Database db = new Database("hello");
                ArrayList<Store> stores = db.read();
            } catch (IOException ex) {
                System.out.println("Error leyendo el archivo, operación interrumpida, intente de nuevo");
            }
	}
}