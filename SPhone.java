/******************************************************************
SPhone.java
Autor: Adrian Fulladolsa Palma y Arturo Heberto Argueta Avila
Última modificación: 2021-11-09
Clase que representa un Smartphone vendido por la tienda, hereda de la clase TelCel e implementa las interfaces Media y Web.
******************************************************************/
import java.util.Scanner;


public class SPhone extends TelCel implements Media,Web{
    private Scanner scan = new Scanner(System.in);
	
	//constructor
    public SPhone(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        super(price, serialNumber, manufacturer, productionDate, markerAR, deviceType, Name);
    }

	//Override al metodo tomarFotos de la interfaz Media.
    @Override
    public String tomarFotos(){
            String n = ("El Smartphone " + NAME + " ha tomado una foto.");
            return n;	
    }

	//Override al metodo playVideo de la interfaz Media.
    @Override
    public String playVideo(){
            String n = ("El Smartphone " + NAME + " esta mostrando un video.");
            return n;	
    }

	//Override al metodo AbirPagina de la interfaz Web.
    @Override
    public String AbrirPagina(String a){
            String n = ("El Smartphone " + NAME + " esta mostrando la direccion web " + a + ".");
            return n;	
    }
	
	//Override al metodo Interact de la Clase Device.
	@Override
    public void Interact() {
        int opcion = 0;
        while (opcion != 6){ 
			System.out.println("");
			System.out.println("Interacciones posibles con Smartphone");
			System.out.println("Escoja una opcion");
			System.out.println("1. Llamar");
			System.out.println("2. Mover");
			System.out.println("3. Tomar Foto");
			System.out.println("4. Ver video");
			System.out.println("5. Abrir pagina web");
			System.out.println("6. Salir");
			
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
						System.out.println("A que numbero desea llamar?");
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
                                        System.out.println(tomarFotos());
					break;
				case 4:
                                        System.out.println(playVideo());
					break;
				case 5:
					String pagina = "";
					while (true) {
						System.out.println("Que pagina web desea visitar?");
						try{
							pagina = scan.nextLine();
                                                        
                                                        break;
                                                }catch (Exception e) {
						System.err.println("Por favor ingrese una opcion valida");
						scan.next();
						continue;
						}
					}
					System.out.println(AbrirPagina(pagina));
					break;
				case 6:
					System.out.println("Se ha dejado de interactuar con el Smartphone");
					break;
			}
		}
    }
}