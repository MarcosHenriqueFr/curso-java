package annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestePessoa {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("Manuela", 21);
        if(p.getClass().isAnnotationPresent(Importante.class)){
            System.out.println("Isso é importante");
        } else {
            System.out.println("Não é importante");
        }

        //Usando Reflection -> ESTUDAR
        //Passa por todos os fields do meu objeto
        for (Field field: p.getClass().getDeclaredFields()){

            //Se ele tiver a annotation especificada
            if(field.isAnnotationPresent(StringImportante.class)){
                try {
                    Object valor = field.get(p);
                    if(valor instanceof String valorString) {
                        System.out.println(valorString.toUpperCase());
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        //entra na minha classe e analisa os metodos que possuem a annotation
        for(Method m: p.getClass().getDeclaredMethods()){
            if(m.isAnnotationPresent(ExecuteImediatamente.class)){
                ExecuteImediatamente annotation = m.getAnnotation(ExecuteImediatamente.class);
                for(int i = 0; i < annotation.vezes(); i++){
                    try {
                        m.invoke(p);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

    }
}
