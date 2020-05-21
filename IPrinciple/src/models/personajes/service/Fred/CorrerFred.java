package models.personajes.service.Fred;

import models.interfaces.ICorrer;

public class CorrerFred implements ICorrer {

	@Override
	public void correr() {
		System.out.println("Fred -> Correr");
	}

}
