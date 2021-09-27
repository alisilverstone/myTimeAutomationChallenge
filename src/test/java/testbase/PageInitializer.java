package testbase;

import pages.ConsumerPageElements;


public class PageInitializer extends BaseClass{

	
	protected static ConsumerPageElements consumerPage;
	
	public static void initializePageObjects() {
	
		consumerPage = new ConsumerPageElements();
		
	}
}
