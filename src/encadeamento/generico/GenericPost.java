package encadeamento.generico;

public class GenericPost {
    private String titulo;
    private String texto;
    private String categoria;

    public String getTitulo(){
        return titulo;
    }

    public String getTexto(){
        return texto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString(){
        return String.format("%s: %s\n%s", categoria, titulo, texto);
    }
}
