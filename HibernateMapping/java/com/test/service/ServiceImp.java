package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.playerdao;
import com.test.entity.Players;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ServiceImp implements PlayerService{

	@Autowired
	private playerdao pdao;
	
	@Override
	public Players savePlayer(Players player) {
		
		return pdao.savePlayer(player);
	}

	@Override
	public List<Players> getPlayers() {
		
		return pdao.getPlayers();
	}

	@Override
	public List<Players> deletePlayer(Players player) {
		
		return pdao.deletePlayer(player);
	}

	@Override
	public List<Players> getPlayerByNo(Players player) {
		
		return pdao.getPlayerByNo(player);
	}

	@Override
	public  List<Players> updatePlayer(Players player) {
		
		return pdao.updatePlayer(player);
	}

}
