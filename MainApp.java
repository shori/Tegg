package com.PostProcessorsPackage;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("com/PostProcessorsPackage/Beans.xml");
				PHelloWorld obj = (PHelloWorld) context.getBean("phelloWorld");
				obj.getMessage();
				context.registerShutdownHook();
				
				
				//((AbstractApplicationContext)context).registerShutdownHook();
		
	}

}
