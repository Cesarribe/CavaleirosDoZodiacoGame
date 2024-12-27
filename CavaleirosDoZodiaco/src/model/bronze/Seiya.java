package model.bronze;

import model.CavaleiroBronze;

public class Seiya extends CavaleiroBronze {

    private String constelacao = "Pegasus";

    public Seiya() {
        super("Seiya", 180, 140, 200, 1, 0);
    }

    public String getConstelacao() {
        return constelacao;
    }

    public void usarPoderEspecial() {

        int dano = (int) (getPontosDeAtaque() * 1.5);
        System.out.println(getNome() + " usa Meteoro de Pégaso e causa " + dano + " de dano!");
    }
}
