package atividadeclasse01;


public class AtividadeClasse01 {

    
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador();
        
        jogador1.nome = "Rafael";
        jogador1.idade = 17;
        jogador1.email = "rafinha@gmail.com";
        jogador1.platinouJogo = true;
        jogador1.qntJogos = 187;
        jogador1.telefone = "524750784";
        
        Jogo jogo1 = new Jogo();
        jogo1.nome = "Overwatch";
        jogo1.custo = 50.49;
        jogo1.conquistas = 90;
        jogo1.finalizou = false;
        jogador1.jogoFav = jogo1;
    }
        
}
