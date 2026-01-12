/*Zadanie 2. Obliczanie iloczynu wszystkich elementów tablicy

Opis zadania:
Napisz program w języku Java, który:

1. Wczyta rozmiar tablicy i elementy (liczby całkowite) od użytkownika.
2. Obliczy iloczyn wszystkich elementów.
3. Wyświetli wynik.
4. Dodatkowo: jeśli w tablicy znajduje się liczba `0`, program powinien wyświetlić informację: „Uwaga: w tablicy znajduje się zero – iloczyn wynosi 0."*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Obliczanie elementow tablicy.");
    int tablica[] = new int[100];
    int n = 0;
    System.out.println("Podaj rozmiar tablicy:");
    n = scan.nextInt();

    if (n == 0) {
      System.out.println("Tablica jest pusta.");
      return;
    }

    System.out.println("Podaj elementy tablicy:");

    for (int i = 0; i < n; i++) {
      tablica[i] = scan.nextInt();
    }

    for (int i = 0; i < n; i++) {
      if (tablica[i] == 0) {
        System.out.println("Uwaga: w tablicy znajduje się zero – iloczyn wynosi 0.");
        return;
      }
    }

    int iloczyn = 1;
    System.out.print("Iloczyn wszystkich elementow: ");
    for (int i = 0; i < n; i++) {
      iloczyn *= tablica[i];
    }
    System.out.print(iloczyn);
  }
}