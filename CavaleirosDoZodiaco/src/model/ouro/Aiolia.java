package model.ouro;

import model.CavaleiroOuro;

public class Aiolia extends CavaleiroOuro {
    String constelacao = "Leão";

    public Aiolia() {
        super("Aiolia", 120, 60,90, 60);
    }
    public String getConstelacao() {
        return constelacao;
    }

    public void usarPoderEspecial() {

        int dano = (int) (getPontosDeAtaque() * 1.5);
        System.out.println(getNome() + " usa Relampago de Plasma" + dano + " de dano!");
    }
}
