package br.edu.ifpb.padroes.domain.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class ExtraCheese implements Pizza {
	
	private Pizza wrapper;
	
	public ExtraCheese(Pizza pizza) {
		wrapper = pizza;
	}

	@Override
	public Float getPrice() {
		return wrapper.getPrice() * 1.10f;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return wrapper.getName() + " (extra cheese)";
	}
}
