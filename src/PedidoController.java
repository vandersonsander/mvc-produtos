
public class PedidoController {
	private PedidoView view;
	private Pedido pedido;
	
	public PedidoController(Pedido pedido) {
		this.pedido = pedido;
		view = new PedidoView();
	}
	
	public void mostrarPedido() {
		view.mostrarPedido(pedido);
	};
	
	public void alterarStatus(String status) {
		pedido.setStatusPedido(status);
	}
}
