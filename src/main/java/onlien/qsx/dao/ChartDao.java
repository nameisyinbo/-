package onlien.qsx.dao;

import java.util.List;
import java.util.Map;

import onlien.qsx.model.SexNumber;

public interface ChartDao {
	List<Map<String,Object>> queryUserSex(SexNumber sexNumber);
}
