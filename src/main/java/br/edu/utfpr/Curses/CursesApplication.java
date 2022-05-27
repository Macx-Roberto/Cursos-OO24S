package br.edu.utfpr.Curses;

import br.edu.utfpr.Curses.model.Curse;
import br.edu.utfpr.Curses.service.CRUD.CurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class CursesApplication {

	@Autowired
	private CurseService curseService;

	public static void main(String[] args) {
		SpringApplication.run(CursesApplication.class, args);

	}

	@EventListener(ApplicationReadyEvent.class)
	public void testInsertCurses() {
		curseService.save(
			Curse.builder()
					.description("Teste")
					.name("Teste")
					.category("Teste")
					.build()
		);
	}

}
