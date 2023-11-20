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
  public static int verificarSomaPesos(int[] pesos, int quantidade) {
    int somaPesos = 0;
    for (int i = 0; i < quantidade; i += 1) {
      somaPesos += pesos[i];
    }
    return somaPesos;
  }

  /**
   * Calcular nota final.
   *
   * @param pesos      os pesos
   * @param notas      as notas
   * @param quantidade a quantidade
   */
  public static void calcularNotaFinal(int[] pesos, int[] notas, int quantidade) {
    int resultado = 0;
    for (int i = 0; i < quantidade; i += 1) {
      resultado += pesos[i] * notas [i];
    }
    float notaFinal = resultado / 100.0f;
    if (notaFinal >= 85.0) {
      System.out.println("Parabéns! Você alcançou " + notaFinal +
          "%! E temos o prazer de informar que você obteve aprovação!"
      );
    } else {
      System.out.println("Lamentamos informar que, com base na sua pontuação alcançada neste período, "
          + notaFinal + "%, você não atingiu a pontuação mínima necessária para sua aprovação."
      );
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

    int somaPesos = App.verificarSomaPesos(pesos, quantidade);
    if (somaPesos != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
      return;
    }

    App.calcularNotaFinal(pesos, notas, quantidade);

    scanner.close();
  }
}