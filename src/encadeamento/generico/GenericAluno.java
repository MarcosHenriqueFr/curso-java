package encadeamento.generico;

public class GenericAluno {

    private String nome;
    private int idade;
    private double notaFinal;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    @Override
    public String toString() {
        return String.format("Meu nome é %s tenho %d anos\nTirei %.2f de nota final.\n",
                            nome, idade, notaFinal);
    }
}
