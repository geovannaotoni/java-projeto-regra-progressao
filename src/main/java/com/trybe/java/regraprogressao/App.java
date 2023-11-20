package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Verificar soma pesos.
   *
   * @param pesos      os pesos
   * @param quantidade a quantidade de elementos no array
   */
  public static void verificarSomaPesos(int[] pesos, int quantidade) {
    int somaPesos = 0;
    for (int i = 0; i < quantidade; i += 1) {
      somaPesos += pesos[i];
    }
    if (somaPesos != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }
  }

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar: ");
    String quantidadeStr = scanner.nextLine();

    int quantidade = Integer.parseInt(quantidadeStr);
    String[] nomes = new String[quantidade];
    int[] pesos = new int[quantidade];
    int[] notas = new int[quantidade];

    for (int i = 1; i <= quantidade; i += 1) {
      System.out.println("Digite o nome da atividade " + i + ":");
      String nome = scanner.nextLine();
      nomes[i - 1] = nome;

      System.out.println("Digite o peso da atividade " + i + ":");
      String pesoStr = scanner.nextLine();
      int peso = Integer.parseInt(pesoStr);
      pesos[i - 1] = peso;

      System.out.println("Digite a nota obtida para " + nomes[i - 1] + ":");
      String notaStr = scanner.nextLine();
      int nota = Integer.parseInt(notaStr);
      notas[i - 1] = nota;
    }

    App.verificarSomaPesos(pesos, quantidade);

    scanner.close();
  }
}