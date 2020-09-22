import java.time.LocalDate;

public class Cliente {
	/* nome, cpf, rg, dataNascimento*/
	private int idCliente;
	private String nome;
	private String cpf;
	private String rg;
	private LocalDate dataNascimento;
	
	public Cliente(int idCliente, String nome, String cpf, String rg, LocalDate dataNascimento) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
	}
	
	public int getIdCliente() {
		return this.idCliente;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
