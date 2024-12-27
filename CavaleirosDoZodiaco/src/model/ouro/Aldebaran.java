package model.ouro;

import model.CavaleiroOuro;

public class Aldebaran extends CavaleiroOuro {
    String constelacao = "Touro";

    public Aldebaran() {
        super("Aldebaran", 120, 60,90, 80);
    }
    public String getConstelacao() {

        return constelacao;
    }

    public void usarPoderEspecial() {

        int dano = (int) (getPontosDeAtaque() * 1.5);
        System.out.println(getNome() + " Grande Chifre" + dano + " de dano!");
    }
}
