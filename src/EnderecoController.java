
public class EnderecoController {
	private Endereco endereco;
	private EnderecoView view;
	
	public EnderecoController(Endereco endereco) {
		this.endereco = endereco;
		view = new EnderecoView();
	}
	
	public void mostrarEndereco() {
		view.mostrarEndereco(this.endereco);
	}
}
