package com.test.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.PlayersRepository.PlayersRepository;
import com.test.entity.Players;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DaoImp implements playerdao
{

	@Autowired
	public PlayersRepository repo;
	
	
	public void setRepo(PlayersRepository repo) {
		this.repo = repo;
	}

	
	@Override //create players
	public Players savePlayer(Players player) {
		
		return repo.save(player);
	}

	@Override
	public List<Players> getPlayers() {
		
		return repo.findAll();
	}

	@Override
	public List<Players> deletePlayer(Players player) {
	
		repo.delete(player);
		return repo.findAll();		
	}

	@Override
	public List<Players> getPlayerByNo(Players player) {
	
		repo.save(player);
		return repo.findAll();
	}

	@Override
	public List<Players>  updatePlayer(Players player) {
		
		repo.save(player);
		return repo.findAll();
	}

}
