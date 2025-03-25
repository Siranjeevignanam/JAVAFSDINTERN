package com.test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="players")
public class Players {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int player_jno;
	private String player_name;
	private String player_team;
	private String player_role;
	public int getPlayer_jno() {
		return player_jno;
	}
	public void setPlayer_jno(int player_jno) {
		this.player_jno = player_jno;
	}
	public String getPlayer_name() {
		return player_name;
	}
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	public String getPlayer_player_team() {
		return getPlayer_team();
	}
	public String getPlayer_team() {
		return player_team;
	}
	public void setPlayer_player_team(String team) {
		setPlayer_team(team);
	}
	public void setPlayer_team(String team) {
		this.player_team = team;
	}
	public String getRole() {
		return getPlayer_role();
	}
	public String getPlayer_role() {
		return player_role;
	}
	public void setRole(String role) {
		setPlayer_role(role);
	}
	public void setPlayer_role(String role) {
		this.player_role = role;
	}
	
	
}
