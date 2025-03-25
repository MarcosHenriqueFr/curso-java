package lambdas.exemplos;

import java.time.LocalDate;

public class Pessoa {

    public enum Sex {
        MALE, FEMALE
    }

    private String nome;
    private final LocalDate aniversario;
    private Sex sexo;
    private String email;

    public Pessoa(String nome, LocalDate aniversario, Sex sexo, String email){
        setNome(nome);
        this.aniversario = aniversario;
        setSexo(sexo);
        setEmail(email);
    }

    public int getIdade(){
        LocalDate atual = LocalDate.now();
        return atual.getYear() - aniversario.getYear();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Sex getSexo() {
        return sexo;
    }

    public void setSexo(Sex sexo) {
        this.sexo = sexo;
    }

    public void printPessoa(){
        System.out.println(this);
    }

    public String toString(){
        return String.format("A pessoa %s tem %d anos é do sexo %s, sua forma de contato é: %s",
                                this.nome, getIdade(), this.sexo, this.email);
    }
}
