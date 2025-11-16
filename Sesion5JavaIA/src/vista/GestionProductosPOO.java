
package vista;
import modelo.Producto;
import controlador.GestorProductos;
import java.util.Scanner;

public class GestionProductosPOO {//inicia clase
    public static void main(String[] args) {//inicia main
        Scanner entradaDato=new Scanner(System.in);//captura cualquier tipo de dato
        GestorProductos gestor = new GestorProductos();//uso y llamado de los metodos
        
        int ciclo;
        
        do {            
            System.out.println("Menú productos\n 1-Agregar\n 2-Consultar\n 3-Eliminar\n4 Salir");
            ciclo=entradaDato.nextInt();//para capturar opcion
            switch (ciclo) {
                case 1: 
                        //para alta de productos
        System.out.println("Sistema de productos\nCaptura ID:  ");
        int id=entradaDato.nextInt();
        System.out.println("Captura Nombre:");
        String nombre=entradaDato.next();
        System.out.println("Captura Precio:");
        double precio=entradaDato.nextDouble();
        System.out.println("Captura Stock: ");
        int stock =entradaDato.nextInt();
        
        gestor.agregarProducto(new Producto(id, nombre, precio, stock));//almacena datos
        
                    
                    break; 
                case 2:
                     //consultar
        gestor.listarProductos();
                break;
                case 3:
                   System.out.println("ID a buscar: ");
        Producto p=gestor.buscarPorId(entradaDato.nextInt());
        System.out.println(p !=null ? p : "Producto no encontrado");
                 System.out.println("ID a eliminar: ");
        gestor.eliminarProducto(entradaDato.nextInt());
        //consultar para actualizar
        
        gestor.listarProductos();
                break;
                case 4:  
                    System.out.println("Finalizó el programa");
                break;
                
                default:
                break;
            }
        } while (ciclo!=4);
    
       
        

    }//termina main
}//termina clase
