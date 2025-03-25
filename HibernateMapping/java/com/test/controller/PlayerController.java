package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.entity.Players;
import com.test.service.PlayerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class PlayerController {
	
	@Autowired
	private PlayerService service;

	public void setService(PlayerService service) {
		this.service = service;
	}
	
	//create players
	@PostMapping("/save-player")
	public Players savePlayer(@RequestBody Players player)
	{
		return service.savePlayer(player);
	}

	//read players
	@GetMapping("players-list")
	public List<Players> getPlayers()
	{
		return service.getPlayers();
	}
	
	//read by number
	@GetMapping("player/{player_jno}")
	public List<Players> getPlayerByNo(@PathVariable("player_jno") int player_jno,Players player)
	{
		player.setPlayer_jno(player_jno);
		return service.getPlayerByNo(player);
	}
	
	
	//update by number
	@PostMapping("update-player/{player_jno}")
	public List<Players> updatePlayer(@RequestBody Players player,@PathVariable("player_jno") int player_jno)
	{
		player.setPlayer_jno(player_jno);
		return service.updatePlayer(player);
	}
	
	@DeleteMapping("delete-player/{player_jno}")
	public List<Players> deletePlayer(@RequestBody Players player,@PathVariable("player_jno") int player_jno)
	{
		player.setPlayer_jno(player_jno);
		return service.deletePlayer(player);
	}
}
