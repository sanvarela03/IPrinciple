package models.personajes.service.Fred;

import models.interfaces.IPatinar;

public class PatinarFred implements IPatinar {

	@Override
	public void patinar() {
		System.out.println("Fred -> Patinar");
	}

}
