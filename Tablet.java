
public class Tablet extends Device implements Web,Media,Portable{

    public Tablet(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        super(price, serialNumber, manufacturer, productionDate, markerAR, deviceType, Name);
    }
	

	
    public String AbrirPagina(String a){
            String n = ("La tablet " + NAME + " esta mostrando la direccion web " + a + ".");
            return n;	
    }

    public String tomarFotos(){
            String n = ("La tablet " + NAME + " ha tomado una foto.");
            return n;	
    }

    public String playVideo(){
            String n = ("La tablet " + NAME + " esta mostrando un video.");
            return n;	
    }

    public String Mover(){
            String n = ("La tablet " + NAME + " ha sido movido.");
            return n;	
    }

    @Override
    public String Interact() {
        String opcion = 0;
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
					tomarFotos();
					break;
				case 4:
					mover();
					break;
				case 5:
					System.out.println("Se ha dejado de interactuar con el Tablet");
					break;	
			}
		}
    }

    @Override
    public String mover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}