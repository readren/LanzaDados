package readren.lanzadados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class ConocedorEstado {

	private static final List<Integer> resultadosPosibles = Arrays.asList(
		2,
		3, 3,
		4, 4, 4,
		5, 5, 5, 5,
		6, 6, 6, 6, 6,
		7, 7, 7, 7, 7, 7,
		8, 8, 8, 8, 8,
		9, 9, 9, 9,
		10, 10, 10,
		11, 11,
		12
	);
	static final ConocedorEstado instance = new ConocedorEstado();

	private final Random random = new Random();
	private final List<Integer> resultadosRemantentes;

	private ConocedorEstado() {
		resultadosRemantentes = new ArrayList<>();
	}

	int iteracion = 0;

	Integer lanzar() {
		this.iteracion += 1;
		if(this.resultadosRemantentes.isEmpty()) {
			this.resultadosRemantentes.addAll(resultadosPosibles);
		}
		final int indice = this.random.nextInt(resultadosRemantentes.size());
		final int resultado = resultadosRemantentes.get(indice);
		resultadosRemantentes.remove(indice);
		return resultado;
	}
}
