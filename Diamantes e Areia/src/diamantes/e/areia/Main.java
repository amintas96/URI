/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diamantes.e.areia;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            
            sc.nextLine();

            String input = sc.nextLine();

            int qtsDiamantes = ContaDiamantes(input);
            
            System.out.println(qtsDiamantes);
        }
    }

    public static int ContaDiamantes(String input) {
        
       Stack<Character>pilha = new Stack<>();
       int diamantes = 0;
        for (int i = 0; i < input.length(); i++) {
            
            if (input.charAt(i) == '<' ) {
               pilha.push(input.charAt(i));
               
            }else if(input.charAt(i) == '>' && !pilha.isEmpty()){
                
                
                pilha.pop();
                diamantes ++;
            }

        }
        
        return diamantes;
    }
}
