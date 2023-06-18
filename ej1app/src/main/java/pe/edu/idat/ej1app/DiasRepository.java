package pe.edu.idat.ej1app;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Dia;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;



@Component
public class DiasRepository {
	private static final Map<String, Dia> dias = new HashMap<>();

	@PostConstruct
	public void initData() {
		Dia lunes = new Dia();
		lunes.setName("Lunes");
		lunes.setTraduccion("Lun");

		dias.put(lunes.getName(), lunes);


		Dia martes = new Dia();
		martes.setName("Martes");
		martes.setTraduccion("mart");

		dias.put(martes.getName(), martes);


		Dia miercoles = new Dia();
		miercoles.setName("miercoles");
		miercoles.setTraduccion("mier");

		dias.put(miercoles.getName(), miercoles);
	}

	public Dia findDia(String name) {
		Assert.notNull(name, "The dia name must not be null");
		return dias.get(name);
	}
}