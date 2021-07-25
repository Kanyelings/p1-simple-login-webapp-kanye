package elroykanye.repositories;

import elroykanye.beans.User;

public interface CrudRepository {
	boolean add(User user);
	User get(String username);
	void save(User user);
	void delete(String username);
}
