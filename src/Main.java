import java.time.LocalDate;

public class Main {
	public static void main(String args[]) {
		Cliente vanderson = new Cliente(1, "Vanderson", "000.000.000-00",
				"47-888-888-50", LocalDate.of(1991, 02, 28));
		ClienteController cliente = new ClienteController(vanderson);
		cliente.consultarCliente();
	}
}
