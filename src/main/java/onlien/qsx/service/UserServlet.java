package onlien.qsx.service;

import java.util.List;

import onlien.qsx.model.Page;
import onlien.qsx.model.User;

public interface UserServlet {
	
	List<User> findAll();
	
	User queryById(User user);
	
	void save(User user);
	
	void remove(User user);
	
	void edit(User user);
	
	int totalCount();
	List<User> pageFind(int pageSize,int pageNo);
}
