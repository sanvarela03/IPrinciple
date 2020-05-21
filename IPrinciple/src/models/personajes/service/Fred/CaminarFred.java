package models.personajes.service.Fred;

import models.interfaces.ICaminar;

public class CaminarFred implements ICaminar {

	@Override
	public void caminar() {
		System.out.println("Fred -> Caminar");
	}

}
