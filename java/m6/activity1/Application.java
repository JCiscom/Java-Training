package m6.activity1;

import jakarta.persistence.EntityManager;

public class Application {

	   public static void main(String[] args) {
	    	testConnection();
	   }
	   
	   static void testConnection() {
	    	EntityManager em = EntityManagerUtil.getInstance().createEntityManager();
	    	
	    	try {
	    		if(em.isOpen()) {
	    			System.out.println("entity manager open, ready to create transaction");
	    		}
	    		
	    	} finally {
	    		EntityManagerUtil.getInstance().closeEntityManager(em);
	    		EntityManagerUtil.getInstance().shutdownFactory();
	    	}
	  }


}

