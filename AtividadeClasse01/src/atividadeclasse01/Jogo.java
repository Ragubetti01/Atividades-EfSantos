

package atividadeclasse01;

import javax.swing.JOptionPane;


public class Jogo {
    String nome;
    Integer conquistas;
    boolean finalizou;
    double custo;
    
    void apresentarJogo() {
        String mensagem;
        
        mensagem = "\n #O nome do jogo é: "+ nome + ", com o número de conquistas que o jogador conquistou: "
                + conquistas + ", se o jogador finalizou o jogo: " + finalizou + " e quanto custou o jogo: "+ custo;
        System.out.println(mensagem);
    }

    @Override
    public String toString() {
        return nome;
    }
    
}
   