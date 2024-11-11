
package colachatbot;


public class ChatBot {//inicia clase
    
    public String generaRespuesta(String pregunta){//inicia
        pregunta=pregunta.toLowerCase();
        if (pregunta.contains("hola") || pregunta.contains("hi")) {//para saludar
            return "Hola Soy IA Mi amo es Zambrano!. ¿En que puedo ayudarte?";
            
        } else if(pregunta.contains("¿como estas?")) {
             return "Estoy aqui para ayudarte. ¿En que puedo ayudarte?";
        } else if(pregunta.contains("tu nombre")) {
            return "Soy una maquina inteigente escilista en programacion JAVA";
            
        } else if(pregunta.contains("¿que puedes hacer?")) {
            return "Puedo Programar en forma estructurada, OO, OE, OA, RX y mas"
                    +"\nAdemas de responder pregutas y gestinar"
                    +"\nConsultas en orden de llegada";
        }else if(pregunta.contains("hora")) {
            return "Aun no tengo esa programacion, puedes preguntar otra cosa";
        }else{
            return "No entiendo tu pregunta, puedes preguntar de otra forma";
        }
        
    }//termina
    
}//termina clase
