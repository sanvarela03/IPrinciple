package models.personajes;

import models.commons.Personaje;
import models.interfaces.ICaminar;
import models.interfaces.ICorrer;
import models.interfaces.ILanzarLlamas;
import models.interfaces.IPatinar;
import models.personajes.service.Fred.CaminarFred;
import models.personajes.service.Fred.CorrerFred;
import models.personajes.service.Fred.LanzarLlamasFred;
import models.personajes.service.Fred.PatinarFred;

public class Fred extends Personaje implements ICaminar, ICorrer, ILanzarLlamas, IPatinar {

	@Override
	public void patinar() {
		IPatinar patinar = new PatinarFred();
		patinar.patinar();
	}

	@Override
	public void lanzarLlamas() {
		ILanzarLlamas lanzarLlamas = new LanzarLlamasFred();
		lanzarLlamas.lanzarLlamas();
	}

	@Override
	public void correr() {
		ICorrer correr = new CorrerFred();
		correr.correr();
	}

	@Override
	public void caminar() {
		ICaminar caminar = new CaminarFred();
		caminar.caminar();
	}

}
