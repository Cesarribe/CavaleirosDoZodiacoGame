package model.ouro;

import model.CavaleiroOuro;

public class Shaka extends CavaleiroOuro {
    String constelacao = "Virgem";

    public Shaka() {
        super("Shaka", 120, 60,90, 50);
    }
    public String getConstelacao() {
        return constelacao;
    }

    public void usarPoderEspecial() {

        int dano = (int) (getPontosDeAtaque() * 1.5);
        System.out.println(getNome() + " Rendição Divina " + dano + " de dano!");
    }
}
