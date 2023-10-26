package elena5hilopriorizante;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Elena5HiloPriorizante {
    public static void main(String[] args) throws InterruptedException {
        
        // Caso A : con join
        
        /*
        hiloMayor hiloMayor = new hiloMayor("mayor");
        hiloMenor hiloMenor = new hiloMenor("menor");
        
        hiloMayor.start();
        hiloMayor.join();
        hiloMenor.start();
        */
        
        // Caso B : con prioridades
        
        hiloMayor hiloMayor = new hiloMayor("mayor");
        hiloMenor hiloMenor = new hiloMenor("menor");
        
        
        int mayor = 10; // el limite superior es 10
        int menor = 1; // el limite inferior es 1
        hiloMayor.setPriority(mayor);
        hiloMenor.setPriority(menor);
        
        hiloMayor.start();
        hiloMenor.start();
        
    }
}

class hiloMenor extends Thread {

    public hiloMenor(String nombre) {
        super(nombre);
    }
    public void run() {
        System.out.println("Soy el menor y debo respetar a los mayores");
        
    }
}

class hiloMayor extends Thread{
    
    
    public hiloMayor(String nombre) {
        super(nombre);
    }
    
    
    public void run() {
        
        System.out.println("Soy el Mayor y mi trabajo es oprimir al menor");
        
    }
}
