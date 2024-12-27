package model;

public interface Cavaleiro {
    String getNome();
    int getPontosDeAtaque();
    int getPontosDeDefesa();
    int getPontosDeVida();
    int getXP();

    void atacar(Cavaleiro npc);
    void defender();
    void receberDano(int dano);
    void ganharXP(int quantidade);
    void status();
    boolean estaVivo();
    public int getXPConcedido();
    void subirNivel();


}
