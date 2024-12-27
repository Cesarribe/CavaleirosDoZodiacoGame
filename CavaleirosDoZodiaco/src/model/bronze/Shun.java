package model.bronze;

import model.CavaleiroBronze;

public class Shun extends CavaleiroBronze {
    String constelacao = "Andromeda";
    public Shun() {
        super("Shun", 120, 250, 180, 1, 0);
    }
    public String getConstelacao() {
        return constelacao;
    }

    public void usarPoderEspecial() {

        int dano = (int) (getPontosDeAtaque() * 1.5);
        System.out.println(getNome() + " Corrente de Andromeda" + dano + " de dano!");
    }
}
