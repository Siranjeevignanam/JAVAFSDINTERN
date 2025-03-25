package com.test.PlayersRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.entity.Players;

@Repository
public interface PlayersRepository extends JpaRepository<Players, Integer>
{

}
