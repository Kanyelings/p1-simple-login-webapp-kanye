package elroykanye.repositories;

import java.util.HashMap;
import java.util.Map;

import elroykanye.beans.User;

public class UserRepository implements CrudRepository {
	Map<String, String> users = new HashMap<String, String>();

	public boolean add(User user) {
		// TODO Auto-generated method stub
		if(!users.containsKey(user.getUsername())) {
			users.put(user.getUsername(), user.getUserpass());
			return true;
		} return false;
	}

	public User get(String username) {
		// TODO Auto-generated method stub
		String upass = users.get(username);
		
		User user = new User();
		user.setUsername(username);
		user.setUserpass(upass);
		
		return upass == null ? user : null;
	}

	public void save(User user) {
		// TODO Auto-generated method stub
		users.replace(user.getUsername(), user.getUserpass());
	}

	public void delete(String username) {
		// TODO Auto-generated method stub
		users.remove(username);
	}
}
