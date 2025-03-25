package annotations;

@Importante
public class Pessoa {

    @StringImportante
    String nome;
    int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    @ExecuteImediatamente(vezes = 3)
    public void andar(){
        System.out.println("Andou");
    }

    public void comer(){
        System.out.println("Comeu");
    }
}
