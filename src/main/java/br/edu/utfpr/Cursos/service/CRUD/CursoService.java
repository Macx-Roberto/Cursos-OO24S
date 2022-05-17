package br.edu.utfpr.Cursos.service.CRUD;

import br.edu.utfpr.Cursos.model.Curso;
import br.edu.utfpr.Cursos.repository.CursoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public record CursoService(CursoRepository cursoRepository) {

    public Curso save(Curso curso){
        log.info("Saving curse {}", curso.getNome());
        return cursoRepository.saveAndFlush(curso);
    }


}
