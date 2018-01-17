package onlien.qsx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onlien.qsx.dao.UserDao;
import onlien.qsx.model.Page;
import onlien.qsx.model.User;
import onlien.qsx.service.UserServlet;

@Service
public class UserServletImpl implements UserServlet{
	@Autowired
	private UserDao userDaoImpl;
	public List<User> findAll() {
		
		return userDaoImpl.findAll();
	}

	public User queryById(User user) {
		
		return userDaoImpl.queryById(user);
	}

	public void save(User user) {
		userDaoImpl.save(user);
		
	}

	public void remove(User user) {
		userDaoImpl.remove(user);
		
	}

	public void edit(User user) {
		userDaoImpl.edit(user);		
	}
	//总记录数
	public int totalCount() {
		return userDaoImpl.totalCount() ;
	}

	public List<User> pageFind(int pageSize, int pageNo) {
		return userDaoImpl.pageFind(pageSize, pageNo) ;
	}



}
