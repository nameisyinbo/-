package onlien.qsx.dao.imple;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import onlien.qsx.dao.UserDao;
import onlien.qsx.model.Page;
import onlien.qsx.model.User;

@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	private BaseDao baseDao;
	private Page page;
	/**
	 * 查询所有
	 */
	public List<User> findAll() {
		@SuppressWarnings("unchecked")
		List<User> list=(List<User>) baseDao.getHibernateTemplate().find("from User");
		return list;
	}
	/**
	 * 通过Id查询单个
	 */
	public User queryById(User user) {
		// TODO Auto-generated method stub
		return baseDao.getHibernateTemplate().get(User.class, user.getId());
	}
	/**
	 * 增加
	 */
	public void save(User user) {
		user.setCreationTime(new Date());
		user.setUpdateTime(new Date());
		baseDao.getHibernateTemplate().save(user);
	}
	/**
	 * 删除
	 */
	public void remove(User user) {
		baseDao.getHibernateTemplate().delete(user);
		
	}
	/**
	 * 修改
	 */
	public void edit(User user) {
		user.setUpdateTime(new Date());
		baseDao.getHibernateTemplate().update(user);		
	}
	/**
	 * 分页查询
	 */
	public List<User> pageFind(int pageSize, int pageNo) {

		Session session = (baseDao.getSessionFactory()).openSession();

		Query query = session.createQuery(" from User ");
		// hibernate提供的分页查询方法
		query.setMaxResults(pageSize); // 每页显示的数据条数
		query.setFirstResult((pageNo - 1) * pageSize); // 越过的查询数据条数
		List<User> list = query.list();
		
		session.close() ;
		return list;
	}

	public int totalCount() {
		// 查询数据记录总数SQL
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) baseDao.getHibernateTemplate().find("from User");
		int total = list.size();
		return total;
	}

}
