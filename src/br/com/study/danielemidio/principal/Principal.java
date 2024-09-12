package br.com.study.danielemidio.principal;

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

    }
}