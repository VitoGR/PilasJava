
package Main;

import Controlador.Logica;
import Vista.Vista;


public class Main {
    
    public static void main(String[] args) {
        
        Vista v = new Vista();
        
        Logica log = new Logica(v);
        
        
        log.iniciar();
        
        
    }
    
}
