package cn.itcast.web.listener;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
/**
 * ServletContext生死监听
 * @author wfm11
 * 可以在监听器存放一些在tomcat启动时就要完成的代码
 */
public class AListener implements ServletContextListener{

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Birth");
	}
	
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("die");
	}


	

}
