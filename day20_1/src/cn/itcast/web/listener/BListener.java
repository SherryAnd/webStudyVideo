package cn.itcast.web.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class BListener
 *
 */
@WebListener
public class BListener implements ServletContextAttributeListener {

    
    public void attributeAdded(ServletContextAttributeEvent scae)  { 
       System.out.println("你向application中添加了一个名为:"+scae.getName()+",值为："+scae.getValue()+"的属性");
    }

	
    public void attributeRemoved(ServletContextAttributeEvent scae)  { 
    	System.out.println("移除属性"+scae.getName());
    }

	
    public void attributeReplaced(ServletContextAttributeEvent scae)  { 
    	//这里的scae.getValue返回的是修改之前的值
        System.out.println(scae.getName()+"="+" "+scae.getValue()+scae.getServletContext().getAttribute(scae.getName()));
    }
	
}
