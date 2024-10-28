
package sesion3_4zambranoed_pilas;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author LISUACM
 */
public class Sesion3_4ZambranoED_pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de pila
        Stack<Integer> pilaZambrano = new Stack<>();
        
       pilaZambrano.push(100);
       pilaZambrano.push(150);
       pilaZambrano.push(230);
       pilaZambrano.push(10);
       pilaZambrano.push(160);
       
        JOptionPane.showMessageDialog(null, "Datos en pila ordenada es :\n"+pilaZambrano);
        
        JOptionPane.showMessageDialog(null, "Autor: Zambrano Sarai");
    }
    
}
