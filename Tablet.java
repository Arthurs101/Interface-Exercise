
import java.util.Scanner;


public class Tablet extends Device implements Web,Media,Portable{
    private Scanner scan = new Scanner(System.in);
    public Tablet(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        super(price, serialNumber, manufacturer, productionDate, markerAR, deviceType, Name);
    }
	

	
    @Override
    public String AbrirPagina(String a){
            String n = ("La tablet " + NAME + " esta mostrando la direccion web " + a + ".");
            return n;	
    }

    @Override
    public String tomarFotos(){
            String n = ("La tablet " + NAME + " ha tomado una foto.");
            return n;	
    }

    @Override
    public String playVideo(){
            String n = ("La tablet " + NAME + " esta mostrando un video.");
            return n;	
    }

    @Override
    public String mover(){
            String n = ("La tablet " + NAME + " ha sido movido.");
            return n;	
    }

    @Override
    public void Interact() {
        int opcion = 0;
        while (opcion != 5){ 
			System.out.println("");
			System.out.println("Interacciones posibles con Tablet");
			System.out.println("Escoja una opcion");
			System.out.println("1. Abrir pagina web");
			System.out.println("2. Ver video");
			System.out.println("3. Tomar foto");
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
					System.out.println(tomarFotos());
					break;
				case 4:
					System.out.println(mover());
					break;
				case 5:
					System.out.println("Se ha dejado de interactuar con el Tablet");
					break;	
			}
		}
    }
}