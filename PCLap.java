
public class PCLap extends PCDes implements Portable{

    public PCLap(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        super(price, serialNumber, manufacturer, productionDate, markerAR, deviceType, Name);
    }
	

	
    @Override
    public String mover(){
            String n = ("El computador personal " + NAME + " ha sido movido.");
            return n;	
    }
	
	@Override
    public String Interact() {
        String opcion = 0;
        while (opcion != 5){ 
			System.out.println("");
			System.out.println("Interacciones posibles con Computador Personal");
			System.out.println("Escoja una opcion");
			System.out.println("1. Abrir pagina web");
			System.out.println("2. Ver video");
			System.out.println("3. Jugar videojuego");
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
						}
						catch (Exception e) {
						System.err.println("Por favor ingrese una opcion valida");
						scan.next();
						continue;
						}
					}
					AbrirPagina(pagina);
					break;
				case 2:
					playVideo();
					break;
				case 3:
					String videojuego = "";
					while (true) {
						System.out.println("Que videojuego desea jugar?");
						try{
							videojuego = scan.next();
						}
						catch (Exception e) {
						System.err.println("Por favor ingrese una opcion valida");
						scan.next();
						continue;
						}
					}
					LetsPlayAGame(videojuego);
					break;
				case 4:
					mover();
					break;
				case 5:
					System.out.println("Se ha dejado de interactuar con el Computador Personal");
					break;	
			}
		}
    }

}
