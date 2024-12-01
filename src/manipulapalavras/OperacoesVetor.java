/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manipulapalavras;

/**
 *
 * @author REGYANE
 */
public class OperacoesVetor {
    /**
     * Substitui todas as ocorrências de um caractere no vetor por '*'.
     * @param vetor O vetor de caracteres (como String).
     * @param caractere O caractere a ser substituído.
     * @return O número total de substituições feitas.
     */
    public int substituirCaractere(StringBuilder vetor, char caractere) {
        int contagem = 0;

        for (int i = 0; i < vetor.length(); i++) {
            if (vetor.charAt(i) == caractere) {
                vetor.setCharAt(i, '*'); // Substitui pelo caractere '*'
                contagem++; // Incrementa o contador
            }
        }

        return contagem; // Retorna o total de substituições
    }
}
    
