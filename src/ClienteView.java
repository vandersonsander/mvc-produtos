
public class ClienteView {
	
	public void mostrarCliente(Cliente cliente) {
		System.out.println(
			cliente.getIdCliente() + "\nNome :" +
			cliente.getNome() + "\nCPF: " +
			cliente.getCpf() + "\nData de Nascimento: " + 
			cliente.getDataNascimento() + "\nRG: " + 
			cliente.getRg()
		);
	}
}
