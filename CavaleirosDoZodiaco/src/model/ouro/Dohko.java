package model.ouro;

import model.CavaleiroOuro;

public class Dohko extends CavaleiroOuro {
    String constelacao = "Libra";

    public Dohko() {
        super("Dohko", 120, 60,90, 40);
    }
    public String getConstelacao() {
        return constelacao;
    }

    public void usarPoderEspecial() {

        int dano = (int) (getPontosDeAtaque() * 1.5);
        System.out.println(getNome() + " Colera dos 100 Dragoes" + dano + " de dano!");
    }}
