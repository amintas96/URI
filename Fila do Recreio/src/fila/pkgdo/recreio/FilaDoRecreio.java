/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila.pkgdo.recreio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FilaDoRecreio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0, m, p1;

        for (int i = 0; i < n; i++) {
            Ordenacao(sc);
        }

    }

    public static void Ordenacao(Scanner sc) {
        
        int count = 0;
        int m;
        int p1;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        m = sc.nextInt();
        for (int j = 0; j < m; j++) {
            list1.add(p1 = sc.nextInt());
            list2.add(p1);
        }
        Collections.sort(list2);
        Collections.reverse(list2);
        for (int j = 0; j < m; j++) {
            
            if (list1.get(j).equals(list2.get(j))) {
                
                count++;
            }
        }
        System.out.println(count);
       
    }

}
