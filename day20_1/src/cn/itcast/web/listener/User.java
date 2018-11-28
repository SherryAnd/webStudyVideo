package cn.itcast.web.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class User implements HttpSessionBindingListener{
	
	
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("session添加我了");
	
	}
	
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("session抛弃我了");
		
	}
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public User() {
		super();
	}
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	

}
