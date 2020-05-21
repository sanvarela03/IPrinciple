package models.personajes.service.BayMaxTurbo;

import models.interfaces.IVolar;

public class VolarBayMaxTurbo implements IVolar {

	@Override
	public void volar() {
		System.out.println("BayMaxTurbo -> Volar");
	}

}
