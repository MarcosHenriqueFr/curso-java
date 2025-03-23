package records;

public class RecordsTeste {
    public static void main(String[] args) {

        //Records são finals
        Veiculo v1 = new Veiculo("Porsche", "ADV-392");
        Veiculo v2 = new Veiculo("Ferrari");

        System.out.println(v1.marca());
        System.out.println(v1.placa());

        System.out.println(v1);
        System.out.println(v2);

        //Posso ter metodos estáticos
        System.out.println(Veiculo.marcaMaiuscula(v2));
    }
}

//Vieram no Java 14
//São classes unicamente de dados, quando eu pego dados de um banco
//Possuem getters, tostring, hashcode e equals já preescritos
//Possui parenteses para os valores a serem recebidos e faz automaticamente o construtor

record Veiculo(String marca, String placa){
    //Um segundo construtor
    public Veiculo(String marca){
        this(marca, null);
    }

    public static String marcaMaiuscula(Veiculo veiculo){
        return veiculo.marca().toUpperCase();
    }
}
