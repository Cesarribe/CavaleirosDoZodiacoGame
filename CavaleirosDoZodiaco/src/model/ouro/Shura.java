package model.ouro;

import model.CavaleiroOuro;

public class Shura extends CavaleiroOuro {
    String constelacao = "Capricornio";

    public Shura() {
        super("Shura", 120, 60,90, 30);
    }
    public String getConstelacao() {
        return constelacao;
    }

    public void usarPoderEspecial() {

        int dano = (int) (getPontosDeAtaque() * 1.5);
        System.out.println(getNome() + " Excalibur " + dano + " de dano!");
    }
}
