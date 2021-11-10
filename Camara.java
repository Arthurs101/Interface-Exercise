/******************************************************************
Camara.java
Autor: Adrian Fulladolsa Palma y Arturo Heberto Argueta Avila
Última modificación: 2021-11-09
Clase que representa una Camara Fotografica vendida por la tienda, hereda de la clase abstracta Device e implementa las interfaces Portable y Media.
******************************************************************/
import java.util.Scanner;


public class Camara extends Device implements Portable,Media{
    private Scanner scan = new Scanner(System.in);
	
	//constructor
    public Camara(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        super(price, serialNumber, manufacturer, productionDate, markerAR, deviceType, Name);
    }	
	
	//Override al metodo mover de la interfaz Portable.
    @Override
    public String mover(){
            String n = ("La camara " + NAME + " ha sido movido.");
            return n;	
    }

	//Override al metodo tomarFotos de la interfaz Media.
    @Override
    public String tomarFotos(){
            String n = ("La camara " + NAME + " ha tomado una foto.");
            return n;	
    }

	//Override al metodo playVideo de la interfaz Media.
    @Override
    public String playVideo(){
            String n = ("La camara " + NAME + " esta mostrando un video.");
            return n;	
    }

	//Override al metodo Interact de la Clase Device.
    @Override
    public void Interact() {
         int opcion = 0;
        while (opcion != 4){ 
			System.out.println("");
			System.out.println("Interacciones posibles con Camara fotografica");
			System.out.println("Escoja una opcion");
			System.out.println("1. Tomar foto");
			System.out.println("2. Ver video");
			System.out.println("3. Mover");
			System.out.println("4. Salir");
			
			while (true) {
				try{
					opcion = scan.nextInt(); 
					break;
				}
				catch (Exception e) {
					System.err.println("Por favor ingrese una opcion valida");
					scan.next();
					continue;
				}
			}
			switch (opcion) {
				case 1:
					System.out.println(tomarFotos());
					break;
				case 2:
					 System.out.println(playVideo());
					break;
				case 3:
					System.out.println(mover());
					break;
				case 4:
					System.out.println("Se ha dejado de interactuar con el Computador Personal");
					break;	
			}
		}
    }


}