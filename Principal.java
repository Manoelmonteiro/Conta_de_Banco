public class Principal {
    public static void main(String[] args) {
        Conta conta01 = new Conta("Manel","01323456798");
        Conta conta02 = new Conta("Victor","456789123");

        conta01.transferencia(conta01,conta02,47.84);

        conta01.imprimeDados();
        conta02.imprimeDados();
    }
}


