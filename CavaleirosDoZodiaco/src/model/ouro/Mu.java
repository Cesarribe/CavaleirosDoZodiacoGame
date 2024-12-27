package model.ouro;

import model.CavaleiroOuro;

public class Mu extends CavaleiroOuro {
    String constelacao = "Aries";

    public Mu() {
        super("Mu", 100, 50,90, 100);
    }
    public String getConstelacao() {
        return constelacao;
    }

    public void usarPoderEspecial() {

        int dano = (int) (getPontosDeAtaque() * 1.5);
        System.out.println(getNome() + " Revolução Estelar" + dano + " de dano!");
    }
}
