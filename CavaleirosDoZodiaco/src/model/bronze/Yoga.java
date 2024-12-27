package model.bronze;

import model.CavaleiroBronze;

public class Yoga extends CavaleiroBronze {
    String constelacao = "Cisne";
    public Yoga() {
        super("Yoga", 200, 100, 140, 1, 0);
    }
    public String getConstelacao() {
        return constelacao;
    }

    public void usarPoderEspecial() {

        int dano = (int) (getPontosDeAtaque() * 1.5);
        System.out.println(getNome() + " Pó de Diamante" + dano + " de dano!");
    }
}
