/******************************************************************
Watch.java
Autor: Adrian Fulladolsa Palma y Arturo Heberto Argueta Avila
Última modificación: 2021-11-09
Clase que representa un SmartWatch vendido por la tienda, hereda de la clase abstracta Device e implementa las interfaces Call, Media, Portable y Web.
******************************************************************/
import java.util.Scanner;



public class Watch extends Device implements Call,Media,Portable,Web{
    private Scanner scan = new Scanner(System.in);
	
	//constructor
    public Watch(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        super(price, serialNumber, manufacturer, productionDate, markerAR, deviceType, Name);
    }
	

	//Override al metodo tomarFotos de la interfaz Media.
    @Override
    public String tomarFotos(){
            String n = ("El SmartWatch " + NAME + " ha tomado una foto.");
            return n;	
    }


	//Override al metodo playVideo de la interfaz Media.
    @Override
    public String playVideo(){
            return "";
    }

	//Override al metodo mover de la interfaz Portable.
    @Override
    public String mover(){
            String n = ("El Smartwatch " + NAME + " ha sido movido.");
            return n;	
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
        while (opcion != 5){ 
			System.out.println("");
			System.out.println("Interacciones posibles con SmartWatch");
			System.out.println("Escoja una opcion");
			System.out.println("1. Tomar foto");
			System.out.println("2. Abrir pagina web");
			System.out.println("3. Ver video");
			System.out.println("4. Mover");
			System.out.println("5. Salir");
			
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
					tomarFotos();
					break;
				case 2:
					String pagina = "";
					while (true) {
						System.out.println("Que pagina web desea visitar?");
						try{
							pagina = scan.next();
                                                        break;
						}
						catch (Exception e) {
						System.err.println("Por favor ingrese una opcion valida");
						scan.next();
						continue;
						}
					}
                                        System.out.println(AbrirPagina(pagina));
					break;
				case 3:
                                        System.out.println(playVideo());
					break;
				case 4:
                                        System.out.println(mover());
					break;
				case 5:
					System.out.println("Se ha dejado de interactuar con el SmartWatch");
					break;	
			}
		}
    }

	//Override al metodo AbirPagina de la interfaz Web.
    @Override
    public String AbrirPagina(String a) {
        return "Abriendo página web: " + a; 
    }

 
}