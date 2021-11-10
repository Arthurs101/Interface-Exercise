
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;


public class Controlador{
    public void Start(){
         ArrayList<Store> stores = new ArrayList<>();
         Display dp = new Display();
        try {
            Database db = new Database(dp.Directory());
            stores = db.read();
        } catch (IOException ex) {
            System.out.println("Error leyendo el archivo, operación interrumpida, cerrando programa");
            System.exit(0);
        }
        Store elected = null;
        if(!stores.isEmpty()){
            boolean error = true; 
            while(error){
                try {
                    int election = dp.selectStore(stores);
                    elected = stores.get(election -1);
                    error = false;
                }
                catch(InputMismatchException ie){
                    dp.show("ha ingresado una letra en vez de un número");
                }
                catch (IndexOutOfBoundsException e) {
                    dp.show("entrada no válida");
                }
                catch(Exception general){
                    dp.show("error inesperado"); 
                }
                
            }
        }
        //crear el carrito de compras
        boolean Failed = true;
        String[] user_data = null;
        do{
            try{
                user_data = dp.CostumerData();
                Failed = false; 
            }catch(InputMismatchException ei){
                dp.show("ha ingresado una letra, intente de nuevo");
                dp.Error();
            }catch(Exception e){
                dp.show("Error Inesperado");
                dp.Error();
            }
            
        }while(Failed);
        
        Carrito costumer = new Carrito(user_data[0], user_data[1], Integer.valueOf(user_data[2]));
        //loop del menú
        boolean buying = true;
        while(buying){
            try {
                int menu = dp.Menu();
                switch(menu){
                case 1->{//agregar e interactuar con el dispositivo
                    ArrayList<Device> searched = new ArrayList<>();//dispositivos que sean de la categoría a buscar
                    int type = dp.search();
                    String search = "";
                    switch(type){
                        case 1://Smartphones
                            search ="smartphone";
                            break;
                        case 2://celulares
                            search = "cellphone"; 
                            break;
                        case 3://celular fijo
                            search = "telefono fijo";
                            break;
                        case 4: //camaras fotográficas
                            search = "camara";
                            break;
                        case 5://Laptop
                            search = "Laptop";
                            break;
                        case 6://Desktop
                            search = "Desktop";
                            break;
                        case 7://Smart TV
                            search = "SmartTV";
                            break;
                        case 8://tablets
                            search = "tablet";
                            break;
                        case 9://smartwatch
                            search = "smartwatch";
                            break;
                        default:
                            dp.show("Opción no valida");
                    }
                    ArrayList<Device> stuff = elected.getInventario();
                    
                    for(Device dev: stuff ){
                        if(dev.getType().equals(search)){
                            searched.add(dev);
                        }
                    }
                    if(searched.isEmpty()){
                        dp.show("Sin resusltados");
                    }else{
                        int item_index = dp.selectItem(searched) -1;
                        try {
                            Device device_interacting = searched.get(item_index);
                            //dp.show(device_interacting.Interact());
                            boolean flag = true;//preguntar si desea añadir el artículo, si no coloca algo válido preguntarle de nuevo
                            while(flag){
                                try{
                                    switch(dp.addItem()){
                                    case 1:
                                        costumer.addDevice(device_interacting);
                                        flag = false;
                                        dp.show("dispositivo agregado");
                                        break;
                                    case 2:
                                        flag = false;
                                        break;
                                    default:
                                        dp.show("entrada no válida");
                                    }
                                } catch(InputMismatchException letter){
                                    dp.show("ha ingresado una letra, intente de nuevo");
                                    dp.Error();
                                }
                            }
                        } catch (IndexOutOfBoundsException e) {
                            dp.show("entrada no válida");
                        }
                    }
                    break;
                }

                case 2 ->{//remover articulo
                    dp.show("Se removerá el dispositivo que elija");
                    if(!costumer.getBuy().isEmpty()){
                    int remove = dp.selectItem(costumer.getBuy());
                    dp.show(costumer.subDevice(remove -1));
                    }
                    break;
                }
                case 3->{//pagar y cerrar
                    if(!costumer.getBuy().isEmpty()){
                        dp.show(costumer.pay());
                    }
                    buying = false;
                    dp.show("Vuelva pronto");
                    break;
                    }
                }
            }
            catch (InputMismatchException e) {
                dp.show("error ha ingresado una letra en lugar de un número");
                dp.Error();
            }
        }
    }
}
 
