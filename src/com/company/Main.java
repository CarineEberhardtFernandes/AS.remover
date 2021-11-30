package com.company;

public class Main {

    public static void main(String[] args) {

        ListaEncadeada Cao = new ListaEncadeada();
        Cao.adicionar("chico");
        Cao.adicionar("lupi");
        Cao.adicionar("izzi");
        Cao.adicionar("zeca");


        System.out.println(Cao.primeiro.nome);
        System.out.println(Cao.ultimo.nome);
        System.out.println(Cao.tamanho);
        System.out.println(Cao.buscar(0).nome);

        Cao.remover("zeca");
        System.out.println(Cao.tamanho);
        for(int i = 0; i < Cao.tamanho; i++){
            System.out.println(Cao.buscar(i).nome);
        }
        Cao.adicionar("rock");
        System.out.println(Cao.tamanho);
        for(int i = 0; i < Cao.tamanho; i++){
            System.out.println(Cao.buscar(i).nome);
        }










    }
}
