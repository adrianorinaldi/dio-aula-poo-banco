import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente("Venilton");
		Cliente adriano = new Cliente("Adriano");

		Banco bb = new Banco();
		List<Conta> contas = new ArrayList<>();

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		Conta cc2 = new ContaCorrente(adriano);
		Conta poupanca2 = new ContaPoupanca(adriano);

		cc2.depositar(200);
		cc2.transferir(50, poupanca2);

		contas.add(cc);
		contas.add(poupanca);
		contas.add(cc2);
		contas.add(poupanca2);
		bb.setContas(contas);

		bb.listaClientes();
		
		//cc.imprimirExtrato();
		//poupanca.imprimirExtrato();
	}

}
