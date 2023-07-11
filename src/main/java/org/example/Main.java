package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Posto posto = new Posto(0.0, 0.0, 0.0, 0.0,
                0.0, 0.0);

        int resposta;

        do{

            System.out.print("Digite o num da placa do carro: ");
            String placa = sc.nextLine();
            Carro carro = new Carro(placa, 0.0);

            System.out.println("Qual tipo de gasolina foi consumido por esse carro?");
            System.out.println("1- Gasolina | 2- Alcool | 3- Diesel");
            System.out.printf("Insira o código do tipo da gasolina: ");
            int codigo = sc.nextInt();

            System.out.println("Quanto foi a venda do combustível escolhido (R$)? ");
            Double valorVenda = sc.nextDouble();
            carro.balancoFinal(valorVenda);
            if(codigo == 1){
                posto.addGasolina(valorVenda);
                posto.custoGeralGasolina();
            }else if(codigo == 2){
                posto.addAlcool(valorVenda);
                posto.custoGeralAlcool();
            }else{
                posto.addDiesel(valorVenda);
                posto.custoGeralDiesel();
            }

            System.out.println();
            System.out.print("Deseja cadastrar outro carro? (1-Sim | 0-Não): ");
            resposta = sc.nextInt();
            sc.nextLine();

        }while (resposta == 1);

        System.out.println(posto);

       sc.close();
    }
}