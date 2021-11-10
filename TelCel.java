

public class TelCel extends TelFijo implements Portable{

    public TelCel(double price, String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType, String Name) {
        super(price, serialNumber, manufacturer, productionDate, markerAR, deviceType, Name);
    }

    @Override
    public String mover(){
            String n = ("El telefono " + NAME + " ha sido movido.");
            return n;	
    }

    @Override
    public String Interact() {
        String opcion = 0;
        while (opcion != 3){ 
			System.out.println("");
			System.out.println("Interacciones posibles con Telefono Celular");
			System.out.println("Escoja una opcion");
			System.out.println("1. Llamar");
			System.out.println("2. Mover");
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
					String number = "";
					while (true) {
						System.out.println("A que numero desea llamar?");
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
					System.out.println("Se ha dejado de interactuar con el Telefono Celular");
					break;
			}
		}
    }

   
}