package ex3.Ex3;

public class Lista {
    No inicio;
    No fim;
    public Lista(No inicio,No fim){
        this.fim=fim;
        this.inicio=inicio;

    }
    public void insereFim(No n){
        if (inicio==null){
            inicio=fim=n;
        }else{
            fim.prox=n;
            fim=n;

        }

    }
    public void insereInicio(No n){
        if (inicio==null){
            inicio=fim=n;
        }else{
            inicio.ant=n;
            inicio=n;

        }

    }
    public No busca(int num){
        No b = inicio;
        while (b!=null&& b.num!=num){
            b=b.prox;
        }
        if (b.num==num){
            return b;
        }
        else{
            return null;
        }
    }
    public void remover(int num){
        No r=busca(num);
        if (r==null){
            System.out.println("achou não");
        }
        else if(inicio!=fim) {
            if (r == inicio) {
                inicio = r.ant;
                r.ant.prox = null;
            } else if (r == fim) {
                fim = r.ant;
                r.ant.prox = null;
            } else {
                r.ant.prox = r.prox;
                r.prox.ant = r.ant;
            }
        }else{
            inicio=null;
            fim=null;
        }
    }
    public void troca(No no1, No no2, No aux){
        aux.prox=no1.prox;
        aux.ant=no1.ant;
        no1.ant.prox=no2;
        no1.prox.ant=no2;
        aux.ant.prox=no1;
        aux.prox.ant=no1;
    }
}
