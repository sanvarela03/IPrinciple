package models.personajes.service.GoGo;

import models.interfaces.ICaminar;

public class CaminarGoGo implements ICaminar {

	@Override
	public void caminar() {
		System.out.println("GoGo -> Caminar");
	}

}
