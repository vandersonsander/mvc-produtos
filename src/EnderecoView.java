
public class EnderecoView {
	
	public void mostrarEndereco(Endereco endereco) {
		System.out.println( "Rua: " + 
				endereco.getRua() + ", nro " + 
				endereco.getNumero() + "\nBairro: " + 
				endereco.getBairro() + "\nCidade: " + 
				endereco.getCidade() + "\nEstado: " + 
				endereco.getEstado()
			);
	}
}
