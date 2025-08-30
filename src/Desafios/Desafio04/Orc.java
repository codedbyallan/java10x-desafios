package Desafios.Desafio04;

public class Orc extends Personagem {

    String ultimate = "Ultimate de Orc Padrão";

    @Override
    public void mostrarHabilidadeEspecial() {
        System.out.println("Ultimate ativado: " + ultimate);
    }
}
