import java.time.LocalDate;

public class Pedido {
	/* nfe, dataEmissao, valorTotal, statusPedido */
	private String nfe;
	private LocalDate dataNascimento;
	private double valorTotal;
	private String statusPedido;
	
	public Pedido(String nfe, LocalDate dataNascimento, double valorTotal, String statusPedido) {
		super();
		this.nfe = nfe;
		this.dataNascimento = dataNascimento;
		this.valorTotal = valorTotal;
		this.statusPedido = statusPedido;
	}
	
	public String getNfe() {
		return nfe;
	}
	public void setNfe(String nfe) {
		this.nfe = nfe;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getStatusPedido() {
		return statusPedido;
	}
	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}
	
}
