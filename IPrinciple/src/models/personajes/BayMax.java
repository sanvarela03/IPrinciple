package models.personajes;

import models.commons.Personaje;
import models.interfaces.ICaminar;
import models.interfaces.ICorrer;
import models.interfaces.IDesinflarse;
import models.personajes.service.BayMax.CaminarBayMax;
import models.personajes.service.BayMax.CorrerBayMax;
import models.personajes.service.BayMax.DesinflarseBayMax;

public class BayMax extends Personaje implements ICaminar, ICorrer, IDesinflarse {

	@Override
	public void desinflarse() {
		IDesinflarse desinflarse = new DesinflarseBayMax();
		desinflarse.desinflarse();
	}

	@Override
	public void correr() {
		ICorrer correr = new CorrerBayMax();
		correr.correr();
	}

	@Override
	public void caminar() {
		ICaminar caminar = new CaminarBayMax();
		caminar.caminar();
	}

}
