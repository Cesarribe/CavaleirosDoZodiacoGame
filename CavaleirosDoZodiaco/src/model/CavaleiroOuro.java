package model;


public class CavaleiroOuro implements Cavaleiro {
    private String nome;
    private int pontosDeAtaque;
    private int pontosDeDefesa;
    private int pontosDeVida;
    protected int xp; // XP do NPC
    private int nivel;
    private int contadorAtaques;

    // Adicionando um atributo para XP concedido
    private int xpConcedido;

    public CavaleiroOuro(String nome, int pontosDeAtaque, int pontosDeDefesa, int pontosDeVida, int xpConcedido) {
        this.nome = nome;
        this.pontosDeAtaque = pontosDeAtaque;
        this.pontosDeDefesa = pontosDeDefesa;
        this.pontosDeVida = pontosDeVida;
        this.xp = 0; // Inicialmente, XP é 0
        this.nivel = 1; // Nível inicial
        this.contadorAtaques = 0; // Contador de ataques normais
        this.xpConcedido = xpConcedido; // Atribui o valor de XP concedido
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getPontosDeAtaque() {
        return pontosDeAtaque;
    }

    @Override
    public int getPontosDeDefesa() {
        return pontosDeDefesa;
    }

    @Override
    public int getPontosDeVida() {
        return pontosDeVida;
    }

    @Override
    public int getXP() {
        return xp;
    }

    @Override
    public void atacar(Cavaleiro npc) {
        contadorAtaques++;
        npc.receberDano(getPontosDeAtaque());
        System.out.println(getNome() + " ataca e causa " + getPontosDeAtaque() + " de dano!");

        if (contadorAtaques >= 3) {
            usarPoderEspecial();
            contadorAtaques = 0;
        }
    }

    protected void usarPoderEspecial() {
    }

    @Override
    public void defender() {
        System.out.println(nome + " defende com " + pontosDeDefesa + " pontos de defesa!");
    }

    @Override
    public void receberDano(int dano) {
        int danoRecebido = Math.max(0, dano - pontosDeDefesa);
        pontosDeVida -= danoRecebido;
        System.out.println(nome + " recebeu " + danoRecebido + " de dano. Pontos de vida restantes: " + pontosDeVida);
    }

    @Override
    public void ganharXP(int quantidade) {

    }

    // Método que retorna a XP concedida ao ser derrotado
    public int getXPConcedido() {
        return xpConcedido;
    }

    @Override
    public void subirNivel() {

    }

    public void darXP(int quantidade) {
        xp += quantidade;
        System.out.println(nome + " ganhou " + quantidade + " XP. Total de XP: " + xp);
    }

    public void status() {
        System.out.println("Status de " + getNome() + ":");
        System.out.println("XP: " + getXP());
        System.out.println("Pontos de Vida: " + getPontosDeVida());
        System.out.println("Pontos de Ataque: " + getPontosDeAtaque());
        System.out.println("Pontos de Defesa: " + getPontosDeDefesa());
        System.out.println("Nível: " + (getNivel()));
    }

    @Override
    public boolean estaVivo() {
        return pontosDeVida > 0;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}