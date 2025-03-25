package com.test.dao;

import java.util.List;

import com.test.entity.Players;

public interface playerdao {
	
	public Players savePlayer(Players player);
	public List<Players> getPlayers();
	public List<Players> deletePlayer(Players player);
	public List<Players> getPlayerByNo(Players player);
	public List<Players> updatePlayer(Players player);

}

