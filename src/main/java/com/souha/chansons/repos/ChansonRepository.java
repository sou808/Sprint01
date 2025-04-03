package com.souha.chansons.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.souha.chansons.entities.Chanson;


public interface ChansonRepository extends JpaRepository<Chanson, Long> {
}
