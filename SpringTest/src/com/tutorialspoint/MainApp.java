package com.tutorialspoint;



import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class MainApp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		try{XmlBeanFactory factory = new XmlBeanFactory
				(new ClassPathResource("com/tutorialspoint/Beans.xml"));
				HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
				obj.getMessage();
		}
		catch(Exception e)
		{
			System.err.print(e.getMessage());
		}
				
				
				
				ApplicationContext context = new FileSystemXmlApplicationContext
						("C:/Users/hp/workspace/SpringTest/src/com/tutorialspoint/Beans.xml");
			
						SureWorld sureobj = (SureWorld) context.getBean("sureWorld");
						sureobj.getSecondmessage();
						HelloWorld objw = (HelloWorld) context.getBean("helloWorld");
						objw.getMessage();	
				
// using singleton bean 
						
						SingletonBean objA = (SingletonBean) context.getBean("singletonBean");
						objA.setKeyw("I'm object A");
						
						objA.getKeyw();
						
						
						
						
						SingletonBean objB = (SingletonBean) context.getBean("singletonBean");
						objB.getKeyw();
						
					System.out.print("\n");
						
						// using prototype bean :statefull 
						PrototypePOJO proObj = (PrototypePOJO) context.getBean("prototypePOJO");
						proObj.getMessage();
						
						proObj.setMessage("I'm object proto");
						proObj.getMessage();
						
						PrototypePOJO proObj2 = (PrototypePOJO) context.getBean("prototypePOJO");
						proObj2.getMessage();
						
						System.out.print(proObj2.getCount()*100);
						
						
						System.out.print(context.getApplicationName());
						
						
					//	closing context
						((AbstractApplicationContext)context).registerShutdownHook();
	}

}
