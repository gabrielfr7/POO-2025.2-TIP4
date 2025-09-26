package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite hora inicial: ");
        int h_i = sc.nextInt();
        System.out.print("Digite minuto inicial: ");
        int m_i = sc.nextInt();
        System.out.print("Digite hora final: ");
        int h_f = sc.nextInt();
        System.out.print("Digite minuto final: ");
        int m_f = sc.nextInt();
        int minutos = calculo(h_i, m_i, h_f, m_f);
        System.out.println("Minutos = " + minutos);
    }

    static int calculo(int h_i, int m_i, int h_f, int m_f) {
        if (m_f < m_i) { m_f += 60; h_f -= 1; }
        if (h_f < h_i) { h_f += 24; }
        int tot_h = h_f - h_i;
        int tot_m = m_f - m_i;
        return tot_h * 60 + tot_m;
    }
}
