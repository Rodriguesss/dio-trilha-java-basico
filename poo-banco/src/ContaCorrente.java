public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("Conta Corrente Extrato: ");
        super.imprimirInfosComuns();
    }

    @Override
    public String toString() {
        return String.format("Conta Corrente - Codigo: %d", this.getNumero());
    }
}
