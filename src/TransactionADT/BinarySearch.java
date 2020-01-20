package TransactionADT;

class BinarySearch { 
	
    static void binarySearchAmount(Transaction arr[], double x, String direction) 
    { 	
    	int size = arr.length;
    	int low = 0;
    	int high = size - 1;
    	
    	if (!(direction.equalsIgnoreCase("a") || direction.equalsIgnoreCase("d"))) 
		{
			System.out.println("The second parameter must be either a, A, d, or D."
					+ "\n a or A are for sorting in ascending order."
					+ "\n d or D are for sorting in descending order.");
		}
    	if (direction.equalsIgnoreCase("a")) {
    		int found = 0;
        	while(high >= low) {
        		int middle = (low + high) / 2;
        		if(arr[middle].getAmount() == x) {
        			System.out.println("Element found: " + x);
        			System.out.println("Index of Element: " + middle);
        			found = 1;
        			break;
        			}
        		else if(arr[middle].getAmount() < x ) {
        			low = middle + 1;
        		}
        		else if(arr[middle].getAmount() > x) {
        				high = middle - 1;
        		}
        	}
        	if(found == 0) {
        		System.out.println("Element not found");
        	}
    	}
    	
    	if (direction.equalsIgnoreCase("d")) {
    		int found = 0;
    		while(high >= low) {
        		int middle = (low + high) / 2;
        		if(arr[middle].getAmount() == x) {
        			System.out.println("Element found: " + x);
        			System.out.println("Index of Element: " + middle);
        			found = 1;
        			break;
        			}
        		else if(arr[middle].getAmount() > x ) {
        			low = middle + 1;
        		}
        		else if(arr[middle].getAmount() < x) {
        				high = middle - 1;
        		}
    		}	
    		if(found == 0) {
        		System.out.println("Element not found");
        	}
    	}
    }
    
    
    static void binarySearchFraud(Transaction arr[], double x, String direction) 
    { 	
    	int size = arr.length;
    	int low = 0;
    	int high = size - 1;
    	
    	if (!(direction.equalsIgnoreCase("a") || direction.equalsIgnoreCase("d"))) 
		{
			System.out.println("The second parameter must be either a, A, d, or D."
					+ "\n a or A are for sorting in ascending order."
					+ "\n d or D are for sorting in descending order.");
		}
    	if (direction.equalsIgnoreCase("a")) {
    		int found = 0;
        	while(high >= low) {
        		int middle = (low + high) / 2;
        		if(arr[middle].getFraud() == x) {
        			System.out.println("Element found: " + x);
        			System.out.println("Index of Element: " + middle);
        			found = 1;
        			break;
        			}
        		else if(arr[middle].getFraud() < x ) {
        			low = middle + 1;
        		}
        		else if(arr[middle].getFraud() > x) {
        				high = middle - 1;
        		}
        	}
        	if(found == 0) {
        		System.out.println("Element not found");
        	}
    	}
    	
    	if (direction.equalsIgnoreCase("d")) {
    		int found = 0;
    		while(high >= low) {
        		int middle = (low + high) / 2;
        		if(arr[middle].getFraud() == x) {
        			System.out.println("Element found: " + x);
        			System.out.println("Index of Element: " + middle);
        			found = 1;
        			break;
        			}
        		else if(arr[middle].getFraud() > x ) {
        			low = middle + 1;
        		}
        		else if(arr[middle].getFraud() < x) {
        				high = middle - 1;
        		}
    		}	
    		if(found == 0) {
        		System.out.println("Element not found");
        	}
    	}
    }
    
    static void binarySearchTime(Transaction arr[], double x, String direction) 
    { 	
    	int size = arr.length;
    	int low = 0;
    	int high = size - 1;
    	
    	if (!(direction.equalsIgnoreCase("a") || direction.equalsIgnoreCase("d"))) 
		{
			System.out.println("The second parameter must be either a, A, d, or D."
					+ "\n a or A are for sorting in ascending order."
					+ "\n d or D are for sorting in descending order.");
		}
    	if (direction.equalsIgnoreCase("a")) {
    		int found = 0;
        	while(high >= low) {
        		int middle = (low + high) / 2;
        		if(arr[middle].getTime() == x) {
        			System.out.println("Element found: " + x);
        			System.out.println("Index of Element: " + middle);
        			found = 1;
        			break;
        			}
        		else if(arr[middle].getTime() < x ) {
        			low = middle + 1;
        		}
        		else if(arr[middle].getTime() > x) {
        				high = middle - 1;
        		}
        	}
        	if(found == 0) {
        		System.out.println("Element not found");
        	}
    	}
    	
    	if (direction.equalsIgnoreCase("d")) {
    		int found = 0;
    		while(high >= low) {
        		int middle = (low + high) / 2;
        		if(arr[middle].getTime() == x) {
        			System.out.println("Element found: " + x);
        			System.out.println("Index of Element: " + middle);
        			found = 1;
        			break;
        			}
        		else if(arr[middle].getTime() > x ) {
        			low = middle + 1;
        		}
        		else if(arr[middle].getTime() < x) {
        				high = middle - 1;
        		}
    		}	
    		if(found == 0) {
        		System.out.println("Element not found");
        	}
    	}
    }
}
