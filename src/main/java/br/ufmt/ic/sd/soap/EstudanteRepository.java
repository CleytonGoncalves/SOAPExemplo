package br.ufmt.ic.sd.soap;

import org.springframework.stereotype.Component;
import soap.sd.ic.ufmt.br.estudantes.Estudante;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class EstudanteRepository {
	private static final Map<String, Estudante> estudantes = new HashMap<>();
	
	@PostConstruct
	public void initData() {
		Estudante joaozin = new Estudante();
		joaozin.setNome("Joaozin");
		joaozin.setRga("201611310023");
		joaozin.setCurso("Ciencia da Computacao");
		estudantes.put(joaozin.getRga(), joaozin);
		
		Estudante mariazinha = new Estudante();
		mariazinha.setNome("Mariazin");
		mariazinha.setRga("201611310024");
		mariazinha.setCurso("Medicina");
		estudantes.put(mariazinha.getRga(), mariazinha);
	}
	
	public Estudante findEstudante(String rga) {
		return estudantes.get(rga);
	}
	
	public void addEstudante(Estudante estudante) {
		estudantes.put(estudante.getRga(), estudante);
	}
	
	
}
