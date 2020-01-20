package TransactionADT;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap; 
import java.util.Map; 


	public class  Digraph {   
		private final int V;   
		private int E;   
		private Bag<Integer>[] adj;   
		public Digraph(int V)   {      
			this.V = V;      
			this.E = 0;      
			adj = (Bag<Integer>[]) new Bag[V];      
			for (int v = 0; v < V; v++)          
				adj[v] = new Bag<Integer>();   
			}   
		public int V()  {  
			return V;  } 
		
		public int E()  {  
			return E;  }  
		
		public void addEdge(int v, int w)   {      
			adj[v].add(w);      
			E++;   
			}   
		public Iterable<Integer> adj(int v)   {  
			return adj[v];  
			}   
		public Digraph reverse()   {      
			Digraph R = new Digraph(V);      
			for (int v = 0; v < V; v++)         
				for (int w : adj(v))            
					R.addEdge(w, v);      
			return R;   
			} 
		
		public static void main() throws FileNotFoundException{
			System.out.println("Dog");
			Digraph G = new Digraph(10000);
			Transaction[] Transactions = transactionFile.readFile();
			
			//make hash table 
			HashMap<String, Integer> map = new HashMap<>(); 
			
	        System.out.println(map); 
	        int counter=0;
			for(int i=0;i<Transactions.length;i++) {
				if (((Transactions[i]).getFraud())==1) {
					map.put((Transactions[i].getEncrypted())[20], counter);  //hash the the customer ID
					map.put((Transactions[i].getEncrypted())[22], counter+1); //hash the merchant ID
					G.addEdge(2,3); //add an edge between the customer and merchant
					counter=counter+2;
				}
			System.out.println(G.E());
			 
			 
			}
		}
	}

	
	
