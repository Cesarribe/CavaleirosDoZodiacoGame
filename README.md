Jogo dos Cavaleiros do Zodíaco:


Bem-vindo ao repositório do Jogo dos Cavaleiros do Zodíaco , um projeto desenvolvido em Java que traz a emoção e a aventura do universo de Saint Seiya na saga das 12 casas! Neste jogo, você poderá escolher seu cavaleiro favorito e enfrentar desafios épicos em batalhas emocionantes.

Descrição do Projeto
O Jogo dos Cavaleiros do Zodíaco é um jogo de combate baseado em turnos, onde os jogadores podem escolher entre diferentes cavaleiros, cada um com habilidades e poderes únicos. O objetivo é derrotar os adversários em uma série de batalhas pelas 12 casas, utilizando estratégias e habilidades especiais.
Usamos POO para facilitar a Leitura, além de algumas tecnicas básicas de JAVA para dar dinamismo ao programa.

Funcionalidades:
Escolha de Personagens : Selecione entre diversos cavaleiros, cada um representando uma constelação e possuindo habilidades especiais.
Sistema de Combate : Enfrente inimigos em batalhas por turnos, utilizando ataques, defesas e habilidades especiais.
Níveis e Desafios : Progrida através de diferentes níveis e enfrente inimigos cada vez mais desafiadores.

Java : Linguagem de programação utilizada para o desenvolvimento do jogo.
JUnit : Framework para a realização de testes unitários.
Maven : Gerenciador de dependências e construção do projeto.

/jogo-zodiaco
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com
│   │   │   │   └── zodiaco
│   │   │   │       ├── model
│   │   │   │       │   ├── Cavaleiro.java          // Interface Cavaleiro
│   │   │   │       │   ├── CavaleiroOuro.java     // Classe CavaleiroOuro
│   │   │   │       │   └── CavaleiroBronze.java    // Classe CavaleiroBronze
│   │   │   │       ├── utils
│   │   │   │       │   └── ImprimirComPausa.java   // Classe para imprimir com pausa
│   │   │   │       └── Main.java                    // Classe principal
│   │   └── resources
│   └── test
│       └── java
│           └── com
│               └── zodiaco
│                   └── testes
│
├── pom.xml
└── README.md
____________________________________________________________________________________________________________________




## Como Executar o Jogo

Para executar o jogo, siga os passos abaixo:

1. **Clone o repositório**:
   
   git clone https://github.com/Cesarribe/CavaleirosDoZodiacoGame

2. **Navegue até o diretório do projeto :**
   cd CavaleirosDoZodiaco
   
3. **Compile o projeto usando Maven :**
   mvn clean install
   
4. **Execute**
   mvn exec:java -Dexec.mainClass="com.CavaleiroDoZodiaco.Main"

5. **Teste**
   mvn test


**Quer contribuir?**

Faça um fork do repositório .
**Crie uma nova branch :**
    git checkout -b minha-contribuicao

**Faça suas alterações e commit :** 
    git commit -m "Descrição da minha contribuição"

**Envie para o repositório remoto :**
    git push origin minha-contribuicao

    
**Abra um Pull Request**




**Programa = OPEN SOURCE**
Sinta-se A Vontade para Contribuir conosco!
