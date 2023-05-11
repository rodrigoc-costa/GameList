package com.portifolio.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portifolio.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
