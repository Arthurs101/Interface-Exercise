/******************************************************************
Device.java
Autor: Adrian Fulladolsa Palma y Arturo Heberto Argueta Avila
Última modificación: 2021-11-09
Clase que representa un telefono fijo vendido por la tienda, hereda de la clase abstracta Device e implementa el interfaz Call.
******************************************************************/
import java.util.Scanner;



public class TelFijo extends Device implements Call{
    private Scanner scan = new Scanner(System.in);
	
	//constructor
    public TelFijo(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        super(price, serialNumber, manufacturer, productionDate, markerAR, deviceType, Name);
    }

    //Override al metodo Llamar de la interfaz Call.
    @Override
    public String Llamar(String number){
            String n = ("Se esta llamando al numero: " + number);
            return n;	
    }
	
	//Override al metodo Interact de la Clase Device.
    @Override
    public void Interact() {
		int opcion = 0;
        while (opcion != 2){ 
			System.out.println("");
			System.out.println("Interacciones posibles con Telefono Fijo");
			System.out.println("Escoja una opcion");
			System.out.println("1. Llamar");
			System.out.println("2. Salir");
			
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
					String number = "";
					while (true) {
						System.out.println("A que numero desea llamar?");
						try{
							number = scan.nextLine();
                                                        
                                                        break;
						}
						catch (Exception e) {
						System.err.println("Por favor ingrese una opcion valida");
						scan.next();
						continue;
						}
					}
					System.out.println(Llamar(number));
					break;
				case 2:
					System.out.println("Se ha dejado de interactuar con el Telefono Fijo");
					break;
			}
		}
    }
}