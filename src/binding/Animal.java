package binding;

public class Animal {

    private String nome;
    public Animal(String nome){
        setNome(nome);
    }

    //Sobrecarga estatica de metodos
    public void fazerBarulho(String som){
        System.out.println(som);
    }

    public void fazerBarulho(String som, int repetir){
        for(int i = 0; i < repetir; i++){
            System.out.println(som);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    static class AtividadeAnimal {
        //Isso aqui é dinamico
        public static void comer(Animal a){
            System.out.println(a.nome + " está comendo.");
        }
    }
}
