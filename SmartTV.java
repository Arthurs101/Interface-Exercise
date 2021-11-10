
public class SmartTV extends Device implements Web,Media{

    public SmartTV(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        super(price, serialNumber, manufacturer, productionDate, markerAR, deviceType, Name);
    }
	

        @Override
	public String AbrirPagina(String a){
		String n = "La Smart TV " + NAME + " esta mostrando la direccion web " + a + ".";
		return n;	
	}
	
        @Override
	public String tomarFotos(){
            return "";
	}
	
        @Override
	public String playVideo(){
		String n = ("La Smart Tv " + NAME + " esta mostrando un video.");
		return n;	
	}

    @Override
    public String Interact() {
        String opcion = 0;
        while (opcion != 3){ 
			System.out.println("");
			System.out.println("Interacciones posibles con SmartTV");
			System.out.println("Escoja una opcion");
			System.out.println("1. Abrir pagina web");
			System.out.println("4. Ver video");
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
					System.out.println("Se ha dejado de interactuar con el SmartTV");
					break;
			}
		}
    }
	
	
}