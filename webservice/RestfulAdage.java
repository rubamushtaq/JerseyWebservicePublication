package webservice;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import model.Adages;

/**
 * This is jersey implementation as it extends Application class It uses
 * {@code ApplicationPath} that defines URI or Base URI because there should be some point to
 * access application and here this path serves as a base uri where all resources which acts a restful webservice
 * are registered.
 * This class is necessary to let communicate between servlet container and service
 * and also for  stand alone java application
 * @author Ruba
 *
 */
@ApplicationPath("/resourcesA/")

/**
 * {@code Application} is used to deploy  JAX-RS implementations resources. It is like a container where all resources
 * are deployed and to get to these resources from client we need to used {@code ApplicationPath} and inside server we can get getClasses method.
 * It works like an end point and a middle layer reach to get resource
 * @author Ruba
 *
 */
public class RestfulAdage extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> set = new HashSet<Class<?>>();
        // {@code Adges} is a resource which would be producing and consuming request
		set.add(Adages.class);
		return set;
	}
}
