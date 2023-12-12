import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Vinicius");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Marcos");

        Banco banco = new Banco();
        banco.setNome("Bradesco");

        Conta cc = new ContaCorrente(cliente1, banco);
        Conta poupanca = new ContaPoupanca(cliente2, banco);

        List<Conta> contas = new ArrayList<>();
        contas.add(cc);
        contas.add(poupanca);

        banco.setContas(contas);
        System.out.println("Lista de conta do banco: ");
        banco.getContas().forEach(System.out::println);
        System.out.println();

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
