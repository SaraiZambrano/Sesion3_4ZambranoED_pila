
package logica_programable;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
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

// Método para recomendar productos en base a las compras anteriores
    public void recomendarProducto() {
        String sugerencia = obtenerSugerenciaBasadaEnHistorial();
        JOptionPane.showMessageDialog(null,"Basado en tus compras anteriores, te recomendamos: " + sugerencia);
    }

    // Obtiene una sugerencia en función del historial de compras o un producto aleatorio
    private String obtenerSugerenciaBasadaEnHistorial() {
        // Busca el producto más comprado
        String sugerencia = null;
        int maxCompras = 0;
        for (Map.Entry<String, Integer> entry : historialCompras.entrySet()) {
            if (entry.getValue() > maxCompras) {
                maxCompras = entry.getValue();
                sugerencia = entry.getKey();
            }
        }
        // Si no hay historial o quiere variar, sugiere uno aleatorio de la lista
        if (sugerencia == null || Math.random() < 0.3) {
            Random random = new Random();
            sugerencia = recomendaciones[random.nextInt(recomendaciones.length)];
        }
        return sugerencia;
    }
        
    
}
