package rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("")
public class ApplicationConfig extends Application {

	public Set<Class<?>> getClasses() {
        return getRestClasses();
    }
    
	//Auto-generated from RESTful web service wizard
    private Set<Class<?>> getRestClasses() {
		Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
		
		resources.add(com.illimitati.CalculatorRest.class);
		return resources;    
    }
}