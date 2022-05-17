package br.edu.utfpr.Cursos;

import br.edu.utfpr.Cursos.model.Curso;
import br.edu.utfpr.Cursos.service.CRUD.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class CursosApplication {

	@Autowired
	private CursoService cursoService;

	public static void main(String[] args) {
		SpringApplication.run(CursosApplication.class, args);

	}

	@EventListener(ApplicationReadyEvent.class)
	private void testarInsertCursos() {
		cursoService.save(
			Curso.builder()
					.descricao("Teste")
					.nome("Teste")
					.categoria("Teste")
					.build()
		);
	}

}
