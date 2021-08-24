/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrãoitaretor;

/**
 *
 * @author tatia
 */
public class Play {
    private final int fase;

    public Play(int fase) {
        this.fase = fase;
    }
    
    public void Iniciar(){
        System.out.println(String.format(" Jogando fase: %d", this.fase));
    }
    
}
