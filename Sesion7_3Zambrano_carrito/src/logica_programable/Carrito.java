
package logica_programable;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import javax.swing.JOptionPane;


public class Carrito {
    
    //declaracion de estructura de datos dinamicos
	private Stack<String> carrito;
	private Map<String, Integer> historialCompras;
	//base de conocimiento
	private String [] recomendaciones={"Leche", "pan", "Huevo", "tortila", "arroz","frijol", "Azucar"};
	
	//constructor inicializar las estructuras de datos dinamicos

    public Carrito() {
        carrito=new Stack<>();
	historialCompras=new HashMap<>();
    }
	 
		
	
	
	//actividades de mantenimiento de info
	public void agregarProducto(String producto){
		carrito.push(producto);
		historialCompras.put(producto,historialCompras.getOrDefault(producto, 0)+1);
		JOptionPane.showMessageDialog(null, "Agregado de productos con exito "+producto);
}

//Metodo para imprimir 
public void mostarCarrito(){
    if (carrito.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Carrito Vacio");
        
    } else {
        JOptionPane.showMessageDialog(null, "Productos en el carrito:");
        
        for (String producto : carrito) {
            JOptionPane.showMessageDialog(null, "Productos en el carrito:\n"+producto);
            
        }
    }
}

//metodo para eliminar un elemento de stack
public void eliminarUltimoproducto(){
    if (!carrito.isEmpty()) {
        String producto = carrito.pop();
        JOptionPane.showMessageDialog(null, "Productos eliminado:\n"+producto);
        
    } else {
        JOptionPane.showMessageDialog(null, "Carrito vacio");
    }
}//termina metodo eliminar
        
    
}
