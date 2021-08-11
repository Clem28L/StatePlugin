package fr.clem.stateplugin.state;

import java.util.ArrayList;

import org.bukkit.entity.Player;

public class State {
	
	private String name_of_state ;
	private String manager ;
	private ArrayList member = new ArrayList();
	
	public State(String name_of_state, Player manager, Player member) {
		// TODO Auto-generated constructor stub
		this.name_of_state = name_of_state;
		this.manager = manager; 
		
	}

	public String getName_of_state() {
		return name_of_state;
	}

	public void setName_of_state(String name_of_state) {
		this.name_of_state = name_of_state;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public ArrayList getMember() {
		return member;
	}

	public void setMember(ArrayList member) {
		this.member = member;
	}
	
}
