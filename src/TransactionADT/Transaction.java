package TransactionADT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Transaction{
	private final  Double time;
	private final  int fraud ;
	private final Double amount; 
	private final String[] encrypted;
	
	public Transaction(Double time, int f, double d, String[] test1) {
		this.time = time;
		this.fraud = f;
		this.amount = d;
		this.encrypted = test1;
	}
	public Double getTime() {  
		return this.time;
	}
	public Integer getFraud() { 
		return this.fraud;
	}
	public Double getAmount() { 
		return this.amount;
	}
	public String[] getEncrypted() {
		return this.encrypted;
	}
	public Double toDouble(String x) {
		return Double.parseDouble(x);
	}
	public String toString() {
		String x = "Time Elapased (s) : " + this.time + "Amount: " + this.amount + "Fraudulence Status: " + this.encrypted; 
		return x;
	}
	public Integer toInteger(String x) {
		return Integer.parseInt(x);
	}
	
	public static void main(String[] args) {
		String[] test1 = {"a", "b"};
		Transaction test = new Transaction(3.0, 1, 2222.22, test1);
		System.out.println(test.getEncrypted()[0]);
	}
}

	
	

	
