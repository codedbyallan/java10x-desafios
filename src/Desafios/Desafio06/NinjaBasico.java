package Desafios.Desafio06;

public class NinjaBasico implements Ninja {
    private String nome;
    private int idade;
    private TipoHabilidade habilidade;

    public NinjaBasico(String nome, int idade, TipoHabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);

    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome + " está executando a habilidade: " + habilidade);
    }

}
