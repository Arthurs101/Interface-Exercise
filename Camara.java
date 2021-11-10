
public class Camara extends Device implements Portable,Media{

    public Camara(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        super(price, serialNumber, manufacturer, productionDate, markerAR, deviceType, Name);
    }	
    @Override
    public String mover(){
            String n = ("La camara " + NAME + " ha sido movido.");
            return n;	
    }

    @Override
    public String tomarFotos(){
            String n = ("La camara " + NAME + " ha tomado una foto.");
            return n;	
    }

    @Override
    public String playVideo(){
            String n = ("La camara " + NAME + " esta mostrando un video.");
            return n;	
    }

    @Override
    public String Interact() {
         String opcion = 0;
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
					tomarFotos();
					break;
				case 2:
					playVideo();
					break;
				case 3:
					mover();
					break;
				case 4:
					System.out.println("Se ha dejado de interactuar con el Computador Personal");
					break;	
			}
		}
    }


}