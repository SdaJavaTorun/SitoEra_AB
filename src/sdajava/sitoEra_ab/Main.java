package sdajava.sitoEra_ab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public void sitoEra() {
        Scanner input = new Scanner(System.in);
        System.out.println("Zakres: ");
        int a = input.nextInt();


        ArrayList<Integer> lista = new ArrayList<>();
        int wartosci = 1;
        for (int i = 2; i <= Math.floor(Math.sqrt(a)); i++) {  //Math.floor wartosc zaokraglona
            for (int j = 2; j <= a; j++) {
                if (i * j <= a) {
                    wartosci = i * j;
                    lista.add(wartosci);                         //wypelnienie listy
                }
            }
        }


        //System.out.println(lista);                              // wyswietlenie listy
        // System.out.println(list.toString())
        System.out.println("Wynik: ");


        int b = 2;
        while (b <= a) {
            if (lista.contains(b)) {
             }
            else {

                System.out.print(b + " ");
            }
            b++;
        }
    }

    public static void main(String[] args) {
        Main liczba = new Main();
        liczba.sitoEra();
    }
}