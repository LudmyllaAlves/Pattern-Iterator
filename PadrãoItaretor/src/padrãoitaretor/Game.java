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
public abstract class Game implements Iterable<Play>{
     private final Play[] play;

    public Game(int qtdFases) {
        this.play = new Play [qtdFases];
        for (int i = 0; i < qtdFases; i++) {
            this.play[i] = new Play(i + 1);
        }
    }

    @Override
    public Iterator<Play> iterator() {
        return new GameIterator();
    }

    private class GameIterator implements Iterator<Play> {

        private int faseAtual;

        private GameIterator() {
            this.faseAtual = 0;
        }

        @Override
        public boolean hasNext() {
            if (this.faseAtual < play.length) {
                return true;
            }
            return false;
        }

        @Override
        public Play next() {
            if (this.hasNext()) {
                return play[faseAtual++];
            } else {
                return null;
            }
        }

    }
    
}
