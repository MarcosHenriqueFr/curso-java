package enums.map;

import java.util.EnumMap;

public class Teste {

    //Constantes de Enum, substituiu as constantes inteiras e reserva somente para essas 4 constantes
    private enum Nivel {
        ALTO, MEDIO, BAIXO;
    }
    public static void main(String[] args) {
        //Chave e Valor, também é possível ter um EnumSet, de acordo com a necessidade
        EnumMap<Nivel, String> enumMap = new EnumMap<>(Nivel.class);
        enumMap.put(Nivel.ALTO, "Nível Alto");
        enumMap.put(Nivel.MEDIO, "Nível Médio");
        enumMap.put(Nivel.BAIXO, "Nível Baixo");

        String NivelObtido = enumMap.get(Nivel.ALTO);
        System.out.println(NivelObtido);
    }
}
