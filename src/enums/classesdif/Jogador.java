package enums.classesdif;

public class Jogador {
    private String nome;
    private int vida;

    public Jogador(String nome, Nivel nivel){
        setNome(nome);
        setVida(nivel);
    }

    public void setVida(Nivel nivel) {
        switch (nivel) {
            case BAIXO: this.vida = 100;
                break;
            case MEDIO: this.vida = 75;
                break;
            case ALTO: this.vida = 50;
                break;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    @Override
    public String toString(){
        return String.format("Seu nome é %s e possui %d de vida!\n", nome, vida);
    }
}
