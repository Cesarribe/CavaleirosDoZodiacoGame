package model.ouro;

import model.CavaleiroOuro;

public class Saga extends CavaleiroOuro {
    String constelacao = "Gemeos";

    public Saga() {
        super("Saga", 120, 60,90, 90);
    }
    public String getConstelacao() {
        return constelacao;
    }

    public void usarPoderEspecial() {

        int dano = (int) (getPontosDeAtaque() * 1.5);
        System.out.println(getNome() + " Explosão Galática " + dano + " de dano!");
    }
}
