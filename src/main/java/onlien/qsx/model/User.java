package onlien.qsx.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String userName;
	private String password;
	//重复密码
	private String verifyPassword;
	private String email;
	private String sex;
	//创建时间
	private Date creationTime;
	//更新时间
	private Date updateTime;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getVerifyPassword() {
		return verifyPassword;
	}
	public void setVerifyPassword(String verifyPassword) {
		this.verifyPassword = verifyPassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public User(String userName, String password, String verifyPassword, String email, String sex, Date creationTime,
			Date updateTime) {
		super();
		this.userName = userName;
		this.password = password;
		this.verifyPassword = verifyPassword;
		this.email = email;
		this.sex = sex;
		this.creationTime = creationTime;
		this.updateTime = updateTime;
	}
	public User(Long id) {
		super();
		this.id = id;
	}
	public User(Long id, String userName, String password, String verifyPassword, String email, String sex,
			Date creationTime, Date updateTime) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.verifyPassword = verifyPassword;
		this.email = email;
		this.sex = sex;
		this.creationTime = creationTime;
		this.updateTime = updateTime;
	}
	public User() {
		super();
	}
	
}
