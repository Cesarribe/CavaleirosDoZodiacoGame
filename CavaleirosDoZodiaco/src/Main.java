import model.Cavaleiro;
import model.bronze.*;
import model.ouro.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean menuInicial = true;
        Thread thread = new Thread(new ImprimirComPausa("Iniciando a Batalha...", 3000));
        Thread thread2 = new Thread(new ImprimirComPausa("Iniciando a Batalha...", 3000));
        Thread thread3 = new Thread(new ImprimirComPausa("Iniciando a Batalha...", 3000));
        Thread thread4 = new Thread(new ImprimirComPausa("Iniciando a Batalha...", 3000));
        Thread thread5 = new Thread(new ImprimirComPausa("Iniciando a Batalha...", 3000));
        Thread thread6 = new Thread(new ImprimirComPausa("Iniciando a Batalha...", 3000));
        Thread thread7 = new Thread(new ImprimirComPausa("Iniciando a Batalha...", 3000));
        Thread thread8 = new Thread(new ImprimirComPausa("Iniciando a Batalha...", 3000));
        Thread thread9 = new Thread(new ImprimirComPausa("Iniciando a Batalha...", 3000));
        Thread thread10 = new Thread(new ImprimirComPausa("Iniciando a Batalha...", 3000));
        Thread thread11 = new Thread(new ImprimirComPausa("Iniciando a Batalha...", 3000));
        Thread thread12 = new Thread(new ImprimirComPausa("Iniciando a Batalha...", 3000));


        //fazer um metodo Combate
        // Encapsular as batalhas


        Cavaleiro cavaleiroEscolhido = null;

        // Loop de Escolha do usuário
        do {
            System.out.println("**** A Batalha das 12 casas ****");
            System.out.println("Seja bem vindo ao jogo, você tem 1 chance");
            System.out.println("E apenas 1 chance de Salvar Saori e com ela todo o Mundo");
            System.out.println("");
            System.out.println("Vamos começar escolhendo o seu personagem: ");
            System.out.println("Digite 1 para Ikki");
            System.out.println("Digite 2 para Seiya");
            System.out.println("Digite 3 para Shiryu");
            System.out.println("Digite 4 para Shun");
            System.out.println("Digite 5 para Yoga");
            int MenuCavaleiros = scan.nextInt();

            switch (MenuCavaleiros) {
                case 1:
                    System.out.println("Você escolheu a opção Ikki.");
                    cavaleiroEscolhido = new Ikki();
                    cavaleiroEscolhido.status();
                    menuInicial = false;
                    break;
                case 2:
                    System.out.println("Você escolheu a opção Seiya.");
                    cavaleiroEscolhido = new Seiya();
                    cavaleiroEscolhido.status();
                    menuInicial = false;
                    break;
                case 3:
                    System.out.println("Você escolheu a opção Shiryu.");
                    cavaleiroEscolhido = new Shiryu();
                    cavaleiroEscolhido.status();
                    menuInicial = false;
                    break;
                case 4:
                    System.out.println("Você escolheu a opção Shun.");
                    cavaleiroEscolhido = new Shun();
                    cavaleiroEscolhido.status();
                    menuInicial = false;
                    break;
                case 5:
                    System.out.println("Você escolheu a opção Yoga.");
                    cavaleiroEscolhido = new Yoga();
                    cavaleiroEscolhido.status();
                    menuInicial = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }


        } while (menuInicial); // fim do loop de escolha do usuário

        thread.start();

        try {
            thread.join(); // Espera a thread terminar
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Cavaleiro npc = new Mu();
        System.out.println("A batalha começou");


        if (cavaleiroEscolhido.estaVivo()) { // Verifica se o jogador ainda está vivo
            while (cavaleiroEscolhido.estaVivo() && npc.estaVivo()) {
                cavaleiroEscolhido.atacar(npc);
                if (!npc.estaVivo()) {
                    System.out.println(npc.getNome() + " foi derrotado");
                    System.out.println(" ");
                    cavaleiroEscolhido.ganharXP(npc.getXPConcedido()); // Jogador ganha XP
                    cavaleiroEscolhido.status();
                    System.out.println(" ");
                    break; // Sai do loop se o NPC for derrotado
                }

                npc.atacar(cavaleiroEscolhido);
                if (!cavaleiroEscolhido.estaVivo()) {
                    System.out.println(cavaleiroEscolhido.getNome() + " foi derrotado");
                    System.out.println("Fim do jogo."); // Mensagem de fim de jogo
                    return; // Encerra o método atual, saindo do jogo
                }
            }
            System.out.println(" ");
            System.out.println(" Fase 2 ");
            thread2.start();

            try {
                thread2.join(); // Espera a thread terminar
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Cavaleiro npc2 = new Aldebaran();

            System.out.println("Seu segundo Desafio será contra Aldebaran da casa de Touro");
            System.out.println("A batalha começou");


            if (cavaleiroEscolhido.estaVivo()) { // Verifica se o jogador ainda está vivo
                while (cavaleiroEscolhido.estaVivo() && npc2.estaVivo()) {
                    cavaleiroEscolhido.atacar(npc2);
                    if (!npc2.estaVivo()) {
                        System.out.println(npc2.getNome() + " foi derrotado");
                        cavaleiroEscolhido.ganharXP(npc2.getXPConcedido()); // Jogador ganha XP
                        cavaleiroEscolhido.status();
                        break; // Sai do loop se o NPC for derrotado
                    }

                    npc2.atacar(cavaleiroEscolhido);
                    if (!cavaleiroEscolhido.estaVivo()) {
                        System.out.println(cavaleiroEscolhido.getNome() + " foi derrotado");
                        System.out.println("Fim do jogo."); // Mensagem de fim de jogo
                        return; // Encerra o método atual, saindo do jogo
                    }
                }


                System.out.println(" ");
                System.out.println(" Fase 3 ");
                thread3.start();

                try {
                    thread3.join(); // Espera a thread terminar
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Cavaleiro npc3 = new Saga();

                System.out.println("Seu segundo Desafio será contra Saga da casa de Gemeos");
                System.out.println("A batalha começou");


                if (cavaleiroEscolhido.estaVivo()) { // Verifica se o jogador ainda está vivo
                    while (cavaleiroEscolhido.estaVivo() && npc3.estaVivo()) {
                        cavaleiroEscolhido.atacar(npc3);
                        if (!npc3.estaVivo()) {
                            System.out.println(npc3.getNome() + " foi derrotado");
                            cavaleiroEscolhido.ganharXP(npc3.getXPConcedido()); // Jogador ganha XP
                            cavaleiroEscolhido.status();
                            break; // Sai do loop se o NPC for derrotado
                        }

                        npc.atacar(cavaleiroEscolhido);
                        if (!cavaleiroEscolhido.estaVivo()) {
                            System.out.println(cavaleiroEscolhido.getNome() + " foi derrotado");
                            System.out.println("Fim do jogo."); // Mensagem de fim de jogo
                            return; // Encerra o método atual, saindo do jogo
                        }
                    }

                    System.out.println(" ");
                    System.out.println(" Fase 4 ");
                    thread4.start();

                    try {
                        thread4.join(); // Espera a thread terminar
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    Cavaleiro npc4 = new MascaraDaMorte();

                    System.out.println("Seu segundo Desafio será contra Mascara da Morte da casa de Cancer");
                    System.out.println("A batalha começou");


                    if (cavaleiroEscolhido.estaVivo()) { // Verifica se o jogador ainda está vivo
                        while (cavaleiroEscolhido.estaVivo() && npc4.estaVivo()) {
                            cavaleiroEscolhido.atacar(npc4);
                            if (!npc4.estaVivo()) {
                                System.out.println(npc4.getNome() + " foi derrotado");
                                cavaleiroEscolhido.ganharXP(npc4.getXPConcedido()); // Jogador ganha XP
                                cavaleiroEscolhido.status();
                                break; // Sai do loop se o NPC for derrotado
                            }

                            npc4.atacar(cavaleiroEscolhido);
                            if (!cavaleiroEscolhido.estaVivo()) {
                                System.out.println(cavaleiroEscolhido.getNome() + " foi derrotado");
                                System.out.println("Fim do jogo."); // Mensagem de fim de jogo
                                return; // Encerra o método atual, saindo do jogo
                            }
                        }


                        System.out.println(" ");
                        System.out.println(" Fase 5 ");
                        thread5.start();

                        try {
                            thread5.join(); // Espera a thread terminar
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        Cavaleiro npc5 = new Aiolia();

                        System.out.println("Seu segundo Desafio será contra Aiolia da casa de Leão");
                        System.out.println("A batalha começou");


                        if (cavaleiroEscolhido.estaVivo()) { // Verifica se o jogador ainda está vivo
                            while (cavaleiroEscolhido.estaVivo() && npc5.estaVivo()) {
                                cavaleiroEscolhido.atacar(npc5);
                                if (!npc4.estaVivo()) {
                                    System.out.println(npc5.getNome() + " foi derrotado");
                                    cavaleiroEscolhido.ganharXP(npc5.getXPConcedido()); // Jogador ganha XP
                                    cavaleiroEscolhido.status();
                                    break; // Sai do loop se o NPC for derrotado
                                }

                                npc5.atacar(cavaleiroEscolhido);
                                if (!cavaleiroEscolhido.estaVivo()) {
                                    System.out.println(cavaleiroEscolhido.getNome() + " foi derrotado");
                                    System.out.println("Fim do jogo."); // Mensagem de fim de jogo
                                    return; // Encerra o método atual, saindo do jogo
                                }
                            }


                            System.out.println(" ");
                            System.out.println(" ");
                            thread6.start();

                            try {
                                thread6.join(); // Espera a thread terminar
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            Cavaleiro npc6 = new Shaka();

                            System.out.println("Seu segundo Desafio será contra Shaka da casa de Virgem");
                            System.out.println("A batalha começou");


                            if (cavaleiroEscolhido.estaVivo()) { // Verifica se o jogador ainda está vivo
                                while (cavaleiroEscolhido.estaVivo() && npc6.estaVivo()) {
                                    cavaleiroEscolhido.atacar(npc6);
                                    if (!npc6.estaVivo()) {
                                        System.out.println(npc6.getNome() + " foi derrotado");
                                        cavaleiroEscolhido.ganharXP(npc6.getXPConcedido()); // Jogador ganha XP
                                        cavaleiroEscolhido.status();
                                        break; // Sai do loop se o NPC for derrotado
                                    }

                                    npc6.atacar(cavaleiroEscolhido);
                                    if (!cavaleiroEscolhido.estaVivo()) {
                                        System.out.println(cavaleiroEscolhido.getNome() + " foi derrotado");
                                        System.out.println("Fim do jogo."); // Mensagem de fim de jogo
                                        return; // Encerra o método atual, saindo do jogo
                                    }
                                }


                                System.out.println(" ");
                                System.out.println(" Fase 7 ");
                                thread7.start();

                                try {
                                    thread7.join(); // Espera a thread terminar
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }


                                Cavaleiro npc7 = new Dohko();

                                System.out.println("Seu segundo Desafio será contra Dokho da casa de Libra");
                                System.out.println("A batalha começou");


                                if (cavaleiroEscolhido.estaVivo()) { // Verifica se o jogador ainda está vivo
                                    while (cavaleiroEscolhido.estaVivo() && npc7.estaVivo()) {
                                        cavaleiroEscolhido.atacar(npc7);
                                        if (!npc7.estaVivo()) {
                                            System.out.println(npc7.getNome() + " foi derrotado");
                                            cavaleiroEscolhido.ganharXP(npc7.getXPConcedido()); // Jogador ganha XP
                                            cavaleiroEscolhido.status();
                                            break; // Sai do loop se o NPC for derrotado
                                        }

                                        npc7.atacar(cavaleiroEscolhido);
                                        if (!cavaleiroEscolhido.estaVivo()) {
                                            System.out.println(cavaleiroEscolhido.getNome() + " foi derrotado");
                                            System.out.println("Fim do jogo."); // Mensagem de fim de jogo
                                            return; // Encerra o método atual, saindo do jogo
                                        }
                                    }


                                    System.out.println(" ");
                                    System.out.println(" Fase 8 ");
                                    thread8.start();

                                    try {
                                        thread8.join(); // Espera a thread terminar
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }

                                    Cavaleiro npc8 = new Milo();

                                    System.out.println("Seu segundo Desafio será contra Milo da casa de Escorpiao");
                                    System.out.println("A batalha começou");


                                    if (cavaleiroEscolhido.estaVivo()) { // Verifica se o jogador ainda está vivo
                                        while (cavaleiroEscolhido.estaVivo() && npc8.estaVivo()) {
                                            cavaleiroEscolhido.atacar(npc8);
                                            if (!npc8.estaVivo()) {
                                                System.out.println(npc8.getNome() + " foi derrotado");
                                                cavaleiroEscolhido.ganharXP(npc8.getXPConcedido()); // Jogador ganha XP
                                                cavaleiroEscolhido.status();
                                                break; // Sai do loop se o NPC for derrotado
                                            }

                                            npc8.atacar(cavaleiroEscolhido);
                                            if (!cavaleiroEscolhido.estaVivo()) {
                                                System.out.println(cavaleiroEscolhido.getNome() + " foi derrotado");
                                                System.out.println("Fim do jogo."); // Mensagem de fim de jogo
                                                return; // Encerra o método atual, saindo do jogo
                                            }
                                        }

                                        System.out.println(" ");
                                        System.out.println(" Fase 9 ");
                                        thread9.start();

                                        try {
                                            thread9.join(); // Espera a thread terminar
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }

                                        Cavaleiro npc9 = new Aioros();

                                        System.out.println("Seu segundo Desafio será contra Aioros da casa de Sagitario");
                                        System.out.println("A batalha começou");


                                        if (cavaleiroEscolhido.estaVivo()) { // Verifica se o jogador ainda está vivo
                                            while (cavaleiroEscolhido.estaVivo() && npc9.estaVivo()) {
                                                cavaleiroEscolhido.atacar(npc9);
                                                if (!npc9.estaVivo()) {
                                                    System.out.println(npc9.getNome() + " foi derrotado");
                                                    cavaleiroEscolhido.ganharXP(npc9.getXPConcedido()); // Jogador ganha XP
                                                    cavaleiroEscolhido.status();
                                                    break; // Sai do loop se o NPC for derrotado
                                                }

                                                npc9.atacar(cavaleiroEscolhido);
                                                if (!cavaleiroEscolhido.estaVivo()) {
                                                    System.out.println(cavaleiroEscolhido.getNome() + " foi derrotado");
                                                    System.out.println("Fim do jogo."); // Mensagem de fim de jogo
                                                    return; // Encerra o método atual, saindo do jogo
                                                }
                                            }

                                            System.out.println(" ");
                                            System.out.println(" ");
                                            thread10.start();

                                            try {
                                                thread10.join(); // Espera a thread terminar
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }

                                            Cavaleiro npc10 = new Shura();

                                            System.out.println("Seu segundo Desafio será contra Shura da casa de Capricornio");
                                            System.out.println("A batalha começou");


                                            if (cavaleiroEscolhido.estaVivo()) { // Verifica se o jogador ainda está vivo
                                                while (cavaleiroEscolhido.estaVivo() && npc10.estaVivo()) {
                                                    cavaleiroEscolhido.atacar(npc10);
                                                    if (!npc10.estaVivo()) {
                                                        System.out.println(npc10.getNome() + " foi derrotado");
                                                        cavaleiroEscolhido.ganharXP(npc10.getXPConcedido()); // Jogador ganha XP
                                                        cavaleiroEscolhido.status();
                                                        break; // Sai do loop se o NPC for derrotado
                                                    }

                                                    npc10.atacar(cavaleiroEscolhido);
                                                    if (!cavaleiroEscolhido.estaVivo()) {
                                                        System.out.println(cavaleiroEscolhido.getNome() + " foi derrotado");
                                                        System.out.println("Fim do jogo."); // Mensagem de fim de jogo
                                                        return; // Encerra o método atual, saindo do jogo
                                                    }
                                                }

                                                System.out.println(" ");
                                                System.out.println(" Fase 11");
                                                thread11.start();

                                                try {
                                                    thread11.join(); // Espera a thread terminar
                                                } catch (InterruptedException e) {
                                                    e.printStackTrace();
                                                }

                                                Cavaleiro npc11 = new Camus();

                                                System.out.println("Seu segundo Desafio será contra Camus da casa de Aquario");
                                                System.out.println("A batalha começou");


                                                if (cavaleiroEscolhido.estaVivo()) { // Verifica se o jogador ainda está vivo
                                                    while (cavaleiroEscolhido.estaVivo() && npc11.estaVivo()) {
                                                        cavaleiroEscolhido.atacar(npc11);
                                                        if (!npc4.estaVivo()) {
                                                            System.out.println(npc11.getNome() + " foi derrotado");
                                                            cavaleiroEscolhido.ganharXP(npc11.getXPConcedido()); // Jogador ganha XP
                                                            cavaleiroEscolhido.status();
                                                            break; // Sai do loop se o NPC for derrotado
                                                        }

                                                        npc11.atacar(cavaleiroEscolhido);
                                                        if (!cavaleiroEscolhido.estaVivo()) {
                                                            System.out.println(cavaleiroEscolhido.getNome() + " foi derrotado");
                                                            System.out.println("Fim do jogo."); // Mensagem de fim de jogo
                                                            return; // Encerra o método atual, saindo do jogo
                                                        }
                                                    }

                                                    System.out.println(" ");
                                                    System.out.println(" ");
                                                    thread12.start();

                                                    try {
                                                        thread12.join(); // Espera a thread terminar
                                                    } catch (InterruptedException e) {
                                                        e.printStackTrace();
                                                    }

                                                    Cavaleiro npc12 = new Afrodite();

                                                    System.out.println("Seu segundo Desafio será contra Afrodite da casa de Peixes");
                                                    System.out.println("A batalha começou");


                                                    if (cavaleiroEscolhido.estaVivo()) { // Verifica se o jogador ainda está vivo
                                                        while (cavaleiroEscolhido.estaVivo() && npc12.estaVivo()) {
                                                            cavaleiroEscolhido.atacar(npc12);
                                                            if (!npc4.estaVivo()) {
                                                                System.out.println(npc12.getNome() + " foi derrotado");
                                                                cavaleiroEscolhido.ganharXP(npc12.getXPConcedido()); // Jogador ganha XP
                                                                cavaleiroEscolhido.status();
                                                                break; // Sai do loop se o NPC for derrotado
                                                            }

                                                            npc12.atacar(cavaleiroEscolhido);
                                                            if (!cavaleiroEscolhido.estaVivo()) {
                                                                System.out.println(cavaleiroEscolhido.getNome() + " foi derrotado");
                                                                System.out.println("Fim do jogo."); // Mensagem de fim de jogo
                                                                return; // Encerra o método atual, saindo do jogo
                                                            }
                                                        }
                                                        System.out.println(" ");

                                                    }
                                                    System.out.println(" Jogo chegou ao fim");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}




