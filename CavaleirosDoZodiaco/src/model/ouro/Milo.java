package model.ouro;

import model.CavaleiroOuro;

public class Milo extends CavaleiroOuro {
    String constelacao = "Cancer";

    public Milo() {
        super("Milo", 120, 60,90, 70);
    }

    public String getConstelacao() {
        return constelacao;
    }

    public void usarPoderEspecial() {

        int dano = (int) (getPontosDeAtaque() * 1.5);
        System.out.println(getNome() + " Agulha Escarlate" + dano + " de dano!");
    }
}
