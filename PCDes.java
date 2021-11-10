/******************************************************************
PCDes.java
Autor: Adrian Fulladolsa Palma y Arturo Heberto Argueta Avila
Última modificación: 2021-11-09
Clase que representa una computadora personal desktop vendido por la tienda, hereda de la clase abstracta Device e implementa las interfaces Web, Media y Gaming.
******************************************************************/
import java.util.Scanner;


public class PCDes extends Device implements Web,Media,Gaming{
    private Scanner scan = new Scanner(System.in);
	
	//constructor
    public PCDes(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        super(price, serialNumber, manufacturer, productionDate, markerAR, deviceType, Name);
    }
	

	//Override al metodo AbirPagina de la interfaz Web.
        @Override
	public String AbrirPagina(String a){
		String n = ("El computador personal " + NAME + " esta mostrando la direccion web " + a + ".");
		return n;	
	}

	//Override al metodo playVideo de la interfaz Media.
        @Override
	public String playVideo(){
		String n = ("El computador personal " + NAME + " esta mostrando un video.");
		return n;	
	}
	//Override al metodo LetsPlayAGame de la interfaz Gaming.
        @Override
	public String LetsPlayAGame(String a){
            String n = ("El usuario utiliza el computador personal " + NAME + " para jugar el videojuego "+ a + ".");
            return n;
	}

	//Override al metodo Interact de la Clase Device.
    @Override
    public void Interact() {
        int opcion = 0;
        while (opcion != 4){ 
			System.out.println("");
			System.out.println("Interacciones posibles con Computador Personal");
			System.out.println("Escoja una opcion");
			System.out.println("1. Abrir pagina web");
			System.out.println("2. Ver video");
			System.out.println("3. Jugar videojuego");
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
				case 2:
					System.out.println(playVideo());
					break;
				case 3:
					String videojuego = "";
					while (true) {
						System.out.println("Que videojuego desea jugar?");
						try{
							videojuego = scan.next();
                                                        break;
						}
						catch (Exception e) {
						System.err.println("Por favor ingrese una opcion valida");
						scan.next();
						continue;
						}
					}
					System.out.println(LetsPlayAGame(videojuego));
					break;
				case 4:
					System.out.println("Se ha dejado de interactuar con el Computador Personal");
					break;	
			}
		}
    }

	//Override al metodo tomarFotos de la interfaz Media.
    @Override
    public String tomarFotos() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}