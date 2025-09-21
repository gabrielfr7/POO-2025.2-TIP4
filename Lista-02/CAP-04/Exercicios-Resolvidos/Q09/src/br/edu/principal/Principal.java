package br.edu.principal;

import java.time.LocalDateTime;

public class Principal {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();

        int dia = agora.getDayOfMonth();
        int mes = agora.getMonthValue();
        int ano = agora.getYear();
        int hora = agora.getHour();
        int min = agora.getMinute();

        String[] meses = {
            "janeiro", "fevereiro", "março", "abril", "maio", "junho",
            "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };

        System.out.println("Data Atual: " + dia + "/" + mes + "/" + ano + " – " + meses[mes - 1]);

        System.out.println("Hora Atual: " + String.format("%02d:%02d", hora, min));
    }
}
