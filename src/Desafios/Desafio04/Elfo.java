package Desafios.Desafio04;

public class Elfo extends Personagem {

    String ultimate = "Ultimate de Elfo padrão";

    @Override
    public void mostrarHabilidadeEspecial() {
        System.out.println("Ultimate ativado: " + ultimate);
    }
}
