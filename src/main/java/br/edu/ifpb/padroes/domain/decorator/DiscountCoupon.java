package br.edu.ifpb.padroes.domain.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class DiscountCoupon implements Pizza {

	private Pizza wrapper;
	
	public DiscountCoupon(Pizza pizza) {
		wrapper = pizza;
	}

	@Override
	public Float getPrice() {
		return wrapper.getPrice() * 0.25f;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return wrapper.getName();
	}
}
