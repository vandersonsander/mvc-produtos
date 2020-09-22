
public class Telefone {
	/* ddd, nro */
	private String ddd;
	private String nro;
	
	public Telefone(String ddd, String nro) {
		super();
		this.ddd = ddd;
		this.nro = nro;
	}
	
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNro() {
		return nro;
	}
	public void setNro(String nro) {
		this.nro = nro;
	}
	
}
