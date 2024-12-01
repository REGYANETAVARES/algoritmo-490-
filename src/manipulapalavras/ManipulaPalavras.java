/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipulapalavras;
import javax.swing.JOptionPane;

/**
 *
 * @author REGYANE
 */
public class ManipulaPalavras {

    public static void main(String[] args) {
        OperacoesVetor operacoes = new OperacoesVetor();
        String[] palavras = new String[10]; // Vetor para armazenar as palavras
        char caractere = 'c'; // Caractere a ser substituído
        
        // Entrada das palavras
        for (int i = 0; i < palavras.length; i++) {
            palavras[i] = JOptionPane.showInputDialog(
                null, "Digite a palavra " + (i + 1) + " em letras minúsculas:"
            );
        }
        
        // Substituir caractere 'c' em cada palavra
        StringBuilder[] palavrasModificadas = new StringBuilder[10];
        for (int i = 0; i < palavras.length; i++) {
            palavrasModificadas[i] = new StringBuilder(palavras[i]);
            int totalSubstituicoes = operacoes.substituirCaractere(palavrasModificadas[i], caractere);

            // Exibe resultado intermediário
            JOptionPane.showMessageDialog(null, 
                "Palavra original: " + palavras[i] +
                "\nModificada: " + palavrasModificadas[i] +
                "\nTotal de substituições: " + totalSubstituicoes
            );
        }

        // Exibir todas as palavras processadas
        StringBuilder resultadoFinal = new StringBuilder("Resultado Final:\n");
        for (int i = 0; i < palavras.length; i++) {
            resultadoFinal.append((i + 1)).append(" - ").append(palavrasModificadas[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, resultadoFinal.toString());
    }
}
