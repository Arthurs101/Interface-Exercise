

public class Watch extends Device implements Call,Media,Portable{

    public Watch(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        super(price, serialNumber, manufacturer, productionDate, markerAR, deviceType, Name);
    }
	

	
    @Override
    public String tomarFotos(){
            String n = ("La tablet " + NAME + " ha tomado una foto.");
            return n;	
    }


    @Override
    public String playVideo(){
            return "";
    }

    @Override
    public String mover(){
            String n = ("La tablet " + NAME + " ha sido movido.");
            return n;	
    }
	
    @Override
    public String Llamar(String number){
            String n = ("Se esta llamando al numero: " + number);
            return n;	
    }

    @Override
    public String Interact() {
        String opcion = 0;
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
						}
						catch (Exception e) {
						System.err.println("Por favor ingrese una opcion valida");
						scan.next();
						continue;
						}
					}
					AbrirPagina(pagina);
					break;
				case 3:
					playVideo();
					break;
				case 4:
					mover();
					break;
				case 5:
					System.out.println("Se ha dejado de interactuar con el SmartWatch");
					break;	
			}
		}
    }

 
}