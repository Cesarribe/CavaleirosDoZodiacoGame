package model.ouro;

import model.CavaleiroOuro;

public class Aioros extends CavaleiroOuro {
    String constelacao = "Sagitário";

    public Aioros() {
        super("Aioros", 120, 60,90, 60);
    }
    public String getConstelacao() {
        return constelacao;
    }

    public void usarPoderEspecial() {

        int dano = (int) (getPontosDeAtaque() * 1.5);
        System.out.println(getNome() + " usa Trovão Atomico" + dano + " de dano!");
    }
}
