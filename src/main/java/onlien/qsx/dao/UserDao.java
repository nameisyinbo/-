package onlien.qsx.dao;

import java.util.List;

import onlien.qsx.model.Page;
import onlien.qsx.model.User;

public interface UserDao {
	List<User> findAll();
	
	User queryById(User user);
	
	void save(User user);
	
	void remove(User user);
	
	void edit(User user);
	
	List<User> pageFind(int pageSize, int pageNo);
	
	int totalCount();
}
