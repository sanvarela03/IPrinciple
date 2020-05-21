package models.personajes;

import models.commons.Personaje;
import models.interfaces.ICaminar;
import models.interfaces.ICorrer;
import models.interfaces.IPatinar;
import models.personajes.service.GoGo.CaminarGoGo;
import models.personajes.service.GoGo.CorrerGoGo;
import models.personajes.service.GoGo.PatinarGoGo;

public class GoGo extends Personaje implements ICorrer, ICaminar, IPatinar {

	@Override
	public void patinar() {
		IPatinar patinar = new PatinarGoGo();
		patinar.patinar();
	}

	@Override
	public void caminar() {
		ICaminar caminar = new CaminarGoGo();
		caminar.caminar();
	}

	@Override
	public void correr() {
		ICorrer correr = new CorrerGoGo();
		correr.correr();
	}

}
