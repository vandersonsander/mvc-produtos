
public class Endereco {
	/* numero, rua, bairro, complemento, cidade, estado */
	private int idEndereco;
	private String numero;
	private String rua;
	private String bairro;
	private String complemento;
	private String cidade;
	private String estado;
	
	public Endereco(int idEndereco, String numero, String rua, String bairro, String complemento,
			String cidade, String estado) {
		this.idEndereco = idEndereco;
		this.numero = numero;
		this.rua = rua;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public int getIdEndereco() {
		return idEndereco;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
