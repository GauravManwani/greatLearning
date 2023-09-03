package context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextProvider {

		private static ApplicationContext context;
		
		public static ApplicationContext provideContext() {
			if(null==context) {
				context=new ClassPathXmlApplicationContext("config.xml");
			}
			
			return context;
		}
}
