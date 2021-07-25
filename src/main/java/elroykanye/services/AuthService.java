package elroykanye.services;

import elroykanye.beans.User;
import elroykanye.repositories.UserRepository;

public class AuthService {
	UserRepository userRep;
	
	public AuthService(UserRepository ur) {
		userRep = ur;
	}
	
	public boolean login(String username, String password) {
		return userRep.get(username).equals(password);
	}
	
	public boolean register(String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setUserpass(password);
		return userRep.add(user);
	}

}
