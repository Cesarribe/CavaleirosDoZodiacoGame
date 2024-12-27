package model.ouro;

import model.CavaleiroOuro;

public class Camus extends CavaleiroOuro {

    String constelacao = "Aquarios";

    public Camus() {
        super("Camus", 120, 60,90, 120);
    }
    public String getConstelacao() {
        return constelacao;
    }

    public void usarPoderEspecial() {

        int dano = (int) (getPontosDeAtaque() * 1.5);
        System.out.println(getNome() + " Execução Aurora" + dano + " de dano!");
    }
}