//Es una clase logica de negocio -programacion contiene los metodos de operaciones de las colas
package sesion3_6Zambrano_cola1;

import javax.swing.JOptionPane;


public class OperacionesColas {
    //Stributos y caracteristicas de las colas principales
    
    private int frente;
    private int fin;
    protected Object[] listaCola;
    //constructor que inicializa los componentes principales de las colas
    
    public OperacionesColas(int tamMax){
        this.frente=0;
        this.fin=-1;
        listaCola = new Object[tamMax];
        
    }//Costructor
    
    //metodo para insertar los elementos de la estructura cola
    public void insertar(Object dato)throws Exception{
        if (!colaLlena()) {
            fin++;
            listaCola[fin]= dato;
            
        } else {
            JOptionPane.showMessageDialog(null, "Error 1 al insertar : cola llena");
        }
    }//terimina metodo para insertar
    
    //metodo para identificar cola llena
    public boolean colaLlena(){
        int tamMax=0;
        return fin== tamMax-1;
        
    }
    
    //tamaño de la ED cola
    public int tamMax(){
        return listaCola.length;
    }//Termina
    
    //metodo para imprimir elementos de la cola
    public void imprimir (){
        for (int i = 0; i < tamMax(); i++) {
            Object datoActual = listaCola[i];
            
            if (datoActual != null) {
                JOptionPane.showMessageDialog(null, datoActual+" : ");
                
            }
            
        }
    }
    
}
