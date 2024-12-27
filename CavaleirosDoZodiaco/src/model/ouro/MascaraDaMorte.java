package model.ouro;

import model.CavaleiroOuro;

public class MascaraDaMorte extends CavaleiroOuro {
    String constelacao = "Cancer";

    public MascaraDaMorte() {
        super("Mascara da Morte", 120, 60,90, 50);
    }

    public String getConstelacao() {
        return constelacao;
    }

    public void usarPoderEspecial() {

        int dano = (int) (getPontosDeAtaque() * 1.5);
        System.out.println(getNome() + " Ondas do inferno" + dano + " de dano!");
    }
}
