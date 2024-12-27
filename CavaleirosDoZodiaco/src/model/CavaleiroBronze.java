package model;

public class CavaleiroBronze implements Cavaleiro {
    private String nome;
    private int pontosDeAtaque;
    private int pontosDeDefesa;
    private int pontosDeVida;
    private int pontosDeVidaMaximo; // Adicionando um atributo para os pontos de vida máximos
    protected int xp;
    private int nivel;
    private int contadorAtaques;

    public CavaleiroBronze(String nome, int pontosDeAtaque, int pontosDeDefesa, int pontosDeVida, int i, int i1) {
        this.nome = nome;
        this.pontosDeAtaque = pontosDeAtaque;
        this.pontosDeDefesa = pontosDeDefesa;
        this.pontosDeVida = pontosDeVida;
        this.pontosDeVidaMaximo = pontosDeVida; // Inicialmente, os pontos de vida máximos são iguais aos pontos de vida atuais
        this.xp = 0; // Inicialmente, XP é 0
        this.nivel = 1; // Nível inicial
        this.contadorAtaques = 0; // Contador de ataques normais
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
        xp += quantidade;
        System.out.println(nome + " ganhou " + quantidade + " XP. Total de XP: " + xp);
        subirNivel();
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

    @Override
    public int getXPConcedido() {
        return 0;
    }

    @Override
    public void subirNivel() {
        int xpParaProximoNivel = 150 * nivel; //
        while (xp >= xpParaProximoNivel) {
            nivel++;
            xp -= xpParaProximoNivel; // Reduz a XP acumulada

            System.out.println(nome + " subiu para o nível " + nivel + "!");
            pontosDeVida = pontosDeVidaMaximo; // Restaura os pontos de vida ao subir de nível
            System.out.println(nome + " teve seus pontos de vida restaurados para " + pontosDeVida + "!");
            pontosDeAtaque *= 1.2;
            pontosDeDefesa *= 1.2;
            pontosDeVidaMaximo *= 1.2;
            status(); // Atualiza e exibe o status após subir de nível
            xpParaProximoNivel = 150 * nivel; // Atualiza a XP necessária para o próximo nível
        }
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}