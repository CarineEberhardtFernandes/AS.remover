package com.company;

public class Main {

    public static void main(String[] args) {

        ListaEncadeada Cao = new ListaEncadeada();
        Cao.adicionar("chico");
        Cao.adicionar("lupi");
        Cao.adicionar("izzi");
        Cao.adicionar("zeca");


        for(int i = 0; i < Cao.tamanho; i++){
            System.out.println(Cao.buscar(i).nome);
        }
        System.out.println("TAMANHO DA LISTA :"+Cao.tamanho);

        System.out.println("***************************");

        /*System.out.println(Cao.primeiro.nome);
        System.out.println(Cao.ultimo.nome);
        System.out.println(Cao.tamanho);
        System.out.println(Cao.buscar(0).nome);*/

        Cao.remover("IZZI");

        System.out.println("APÓS REMOVER :");

        /*for(int i = 0; i < Cao.tamanho; i++){
            System.out.println(Cao.buscar(i).nome);
        }*/

        /*System.out.println(Cao.tamanho);*/
        /*Cao.adicionar("rock");*/


        for(int i = 0; i < Cao.tamanho; i++){
            System.out.println(Cao.buscar(i).nome);
        }
        System.out.println("TAMANHO DA LISTA :"+Cao.tamanho);









    }
}
