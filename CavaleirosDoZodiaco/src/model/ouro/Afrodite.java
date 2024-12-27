package model.ouro;

import model.CavaleiroOuro;

public class Afrodite extends CavaleiroOuro {
    String constelacao = "Peixes";
    public Afrodite() {
        super("Afrodite", 120, 60,90, 30);
    }
    public String getConstelacao() {
        return constelacao;
    }

    public void usarPoderEspecial() {

        int dano = (int) (getPontosDeAtaque() * 1.5);
        System.out.println(getNome() + " usa Rosas Diabolicas Reais" + dano + " de dano!");
    }
}
