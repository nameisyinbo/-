package onlien.qsx.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.opensymphony.xwork2.ActionSupport;

import onlien.qsx.model.Page;
import onlien.qsx.model.User;
import onlien.qsx.service.UserServlet;

@Controller("userAction")
public class UserAction extends ActionSupport {
	@Autowired
	private UserServlet userServlet;
	private User user;
	private List<User> list;
	@Autowired
	private Page page;
	private int pageNo = 1;

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	// 查询所有 localhost:8080/userSpringStrutsHibernate/user!list
	public String list() {
		list = userServlet.findAll();
		return "list";
	}

	// 添加
	public String save() {
		userServlet.save(user);
		return "save";
	}

	// 去添加 localhost:8080/userSpringStrutsHibernate/user!to_save
	public String to_save() {

		return "to_save";
	}

	// 删除
	public String delete() {
		userServlet.remove(user);
		return "delete";
	}

	// 去修改页面
	public String to_edit() {
		user = userServlet.queryById(user);
		return "edit";
	}

	// 做修改
	public String do_edit() {
		userServlet.edit(user);
		return "do_edit";
	}

	// 分页方法 localhost:8080/userSpringStrutsHibernate/user!page
	public String page() {

		page.setPageNo(pageNo);

		page.setTotalCount(userServlet.totalCount());

		list = userServlet.pageFind(page.getPageSize(), page.getPageNo());

		return "page";
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

}
