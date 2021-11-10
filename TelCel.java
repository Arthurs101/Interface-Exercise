/******************************************************************
TelCel.java
Autor: Adrian Fulladolsa Palma y Arturo Heberto Argueta Avila
Última modificación: 2021-11-09
Clase que representa un telefono celular vendido por la tienda, hereda de la clase abstracta TelFijo e implementa el interfaz Portable.
******************************************************************/
import java.util.Scanner;



public class TelCel extends TelFijo implements Portable{
    private Scanner scan = new Scanner(System.in);
	
	//constructor
    public TelCel(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        super(price, serialNumber, manufacturer, productionDate, markerAR, deviceType, Name);
    }

	//Override al metodo mover de la interfaz Portable.
    @Override
    public String mover(){
            String n = ("El telefono " + NAME + " ha sido movido.");
            return n;	
    }

	//Override al metodo Interact de la Clase Device.
    @Override
    public void Interact() {
        int opcion = 0;
        while (opcion != 3){ 
			System.out.println("");
			System.out.println("Interacciones posibles con Telefono Celular");
			System.out.println("Escoja una opcion");
			System.out.println("1. Llamar");
			System.out.println("2. Mover");
			System.out.println("3. Salir");
			
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
							number = scan.next();
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
					System.out.println(mover());
					break;
				case 3:
					System.out.println("Se ha dejado de interactuar con el Telefono Celular");
					break;
			}
		}
    }

   
}