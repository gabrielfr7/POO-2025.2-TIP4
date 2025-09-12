package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont, cod, num_vei, num_acid;
        int maior = 0, menor = 0, cid_maior = 0, cid_menor = 0;
        int soma_vei = 0, soma_acid = 0, cont_acid = 0;
        double media_vei, media_acid;

       
        for (cont = 1; cont <= 5; cont++) {
            System.out.print("Digite o código da cidade: ");
            cod = sc.nextInt();
            System.out.print("Digite o número de veículos de passeio: ");
            num_vei = sc.nextInt();
            System.out.print("Digite o número de acidentes de trânsito: ");
            num_acid = sc.nextInt();

           
            if (cont == 1) {
                maior = num_acid;
                cid_maior = cod;
                menor = num_acid;
                cid_menor = cod;
            } else {
                if (num_acid > maior) {
                    maior = num_acid;
                    cid_maior = cod;
                }
                if (num_acid < menor) {
                    menor = num_acid;
                    cid_menor = cod;
                }
            }

            
            soma_vei += num_vei;

           
            if (num_vei < 2000) {
                soma_acid += num_acid;
                cont_acid++;
            }
        }

        
        System.out.println("\nMaior número de acidentes: " + maior + " (Cidade " + cid_maior + ")");
        System.out.println("Menor número de acidentes: " + menor + " (Cidade " + cid_menor + ")");
        
        media_vei = soma_vei / 5.0;
        System.out.println("Média de veículos nas 5 cidades: " + media_vei);

        if (cont_acid == 0) {
            System.out.println("Não foi digitada nenhuma cidade com menos de 2000 veículos.");
        } else {
            media_acid = (double) soma_acid / cont_acid;
            System.out.println("Média de acidentes em cidades com menos de 2000 veículos: " + media_acid);
        }

        sc.close();
    }
}

