package tn.edu.esprit.sigma.fusion.youbayclient.locator;

import java.util.HashMap;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ServiceLocator {
	private static Context context;
	private static Map<String, Object> cache;
	private static ServiceLocator instance;

	public ServiceLocator() {
		try {
			context = new InitialContext();
			cache = new HashMap<String, Object>();
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	public static ServiceLocator getInstance() {
		if (instance == null) {
			instance = new ServiceLocator();
		}
		return instance;
	}

	public synchronized Object getProxy(String jndiName) {
		Object object = null;
		object = cache.get(jndiName);
		if (object == null) {
			try {
				object = context.lookup(jndiName);
				cache.put(jndiName, object);
			} catch (NamingException e) {
				e.printStackTrace();
			}
		}
		return object;
	}

}
