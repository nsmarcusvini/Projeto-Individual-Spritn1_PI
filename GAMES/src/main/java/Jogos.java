
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nsmar
 */
public class Jogos {

    public static void main(String[] args) {

        Scanner leitorNumeroEscolha = new Scanner(System.in);

        System.out.println("Digite um numero entre 1 e 4: ");
        Integer numeroEscolhido = leitorNumeroEscolha.nextInt();
        if (numeroEscolhido != 1 && numeroEscolhido != 2 && numeroEscolhido
                != 3 && numeroEscolhido != 4) {
            System.out.println("Erro. Digite um numero entre 1 e 4.");
        } else {
            switch (numeroEscolhido) {
                case 1:
                    System.out.println("Digite o ano que você nasceu: ");
                    Integer anoNascimento = leitorNumeroEscolha.nextInt();
                    Integer dtNascimento = 2022 - anoNascimento;
                    if (dtNascimento >= 1979 || dtNascimento <= 2000) {
                        System.out.println("Opa, você tem "
                                + dtNascimento + " anos de idade "
                                + " e você é da geração Fliperama!");
                    } else if (dtNascimento > 2000 || dtNascimento <= 2022) {
                        System.out.println("Opa, você tem "
                                + dtNascimento + " anos de idade, e é da "
                                + "geração console !");

                    }

                    break;
                case 2:
                    System.out.println("Escolha um processador: Digite 1 para "
                            + "Jogos Modo História.Digite 2 para Jogos "
                            + "Online");
                    Integer numeroEscolhidoProcessador = leitorNumeroEscolha.nextInt();
                    if (numeroEscolhidoProcessador == 1) {

                        System.out.println("Você escolheu AMD por tanto seu "
                                + "processador favorito é da AMD ryzen !!");

                    } else if (numeroEscolhidoProcessador == 2) {

                        System.out.println("Você escolheu Intel por tanto seu "
                                + "processador favorito é da Intel core !!");

                    }

                case 3:
                    Integer numeroJogo = leitorNumeroEscolha.nextInt();
                    System.out.println("Digite um número de 1 a 10: ");
                    if (numeroJogo == 1) {
                        System.out.println("Seu jogo favorito é Valorant");
                    } else if (numeroJogo == 2) {
                        System.out.println("Seu jogo favorito é Valorant");
                    } else if (numeroJogo == 3) {
                        System.out.println("Seu jogo favorito é League Of Legends");
                    } else if (numeroJogo == 4) {
                        System.out.println("Seu jogo favorito é GTA");
                    } else if (numeroJogo == 5) {
                        System.out.println("Seu jogo favorito é FIFA 22");
                    } else if (numeroJogo == 6) {
                        System.out.println("Seu jogo favorito é Call Of Duty");
                    } else if (numeroJogo == 7) {
                        System.out.println("Seu jogo favorito é COD-WARZONE");
                    } else if (numeroJogo == 8) {
                        System.out.println("Seu jogo favorito é Counter-Strike");
                    } else if (numeroJogo == 9) {
                        System.out.println("Seu jogo favorito é Free-Fire");
                    } else if (numeroJogo == 10) {
                        System.out.println("Seu jogo favorito é Read Dead "
                                + "Redemption");
                    } else if (numeroJogo == 0) {
                        System.out.println("Fim de jogo");
                    } else {
                        System.out.println("Numero digitado não Disponível. "
                                + "Por favor insira um número de 0 a 10");

                    }

                    Integer numeroAleatorio = ThreadLocalRandom.current()
                            .nextInt(50, 401);
                    if (numeroAleatorio < 200) {
                        System.out.println("Hoje é seu dia de sorte "
                                + "você está com desconto !!");
                    } else {
                        System.out.println("Não é seu dia de sorte, hoje você"
                                + " não recebe desconto, tente novamente outra hora !");

                    }

                case 4:
                    System.out.println("Fim !! Obrigado, volte Sempre !");
                    break;

            }
        }

    }
}
