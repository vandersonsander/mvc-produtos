
public class PedidoView {
	public void mostrarPedido(Pedido pedido) {
		System.out.println("Nfe:" + pedido.getNfe() + "\nValor Total R$ " + 
				pedido.getValorTotal()
				);
	}
}
