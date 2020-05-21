package main;

import models.interfaces.ICaminar;
import models.interfaces.ICorrer;
import models.interfaces.IDesinflarse;
import models.interfaces.ILanzarLlamas;
import models.interfaces.IPatinar;
import models.interfaces.IVolar;
import models.personajes.BayMax;
import models.personajes.BayMaxTurbo;
import models.personajes.Fred;
import models.personajes.GoGo;

public class Print {

	public static void main(String[] args) {

		BayMax personaje1 = new BayMax();
		caminar(personaje1);
		correr(personaje1);
		desinflarse(personaje1);

		System.out.println();

		BayMaxTurbo personaje2 = new BayMaxTurbo();
		caminar(personaje2);
		correr(personaje2);
		volar(personaje2);

		System.out.println();

		GoGo personaje3 = new GoGo();
		caminar(personaje3);
		correr(personaje3);
		patinar(personaje3);

		System.out.println();

		Fred personaje4 = new Fred();
		caminar(personaje4);
		correr(personaje4);
		lanzarLlamas(personaje4);
		patinar(personaje4);

	}

	public static void caminar(ICaminar caminar) {
		caminar.caminar();
	}

	public static void correr(ICorrer correr) {
		correr.correr();
	}

	public static void desinflarse(IDesinflarse desinflarse) {
		desinflarse.desinflarse();
	}

	public static void lanzarLlamas(ILanzarLlamas lanzarLlamas) {
		lanzarLlamas.lanzarLlamas();
	}

	public static void patinar(IPatinar patinar) {
		patinar.patinar();
	}

	public static void volar(IVolar volar) {
		volar.volar();
	}
}
