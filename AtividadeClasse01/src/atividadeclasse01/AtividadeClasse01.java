package atividadeclasse01;


public class AtividadeClasse01 {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();
        Jogador jogador3 = new Jogador();
        
        Jogo jogo1 = new Jogo();
        System.out.println(jogador1.toString());
        jogador1.nome = "Rafael";
        jogador1.idade = 17;
        jogador1.email = "rafinha@gmail.com";
        jogador1.platinouJogo = true;
        jogador1.qntJogos = 187;
        jogador1.telefone = "524750784";
         
        jogo1.nome = "Overwatch";
        jogo1.custo = 50.49;
        jogo1.conquistas = 90;
        jogo1.finalizou = false;
        jogo1.apresentarJogo();
        jogador1.jogoFav = jogo1;
        
        jogador1.apresentarJogador();
        
        
        jogador2.nome = "Lucas";
        jogador2.idade = 17;
        jogador2.email = "luquinhas@gmail.com";
        jogador2.platinouJogo = false;
        jogador2.qntJogos = 32;
        jogador2.telefone = "732586296";
        
        Jogo jogo2 = new Jogo();
        jogo2.nome = "The Forest";
        jogo2.custo = 30.90;
        jogo2.conquistas = 45;
        jogo2.finalizou = true;
        jogador2.jogoFav = jogo2;
        jogo2.apresentarJogo();
            
        jogador2.apresentarJogador();
        
        
        jogador3.nome = "Eduardo";
        jogador3.idade = 25;
        jogador3.email = "eduardo.Eduu@gmail.com";
        jogador3.platinouJogo = false;
        jogador3.qntJogos = 296;
        jogador3.telefone = "019274712";
        
        Jogo jogo3 = new Jogo();
        jogo3.nome = "Team Fortress 2";
        jogo3.custo = 0;
        jogo3.conquistas = 436;
        jogo3.finalizou = false;
        jogador3.jogoFav = jogo3;
        jogo3.apresentarJogo();
        
        jogador3.apresentarJogador();
    }
   
    
}
