package models.personajes;

import models.commons.Personaje;
import models.interfaces.ICaminar;
import models.interfaces.ICorrer;
import models.interfaces.IVolar;
import models.personajes.service.BayMax.CaminarBayMax;
import models.personajes.service.BayMax.CorrerBayMax;
import models.personajes.service.BayMaxTurbo.VolarBayMaxTurbo;

public class BayMaxTurbo extends Personaje implements IVolar, ICaminar, ICorrer {

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

	@Override
	public void volar() {
		IVolar volar = new VolarBayMaxTurbo();
		volar.volar();
	}

}
