package jogo;

import model.Cavaleiro;

class Batalha {
    private Cavaleiro jogador;
    private Cavaleiro npc;

    public Batalha(Cavaleiro jogador, Cavaleiro npc) {
        this.jogador = jogador;
        this.npc = npc;
    }

    public void Combate() {
        System.out.println("A batalha começou!");
        while (jogador.estaVivo() && npc.estaVivo()) {
            // Jogador ataca
            jogador.atacar(npc);

            // Verifica se o NPC está vivo
            if (!npc.estaVivo()) {
                System.out.println(npc.getNome() + " foi derrotado!");
                break;
            }

            // NPC ataca
            npc.atacar(jogador);

            // Verifica se o jogador está vivo
            if (!jogador.estaVivo()) {
                System.out.println(jogador.getNome() + " foi derrotado!");
                break;
            }

            // Exibe status atual
            jogador.status();
            npc.status();
        }
    }
}
