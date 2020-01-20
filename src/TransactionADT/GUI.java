package TransactionADT;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import java.io.FileNotFoundException;
import java.util.HashMap;

import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;

public class GUI {
	String x = null;
	Transaction[] Transactions = new Transaction[284807];
	double string_value;
	protected Shell shell;
	private Text text;
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			GUI window = new GUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Label lblPleaseSelectWhat = new Label(shell, SWT.NONE);
		lblPleaseSelectWhat.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.ITALIC));
		lblPleaseSelectWhat.setAlignment(SWT.CENTER);
		lblPleaseSelectWhat.setBounds(10, 29, 412, 20);
		lblPleaseSelectWhat.setText("Please select what you would like to do with the data");
		
		Label lblSearching = new Label(shell, SWT.NONE);
		lblSearching.setBounds(303, 58, 70, 20);
		lblSearching.setText("Searching");
		
		Group group = new Group(shell, SWT.NONE);
		group.setBounds(142, 55, 111, 67);
		
		Button btnRadioButton = new Button(group, SWT.RADIO);
		btnRadioButton.setBounds(0, 10, 111, 20);
		btnRadioButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					Transactions = transactionFile.readFile();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				x = "A";
			}
		});
		btnRadioButton.setText("Ascending");
		
		Button btnDescending = new Button(group, SWT.RADIO);
		btnDescending.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					Transactions = transactionFile.readFile();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				x = "D";
			}
		});
		btnDescending.setBounds(0, 36, 111, 20);
		btnDescending.setText("Descending");
		
		Group group_1 = new Group(shell, SWT.NONE);
		group_1.setBounds(10, 81, 111, 86);
		
		Button btnRadioButton_1 = new Button(group_1, SWT.RADIO);
		btnRadioButton_1.setBounds(0, 10, 111, 20);
		btnRadioButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				QuickSort.sort(Transactions,x,0);
				for (int i = 0; i < Transactions.length; i++) {
					System.out.println(Transactions[i].getTime());
				}
			}
		});
		btnRadioButton_1.setText("Time");
		
		Button btnRadioButton_2 = new Button(group_1, SWT.RADIO);
		btnRadioButton_2.setBounds(0, 36, 111, 20);
		btnRadioButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				QuickSort.sort(Transactions, x, 1);
				for (int i = 0; i < Transactions.length; i++) {
					System.out.println(Transactions[i].getAmount());
				}
			}
		});
		btnRadioButton_2.setText("Amount");
		
		Button btnFraud = new Button(group_1, SWT.RADIO);
		btnFraud.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				QuickSort.sort(Transactions, x, 2);
				for (int i = 0; i < Transactions.length; i++) {
					System.out.println(Transactions[i].getFraud());
				}
			}
		});
		btnFraud.setBounds(0, 62, 111, 20);
		btnFraud.setText("Fraud");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(303, 88, 78, 26);
		
		Group group_2 = new Group(shell, SWT.NONE);
		group_2.setBounds(303, 132, 114, 87);
		
		Button btnRadioButton_3 = new Button(group_2, SWT.RADIO);
		btnRadioButton_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				QuickSort.sort(Transactions, x, 0);
				string_value = Double.parseDouble(text.getText());
				BinarySearch.binarySearchTime(Transactions, string_value, x);
			}
		});
		btnRadioButton_3.setBounds(0, 10, 111, 20);
		btnRadioButton_3.setText("Time");
		
		Button btnAmount = new Button(group_2, SWT.RADIO);
		btnAmount.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			QuickSort.sort(Transactions, x, 1);
			string_value = Double.parseDouble(text.getText());
			BinarySearch.binarySearchAmount(Transactions, string_value, x);
			}
		});
		btnAmount.setBounds(0, 37, 111, 20);
		btnAmount.setText("Amount");
		
		Button btnFraud_1 = new Button(group_2, SWT.RADIO);
		btnFraud_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			QuickSort.sort(Transactions, x, 2);
			string_value = Integer.parseInt(text.getText());
			BinarySearch.binarySearchFraud(Transactions, string_value, x);
			}
		});
		btnFraud_1.setBounds(0, 63, 111, 20);
		btnFraud_1.setText("Fraud");
		
		Label lblSorting = new Label(shell, SWT.NONE);
		lblSorting.setBounds(10, 55, 70, 20);
		lblSorting.setText("Sorting");
		
		Label lblCreditcard = new Label(shell, SWT.NONE);
		lblCreditcard.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblCreditcard.setAlignment(SWT.CENTER);
		lblCreditcard.setBounds(123, 3, 136, 20);
		lblCreditcard.setText("CreditCleaner");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(10, 183, 96, 20);
		lblNewLabel.setText("Graph");
		
		Button btnRadioButton_4 = new Button(shell, SWT.RADIO);
		btnRadioButton_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Digraph G = new Digraph(10000);
				HashMap<String, Integer> map = new HashMap<>();
				int counter = 0;
				for (int i = 0; i < Transactions.length; i++) {
					if (Transactions[i].getFraud() == 1) {
						map.put(Transactions[i].getEncrypted()[20], counter);
						map.put(Transactions[i].getEncrypted()[22], counter + 1);
						G.addEdge(2, 3);
						counter += 2;
					}
				}
				System.out.println("Graph created with " + G.E() + " edges.");
			}
		});
		btnRadioButton_4.setBounds(10, 212, 111, 20);
		btnRadioButton_4.setText("Create graph");

	}
}
