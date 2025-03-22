package encadeamento;

public class EncadeamentoCriado {
    //Também chamado de Fluent Programming/Interface
    //Fica mais legivel
    //a.setNome("Jorge").setNota(3.90);
    public static void main(String[] args) {

        //Levaria mais tempo, daria para fazer isso com method chaining ou o construtor
        Aluno a = new Aluno().setNome("Jorge").setNota(3.90).displayAluno();
    }
}

//Em um aluno
class Aluno {
    String nome;
    double nota;

    public Aluno setNome(String nome){
        this.nome = nome;
        return this;
    }

    public Aluno setNota(double nota){
        this.nota = nota;
        return this;
    }

    public Aluno displayAluno(){
        System.out.println(this);
        return this;
    }

    @Override
    public String toString(){
        return String.format("Olá, me chamo %s e tirei nota %.2f.\n", this.nome, this.nota);
    }
}
