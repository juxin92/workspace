package com.juxin.person;

import com.juxin.logic.AxeLogic;

public class Chinese {
	private AxeLogic axe;

	public void setAxe(AxeLogic axe) {
		this.axe = axe;
	}

	public String useAxe() {
		return "ÖÐ¹úÈË" + axe.purpose();
	}

}
