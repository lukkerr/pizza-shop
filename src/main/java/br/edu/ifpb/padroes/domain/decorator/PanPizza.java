package br.edu.ifpb.padroes.domain.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class PanPizza implements Pizza {

	private Pizza wrapper;
	
	public PanPizza(Pizza pizza) {
		wrapper = pizza;
	}

	@Override
	public Float getPrice() {
		return wrapper.getPrice() * 1.15f;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return wrapper.getName() + " (pan pizza)";
	}
}
