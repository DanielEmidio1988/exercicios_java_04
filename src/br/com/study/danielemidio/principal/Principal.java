package br.com.study.danielemidio.principal;

import br.com.study.danielemidio.contaBancaria.ContaBancaria;
import br.com.study.danielemidio.forma.Circulo;
import br.com.study.danielemidio.forma.Forma;
import br.com.study.danielemidio.forma.Quadrado;
import br.com.study.danielemidio.pet.Animal;
import br.com.study.danielemidio.pet.Cachorro;
import br.com.study.danielemidio.produtos.Produto;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //1- Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Assistir Filmes");
        lista.add("Ler Livros");
        lista.add("Acompanhar Séries");

        System.out.println("Lista de hobbies");
        lista.forEach(System.out::println);

        //2- Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.
        //Cachorro cachorro = new Cachorro();
        //Animal animal = (Animal) cachorro;

        //3- Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja do tipo correto antes de fazer o casting.
        Animal animal = new Cachorro();
        if(animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal;
        }else{
            System.out.println("Não é um cachorro");
        }

        //4- Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.
        Produto produto1 = new Produto("Joystick", 300.99);
        Produto produto2 = new Produto("Headphone", 918.70);
        Produto produto3 = new Produto("Playstation 5", 3999.9);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        double totalPrecos = 0;
        for(Produto produto : listaProdutos){
            totalPrecos += produto.getPreco();
        }

        double precoMedio = totalPrecos / listaProdutos.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);

        //5- Crie uma interface Forma com um método calcularArea(). Implemente a interface em duas classes, por exemplo, Circulo e Quadrado. Em seguida, crie uma lista de formas (objetos da interface Forma) e utilize um loop para calcular e imprimir a área de cada forma.
        Circulo circulo = new Circulo();
        circulo.setRaio(6);

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(8.9);

        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(circulo);
        listaFormas.add(quadrado);

        listaFormas.forEach(forma -> System.out.println("Área: " + forma.calcularArea()));

        //6- Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida, crie uma lista de contas bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo.
        ContaBancaria conta1 = new ContaBancaria(999, 3200.5);
        ContaBancaria conta2 = new ContaBancaria(998, 2599.7);
        ContaBancaria conta3 = new ContaBancaria(997, 4999.0);

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);

        ContaBancaria contaMaiorSaldo = listaContas.get(0);

        for (ContaBancaria listaConta : listaContas) {
            if(listaConta.getSaldo() > contaMaiorSaldo.getSaldo()){
                contaMaiorSaldo = listaConta;
            }
        }

        System.out.println("Conta " + contaMaiorSaldo.getNumeroConta() + " possui o maior saldo com " + contaMaiorSaldo.getSaldo());
    }
}