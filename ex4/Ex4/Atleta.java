package ex4.Ex4;

public class Atleta {
    String nomeAtleta;
    double alturaAtleta;
    double pesoAtleta;
    String esporteAtleta;
    String patrocinadoresAtleta;

    public Atleta(String nome, double altura, double peso, String esporte, String patrocinadores){
        nomeAtleta = nome;
        alturaAtleta = altura;
        pesoAtleta = peso;
        esporteAtleta = esporte;
        patrocinadoresAtleta = patrocinadores;
    }

    public String toString(){
        return "Nome: "+nomeAtleta+" Altura: "+alturaAtleta+" Peso: "+pesoAtleta+ " Esporte: "+esporteAtleta+" Patrocinadores: "+patrocinadoresAtleta;
    }
}