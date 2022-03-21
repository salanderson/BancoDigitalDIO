public class Main {

    public static void main(String[] args) {
        Cliente Anderson = new Cliente();
        Anderson.setNome("Anderson Oliveira Saldanha");

        Investimentos Tesouro = new Investimentos();
        Tesouro.setInvestimento("Investiu em Tesouro Direto");

        Conta cc = new ContaCorrente(Anderson);
        Conta poupanca = new ContaPoupanca(Anderson);

       cc.imprimirExtrato();
       poupanca.imprimirExtrato();
    }
}
