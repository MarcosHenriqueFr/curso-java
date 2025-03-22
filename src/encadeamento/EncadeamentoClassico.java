package encadeamento;

public class EncadeamentoClassico {
    //Builder Pattern
    //Quando criar o Builder tenho que chamar pela instancia da classe de dentro
    //O build cria finalmente o obj

    public static void main(String[] args) {
        Post p1 = new Post.Builder()
                .categoria("Notícias")
                .texto("Hoje está um dia muito pacífico")
                .build();

        Post p2 = new Post.Builder()
                .categoria("Entretenimento")
                .titulo("Hoje ganhamos um OSCAR")
                .texto("Com muito esforço um Oscar de filme internacional foi possível")
                .build();

        System.out.println(p1);
        System.out.println();
        System.out.println(p2);
    }

}

class Post {
    private final String titulo;
    private final String texto;
    private final String categoria;

    Post(Builder builder){
        this.titulo = builder.titulo;
        this.texto = builder.texto;
        this.categoria = builder.categoria;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getTexto(){
        return this.texto;
    }

    public String getCategoria(){
        return this.categoria;
    }

    public String toString(){
        return String.format("%s: %s\n%s", this.categoria, this.titulo, this.texto);
    }

    public static class Builder {

        //Tem que bater com a classe de fora
        private String titulo;
        private String texto;
        private String categoria;

        //Aqui eu construo os encadeamentos necessários, dentro do meu builder
        //Escolho quais configurações modificar

        public Builder texto(String texto){
            this.texto = texto;
            return this;
        }

        public Builder titulo(String titulo){
            this.titulo = titulo;
            return this;
        }

        public Builder categoria(String categoria){
            this.categoria = categoria;
            return this;
        }

        public Post build() {
            return new Post(this);
        }
    }
}