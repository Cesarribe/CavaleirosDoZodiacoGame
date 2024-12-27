package model.bronze;

import model.CavaleiroBronze;

public class Ikki extends CavaleiroBronze {
    String constelacao = "Fenix";
    public Ikki() {
        super("Ikki", 200, 110, 200, 1, 0);
    }
    public String getConstelacao() {

        return constelacao;
    }

    public void usarPoderEspecial() {

        int dano = (int) (getPontosDeAtaque() * 1.5);
        System.out.println(getNome() + " usa Avê Fenix" + dano + " de dano!");
    }
}
