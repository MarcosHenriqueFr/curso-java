package lambdas.exemplos;

public class ChecarPessoaParaAposentadoria implements ChecarPessoa{

    @Override
    public boolean teste(Pessoa pessoa){
        return pessoa.getIdade() > 70;
    }
}
