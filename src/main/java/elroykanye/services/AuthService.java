package elroykanye.services;

import elroykanye.beans.User;
import elroykanye.repositories.UserRepository;

public class AuthService {
	UserRepository userRep = new UserRepository();
	
	
	public boolean login(String username, String password) {
		if (userRep.get(username) == null) return false;
		else {
			return userRep.get(username).getUserpass().equals(password);
		}
	}
	
	public boolean register(String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setUserpass(password);
		return userRep.add(user);
	}

}
