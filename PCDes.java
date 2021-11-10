
import java.util.Scanner;

public class PCDes extends Device implements Web,Media,Gaming{
    private Scanner scan = new Scanner(System.in);
    public PCDes(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        super(price, serialNumber, manufacturer, productionDate, markerAR, deviceType, Name);
    }
	

	
        @Override
	public String AbrirPagina(String a){
		String n = ("El computador personal " + NAME + " esta mostrando la direccion web " + a + ".");
		return n;	
	}

        @Override
	public String playVideo(){
		String n = ("El computador personal " + NAME + " esta mostrando un video.");
		return n;	
	}
	
        @Override
	public String LetsPlayAGame(String a){
            String n = ("El usuario utiliza el computador personal " + NAME + " para jugar el videojuego "+ a + ".");
            return n;
	}

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

    @Override
    public String tomarFotos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}