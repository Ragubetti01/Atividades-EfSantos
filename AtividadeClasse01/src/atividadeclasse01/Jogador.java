

package atividadeclasse01;


public class Jogador {
   String nome;
   String telefone;
   String email;
   Integer idade;
   Integer qntJogos;
   Jogo jogoFav;
   boolean platinouJogo;
   
   
   void apresentarJogador() {
       String mensagem;
       
       mensagem = "\n - O nome do jogador é: "+ nome + ", sua idade: " + idade + ", seu email: " 
               + email + ", seu número de telefone: " + telefone + ",\n a quantidade de jogos na conta: " + qntJogos + ", seu jogo favorito: " 
               + jogoFav + " e se platinou o jogo: " + platinouJogo;
       System.out.println(mensagem);
   }

    @Override
    public String toString() {
        return "Jogador{" + "nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", idade=" + idade + ", qntJogos=" + qntJogos + ", jogoFav=" + jogoFav + ", platinouJogo=" + platinouJogo + '}';
    }
    
}
