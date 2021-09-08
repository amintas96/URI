/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogando.cartas.fora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JogandoCartasFora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        while (N != 0) {
            List<Integer> discart = new ArrayList<>();
            List<Integer> cartas = new ArrayList<>();
            int base = 0;
            for (int i = 1; i <= N; i++) {
                cartas.add(i);

            }
            for (int i = 0; i < N -1 ; i++) {

                if (cartas.size() > 0) {
                    discart.add(cartas.get(0));
                    cartas.remove(cartas.get(0));
                    cartas.add(cartas.get(0));
                    cartas.remove(cartas.get(0));
                    base = cartas.get(0);
                }
            }
            System.out.print("Discarded cards: ");
            for (int c = 0; c < N -1; c++) {
                if (c < discart.size() - 1) {
                    System.out.print(discart.get(c) + ", ");
                } else {
                    System.out.println(discart.get(c));
                }
            }
            System.out.println("Remaining card: " + base);

            N = sc.nextInt();
        }

    }

}
