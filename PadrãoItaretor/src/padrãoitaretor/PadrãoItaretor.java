/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrãoitaretor;

import java.util.Iterator;

/**
 *
 * @author tatia
 */
public class PadrãoItaretor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Game jogo = new GameLOT();
        
        Iterator<Play> jogarLOT = jogo.iterator();
        
        while(jogarLOT.hasNext()){
            Play L = jogarLOT.next();
            L.Iniciar();
        }
    }
    }
    

