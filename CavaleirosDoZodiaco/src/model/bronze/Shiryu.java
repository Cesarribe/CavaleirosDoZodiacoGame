package model.bronze;

import model.CavaleiroBronze;

public class Shiryu extends CavaleiroBronze {

    String constelacao = "Dragao";

    public Shiryu() {
        super("Shiryu", 180, 110, 150, 1, 0);
        }

        public String getConstelacao() {
            return constelacao;
        }

        public void usarPoderEspecial() {

            int dano = (int) (getPontosDeAtaque() * 1.5);
            System.out.println(getNome() + " usa Colera do Dragao e causa " + dano + " de dano!");
        }

    }

