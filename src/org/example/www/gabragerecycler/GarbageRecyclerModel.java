package org.example.www.gabragerecycler;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GarbageRecyclerModel {
	private static int UserID = 0;
	private static int RecyclingID = 0;
	private Map<String, User> users = new HashMap<>();
	private Map<String, List<UserRecycling>> userRecyclings = new HashMap<>();

	public User findUser(String userName) {
		return users.get(userName);
	}
	
	public boolean userExists(String userName) {
		if (findUser(userName)!=null) return true;
		return false;
	}
	
	public User addUser(User user) {
		if (!userExists(user.getUserName())) {
			user.setId(UserID);
			UserID++;
			users.put(user.getUserName(), user);
			List<UserRecycling> recyclings = new ArrayList<>();
			userRecyclings.put(user.getUserName(), recyclings);
			return user;
		}
		return null;
		//Generar errores
	}

	public UserRecycling addUserRecycling(String userName, UserRecycling recycling) {
		User user = this.findUser(userName);
		if (user != null) {
			recycling.setId(RecyclingID);
			RecyclingID++;
			recycling.setUser(user);
			recycling.setDate(new Date(System.currentTimeMillis()));
			userRecyclings.get(userName).add(recycling);
			return recycling;
		}
		return null;
	}
	
	public Recycling getAllRecyclingsByUser(String userName) {
		Recycling out= new Recycling();
		if (userExists(userName)) {
			for (UserRecycling usrRec : this.getRecyclingByUser(userName)) {
				out.setBottles(usrRec.getBottles());
				out.setPaperboard(usrRec.getPaperboard());
				out.setGlass(usrRec.getGlass());
				out.setCans(usrRec.getCans());
				out.setTetrabriks(usrRec.getTetrabriks());
			}
			out.setTons(calculateTons(this.getRecyclingByUser(userName)));
			return out;
		}
		//generar errores
		return null;
		
	}
	
	public List<UserRecycling> getRecyclingByUser(String userName) {
		return this.userRecyclings.get(userName);
		
	}
	
	private float calculateTons(List<UserRecycling> recyclings) {
		return (float) 0.1; //para testear
	}
}
