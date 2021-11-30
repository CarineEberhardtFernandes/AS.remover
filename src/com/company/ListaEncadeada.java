package com.company;

public class ListaEncadeada {
    public Cao primeiro;
    public Cao ultimo;
    public int tamanho;

    public void adicionar(String novoNome){
        Cao novoCao = new Cao(novoNome);
        if(this.primeiro== null && this.ultimo == null){
            this.primeiro = novoCao;
            this.ultimo = novoCao;
        }else {
            this.ultimo.proximo = novoCao;
            this.ultimo = novoCao;
        }
        this.tamanho++;
    }
    public void remover(String deleteNome){
        Cao anterior =null ;
        Cao atual = this.primeiro;
        for(int i=0 ; i < this.tamanho;i++){
            if(atual.nome.equalsIgnoreCase(deleteNome)){
                if(atual== primeiro){
                    this.primeiro= atual.proximo;
                }else if ( atual==ultimo){
                    this.ultimo=anterior;
                    anterior.proximo=null;

                }else {
                    anterior.proximo =(atual.proximo) ;
                    atual=null;
                }
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.proximo;
        }
    }
    public Cao buscar(int posicao){
        Cao atual = this.primeiro;
        for(int i=0 ; i < posicao;i++){
            if(atual.proximo != null){
                atual = atual.proximo;
            }
        }
        return atual;
    }
}
