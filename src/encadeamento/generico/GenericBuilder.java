package encadeamento.generico;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

//Os atributos não podem mais ser imutáveis
//Aqui a implementação de uma builder pattern possui muitos lambdas
public class GenericBuilder <T> {

    private final Supplier<T> fornecedor;

    private GenericBuilder(Supplier<T> fornecedor){
        this.fornecedor = fornecedor;
    }

    public static <T> GenericBuilder<T> de(Supplier<T> fornecedor){
        return new GenericBuilder<>(fornecedor);
    }

    public <P> GenericBuilder<T> com(BiConsumer<T, P> consumidor, P valor){
        return new GenericBuilder<>(() -> {
           T objeto = fornecedor.get();
           consumidor.accept(objeto, valor);
           return objeto;
        });
    }

    public T build(){
        return fornecedor.get();
    }
}
