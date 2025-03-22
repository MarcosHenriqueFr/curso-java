package encadeamento.generico;

public class Teste {
    public static void main(String[] args) {
        GenericPost p = GenericBuilder.de(GenericPost::new)
                .com(GenericPost::setTitulo, "Titulo Padrão")
                .com(GenericPost::setCategoria, "Categoria padrão")
                .build();

        //Consigo fazer um builder genérico para qualquer objeto que eu queira
        GenericPost p2 = GenericBuilder.de(GenericPost::new)
                        .com(GenericPost::setTitulo, "Novo Cinema abre")
                        .com(GenericPost::setCategoria, "Notícia")
                        .com(GenericPost::setTexto, "Nessa tarde de sexta, um novo cinema abre!!!")
                        .build();

        //Uso a classe de builder toda como static
        //Aqui não faz tanto sentido porque eu necessito que todos os valores existam
        GenericAluno a1 = GenericBuilder.de(GenericAluno::new)
                        .com(GenericAluno::setNome, "Carlos Gomes")
                        .com(GenericAluno::setIdade, 19)
                        .com(GenericAluno::setNotaFinal, 8.75)
                        .build();


        System.out.println(p);
        System.out.println(p2);
        System.out.println(a1);
    }
}
