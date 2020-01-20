package TransactionADT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class transactionFile {
	public static Transaction[] readFile() throws FileNotFoundException {
		Transaction[] Transactions = new Transaction[284807];

		File file = new File("data\\creditcard.csv");
		Scanner scan = new Scanner(file);
		int counter = 0;
		scan.nextLine();
		while (scan.hasNextLine()) {
			String current_line = scan.nextLine();
			String[] split_array = current_line.split(",");
			for (int z = 0; z < split_array.length; z++) {
				split_array[z] = split_array[z].replaceAll("\"", "");
			}
			String[] encrypted = new String[28];
			int j = 0;
			for (int i = 1; i < 29; i++) {
				encrypted[j] = split_array[i];
				j++;
			}
			Transaction x = new Transaction(Double.parseDouble(split_array[0]), Integer.parseInt(split_array[30]),
					Double.parseDouble(split_array[29]), encrypted);
			Transactions[counter] = x;

			counter++;

		}
		return Transactions;
	}
}
