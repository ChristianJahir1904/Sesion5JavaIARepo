package controlador;
import java.util.ArrayList;
import modelo.Producto;//llamada del paquete modell y clase producto
import java.util.List;


public class GestorProductos {//inicia clase
    //arraylist como un almacenamiento
    List<Producto> productos = new ArrayList<>();
    
    public void agregarProducto(Producto p){//inicia método agregar objetos producto
        productos.add(p);//agrega objetos producto a la lista
    }
    
    public void listarProductos(){//inicia metodo consultar
        if (productos.isEmpty()) {//si está vacia la lista
            System.out.println("No hay productos registrados :(");
            return;          
        }
        productos.forEach(System.out:: println);
    
    }//termina metodo consuktar
    
    public Producto buscarPorId(int id) {//inicia metodo buscar por campo id
        for (Producto p : productos) {
            if (p.getId()== id){ //inicia if
                return p;
            }//termina if
        
        }
        return null;
    }//termina metodo
    
    public void eliminarProducto(int id){//termina metodo eliminar
        Producto p= buscarPorId(id);
        if (p !=null) {
            productos.remove(p);
            System.out.println("Producto eliminado siuu");
        } else {
            System.out.println("Error no existe producto ;(");
        }
    
    }//termina metodo eliminar
}//termina clase


