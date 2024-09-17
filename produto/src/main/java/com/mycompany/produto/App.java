package com.mycompany.produto;

import java.util.Scanner;
import newpackage.Produto;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();

        System.out.println("Digite o preço: R$");
        double preco = sc.nextDouble();

        System.out.println("Digite a quantidade em estoque:");
        int quantidade = sc.nextInt();
        
        Produto p1 = new Produto(nome,preco,quantidade);
        
        System.out.println(p1);
        
        p1.AddProdutos(50);
        
        System.out.println(p1);
        
        p1.RemoverProdutos(20);
        
        System.out.println(p1);
        

    }
}
