import java.util.Scanner;
import java.util.ArrayList;
public class Display {
    Scanner intscan = new Scanner(System.in);//para números
    Scanner strscan = new Scanner(System.in);//para texto
    public int selectStore(ArrayList<Store> a){//menu de selección de tienda
        System.out.println("seleccione la tienda a visitar");
        for(Store buy:a){
            String message = String.valueOf(a.indexOf(buy)+1) + "\t";
            message += buy.getName() + " " + buy.getCountry() + " " + buy.getCity();
            System.out.println(message);
        }
        return intscan.nextInt();
    }
    public void show(String a){
        System.out.println(a);
    }
    public int Menu(){
        System.out.println("1. Agregar Artículo (puede interactuar con el producto)");
        System.out.println("2. Remover artículo");
        System.out.println("3. Pagar y salir");
        return intscan.nextInt();
    }
    public String[] CostumerData(){
        String[] costumerData = new String[3];
        System.out.println("ingrese su nombre");
        costumerData[0] = strscan.nextLine();
        System.out.println("ingrese la fecha de hoy dia/mes/año");
        costumerData[1] = strscan.nextLine();
        System.out.println("seleccione el tipo de ordenamiento de su factura");
        System.out.println("1. por precio");
        System.out.println("2. por fecha");
        System.out.println("3. por marca");
        costumerData[2] = String.valueOf(intscan.nextInt());
        return costumerData;
    }
    public int search(){
        System.out.println("1. Smartphones");
        System.out.println("2. Teléfonos Celulares");
        System.out.println("3. Teléfonos fijos");
        System.out.println("4. Cámaras fotográficas");
        System.out.println("5. Computador Personal (Laptop)");
        System.out.println("6. Computador Personal (Desktop) ");
        System.out.println("7. Smart TV ");
        System.out.println("8. Tablets");
        System.out.println("9. Smartwatch ");
        return intscan.nextInt();
    }
    public int selectItem(ArrayList<Device> a){
        System.out.println("Elige el dispositivo");
        for(Device item: a){
            String[] item_data = item.getData();
            String information = "";
            for(String info: item_data){
                information+= info + "-";
            }
            System.out.println(String.valueOf(a.indexOf(item) +1 ) + ". " + information );
        }
        return intscan.nextInt();
    }
    public int addItem(){
        System.out.println("desea agregar el dispositivo a su lista de compras?");
        System.out.println("1. si");
        System.out.println("2. no");
        return intscan.nextInt();
    }
    public void Error(){
        intscan.next();
    }
    public String Directory(){
        System.out.println("ingrese la ubicación del arvhivo DATA.json jemploe c:\\users\\downloads\\");
        return strscan.nextLine();
    }
}
