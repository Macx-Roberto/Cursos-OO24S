package br.edu.utfpr.Curses.repository;

import br.edu.utfpr.Curses.model.Curse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CurseRepository extends JpaRepository<Curse, UUID> {
}
