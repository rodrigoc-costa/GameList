package com.portifolio.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portifolio.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
