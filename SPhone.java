
public class SPhone extends TelCel implements Media,Web{

    public SPhone(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        super(price, serialNumber, manufacturer, productionDate, markerAR, deviceType, Name);
    }

    @Override
    public String tomarFotos(){
            String n = ("El Smartphone " + NAME + " ha tomado una foto.");
            return n;	
    }

    @Override
    public String playVideo(){
            String n = ("El Smartphone " + NAME + " esta mostrando un video.");
            return n;	
    }

    @Override
    public String AbrirPagina(String a){
            String n = ("El Smartphone " + NAME + " esta mostrando la direccion web " + a + ".");
            return n;	
    }
	
	@Override
    public String Interact() {
        String opcion = 0;
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
						}
						catch (Exception e) {
						System.err.println("Por favor ingrese una opcion valida");
						scan.next();
						continue;
						}
					}
					Llamar(number);
					break;
				case 2:
					mover();
					break;
				case 3:
					tomarFotos();
					break;
				case 4:
					playVideo();
					break;
				case 5:
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
				case 6:
					System.out.println("Se ha dejado de interactuar con el Smartphone");
					break;
			}
		}
    }
}