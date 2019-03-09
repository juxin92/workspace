package com.juxin.logic.impl;

import com.juxin.logic.Axe;

public class Chinese {
	private Axe axe;

	public void setAxeee(Axe axe) {
		this.axe = axe;
	}

	public void useAxe() {
		System.out.println(axe.chop());
	}
}
