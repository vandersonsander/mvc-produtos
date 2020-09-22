
public class ClienteController {
	private Cliente cliente;
	private ClienteView view;
	
	public ClienteController(Cliente cliente) {
		this.cliente = cliente;
		view = new ClienteView();
	}
	
	public void consultarCliente() {
		view.mostrarCliente(this.cliente);
	}
}
