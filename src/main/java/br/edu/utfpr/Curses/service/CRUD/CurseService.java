package br.edu.utfpr.Curses.service.CRUD;

import br.edu.utfpr.Curses.model.Curse;
import br.edu.utfpr.Curses.repository.CurseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public record CurseService(CurseRepository curseRepository) {

    public Curse save(Curse curse){
        log.info("Saving curse {}", curse.getName());
        return curseRepository.saveAndFlush(curse);
    }


}
