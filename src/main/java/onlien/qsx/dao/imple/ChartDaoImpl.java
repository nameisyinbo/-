package onlien.qsx.dao.imple;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import onlien.qsx.dao.ChartDao;
import onlien.qsx.model.SexNumber;

public class ChartDaoImpl implements ChartDao{
	@Autowired
	private BaseDao baseDao; 
	public List<Map<String, Object>> queryUserSex(SexNumber sexNumber) {
		String hql="from User where sex=?";
		Session session = (baseDao.getSessionFactory()).openSession();
		Query query = session.createQuery(hql);
		query.setString(0,sexNumber.getSex());
		List list=query.list();
		sexNumber.setNum(list.size());
		return list;
	}

}
