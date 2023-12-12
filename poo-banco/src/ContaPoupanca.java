public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("Conta Poupança Extrato: ");
        super.imprimirInfosComuns();
    }

    @Override
    public String toString() {
        return String.format("Conta Poupanca - Codigo: %d", this.getNumero());
    }
}
