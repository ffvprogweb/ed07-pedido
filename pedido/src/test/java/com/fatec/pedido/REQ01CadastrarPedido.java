package com.fatec.pedido;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.fatec.pedido.model.Pedido;

class REQ01CadastrarPedido {

	@Test
	void ct01_cadastrar_pedido_data_valida() {
		Pedido p = new Pedido();
		p.setPrevisaoEntrega("02/12/2023");
		assertEquals("02/12/2023", p.getPrevisaoEntrega());
	}

	@Test
	void ct02_cadastrar_pedido_data_invalida() {
		Pedido p = new Pedido();
		try {
			p.setPrevisaoEntrega("31/02/2023");
		} catch (IllegalArgumentException e) {
			assertEquals("Data invalida", e.getMessage());
		}

	}
}
