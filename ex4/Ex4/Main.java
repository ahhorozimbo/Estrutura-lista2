package ex4.Ex4;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        int sair = 1, opc = 0, cont = 4;

        String nome, esporte, patrocinador;
        float altura, peso;

        Lista listaAtletas = new Lista();
        Lista listaPatrocinadores = new Lista();

        Atleta a1 = new Atleta("Andrew Garfield", 1.85, 88.5, "Levantador de peso", "BIRL");
        Atleta a2 = new Atleta("Tom Holland", 1.50, 58.5, "Levantador de garfo", "PODPAH");
        Atleta a3 = new Atleta("Renato Cariani", 1.65, 98.5, "Supino Reto na Barra", "Grub");

        Patrocinador p1 = new Patrocinador("Nike");
        Patrocinador p2 = new Patrocinador("Adidas");
        Patrocinador p3 = new Patrocinador("Growt");

        listaAtletas.insereFim(new No(a1));
        listaAtletas.insereFim(new No(a2));
        listaAtletas.insereFim(new No(a3));
        listaPatrocinadores.insereFim(new No(p1));
        listaPatrocinadores.insereFim(new No(p2));
        listaPatrocinadores.insereFim(new No(p3));

        listaAtletas.imprimeLista();
        listaPatrocinadores.imprimeLista();

        Lista listaHibrida = new Lista();
        listaHibrida.insereFim(new No(a1));
        listaHibrida.insereFim(new No(a2));
        listaHibrida.insereFim(new No(a3));
        listaHibrida.insereFim(new No(p1));
        listaHibrida.insereFim(new No(p2));
        listaHibrida.insereFim(new No(p3));

        System.out.print("-----Opções-----\n");
        System.out.print("1- Cadastrar\n");
        System.out.print("2- Buscar\n");
        System.out.print("3- Deletar\n");
        System.out.print("----------------\n");

        opc=ler.nextInt();


        while(sair!=0) {
            switch(opc) {
                case 1: {
                    Atleta a4 = new Atleta("Igor Guimarães", 1.90, 98.5, "Cerveja", "Fisio");
                    listaAtletas.insereFim(new No(a4));

                    Patrocinador p4 = new Patrocinador("Centauros");
                    listaPatrocinadores.insereFim(new No(p4));

                    System.out.print("Inserindo na lista Hibrida \n");
                    listaHibrida.insereFim(new No(a4));
                    listaHibrida.insereFim(new No(p4));
                    System.out.print("\nLista de Atletas\n");
                    listaAtletas.imprimeLista();
                    System.out.print("\nLista de Patrocinadores\n");
                    listaPatrocinadores.imprimeLista();
                    opc = ler.nextInt();
                    break;
                } case 2: {
                    No atl = listaHibrida.busca("Tom Holland");
                    Atleta a = (Atleta) atl.getObj();
                    System.out.println(a.nomeAtleta);
                    opc = ler.nextInt();
                    break;
                } case 3: {
                    listaAtletas.remove("Renato Cariani");
                    listaHibrida.remove("Renato Cariani");
                    listaHibrida.imprimeLista();
                    opc = ler.nextInt();
                    break;
                }
            }
        }


    }
}