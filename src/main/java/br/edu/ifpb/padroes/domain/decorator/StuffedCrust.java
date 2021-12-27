package br.edu.ifpb.padroes.domain.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class StuffedCrust implements Pizza {

	private Pizza wrapper;
	
	public StuffedCrust(Pizza pizza) {
		wrapper = pizza;
	}

	@Override
	public Float getPrice() {
		return wrapper.getPrice() * 1.20f;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return wrapper.getName() + " (stuffed crust)";
	}
}
