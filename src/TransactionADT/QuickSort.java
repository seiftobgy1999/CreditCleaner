package TransactionADT;

public class QuickSort {
	
	private static void exch(Transaction[] a, int i, int j)
	{
		Transaction temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void sort(Transaction[] a, String direction, int which) 
	{
		if (!(which == 0 || which == 1 || which == 2)) 
		{
			System.out.println("The final parameter must be either 0, 1, or 2.\n enter 0 to sort by time"
					+ "\n enter 1 to sort by amount" + "\n enter 2 to sort by fradulence");
			return;
		}
		if (!(direction.equalsIgnoreCase("a") || direction.equalsIgnoreCase("d"))) 
		{
			System.out.println("The second parameter must be either a, A, d, or D."
					+ "\n a or A are for sorting in ascending order."
					+ "\n d or D are for sorting in descending order.");
		}
		StdRandom.shuffle(a);
		if (direction.equalsIgnoreCase("a")) 
		{
			if (which == 0) 
			{
				sortTimeAscending(a, 0, a.length - 1);
			} 
			else if (which == 1) 
			{
				sortAmountAscending(a, 0, a.length - 1);
			} 
			else if (which == 2) 
			{
				sortFradulenceAscending(a, 0, a.length - 1);
			}
		}
		if (direction.equalsIgnoreCase("d")) 
		{
			if (which == 0) 
			{
				sortTimeDescending(a, 0, a.length - 1);
			} 
			else if (which == 1) 
			{
				sortAmountDescending(a, 0, a.length - 1);
			} 
			else if (which == 2) 
			{
				sortFradulenceDescending(a, 0, a.length - 1);
			}
		}
	}

	private static void sortTimeAscending(Transaction[] a, int lo, int hi) 
	{
		if (hi <= lo) return;
		int j = partitionTimeAscending(a, lo, hi); 
		sortTimeAscending(a, lo, j-1); 
		sortTimeAscending(a, j+1, hi);
	}

	private static void sortTimeDescending(Transaction[] a, int lo, int hi) 
	{
		if (hi <= lo) return;
		int j = partitionTimeDescending(a, lo, hi); 
		sortTimeDescending(a, lo, j-1); 
		sortTimeDescending(a, j+1, hi);
	}

	private static void sortAmountAscending(Transaction[] a, int lo, int hi) 
	{
		if (hi <= lo) return;
		int j = partitionAmountAscending(a, lo, hi); 
		sortAmountAscending(a, lo, j-1); 
		sortAmountAscending(a, j+1, hi);
	}

	private static void sortAmountDescending(Transaction[] a, int lo, int hi) 
	{
		if (hi <= lo) return;
		int j = partitionAmountDescending(a, lo, hi); 
		sortAmountDescending(a, lo, j-1); 
		sortAmountDescending(a, j+1, hi);
	}

	private static void sortFradulenceAscending(Transaction[] a, int lo, int hi) 
	{
		if (hi <= lo) return;
		int j = partitionFradulenceAscending(a, lo, hi); 
		sortFradulenceAscending(a, lo, j-1); 
		sortFradulenceAscending(a, j+1, hi);
	}

	private static void sortFradulenceDescending(Transaction[] a, int lo, int hi)
	{
		if (hi <= lo) return;
		int j = partitionFradulenceDescending(a, lo, hi); 
		sortFradulenceDescending(a, lo, j-1); 
		sortFradulenceDescending(a, j+1, hi);
	}

	private static int partitionTimeAscending(Transaction[] a, int lo, int hi) 
	{ 
		int i = lo, j = hi; 
		Transaction v = a[lo]; 
		while (true) 
		{ 
			while (a[++i].getTime() < v.getTime())
				if (i == hi)
					break;
			while (v.getTime() < a[j--].getTime())
				if (j == lo)
					break;
			if (i >= j)
				break;
			exch(a, i, j);
		}
		exch(a, lo, j); 
		return j; 
	}
	private static int partitionTimeDescending(Transaction[] a, int lo, int hi) 
	{ 
		int i = lo, j = hi; 
		Transaction v = a[lo]; 
		while (true) 
		{ 
			while (a[++i].getTime() > v.getTime())
				if (i == hi)
					break;
			while (v.getTime() > a[--j].getTime())
				if (j == lo)
					break;
			if (i >= j)
				break;
			exch(a, i, j);
		}
		exch(a, lo, j); 
		return j; 
	}
	private static int partitionAmountAscending(Transaction[] a, int lo, int hi) 
	{ 
		int i = lo, j = hi + 1; 
		Transaction v = a[lo]; 
		while (true) 
		{ 
			while (a[++i].getAmount() < v.getAmount())
				if (i == hi)
					break;
			while (v.getAmount() < a[--j].getAmount())
				if (j == lo)
					break;
			if (i >= j)
				break;
			exch(a, i, j);
		}
		exch(a, lo, j); 
		return j; 
	}
	private static int partitionAmountDescending(Transaction[] a, int lo, int hi) 
	{ 
		int i = lo, j = hi + 1; 
		Transaction v = a[lo]; 
		while (true) 
		{ 
			while (a[++i].getAmount() > v.getAmount())
				if (i == hi)
					break;
			while (v.getAmount() > a[--j].getAmount())
				if (j == lo)
					break;
			if (i >= j)
				break;
			exch(a, i, j);
		}
		exch(a, lo, j); 
		return j; 
	}
	private static int partitionFradulenceAscending(Transaction[] a, int lo, int hi) 
	{ 
		int i = lo, j = hi + 1; 
		Transaction v = a[lo]; 
		while (true) 
		{ 
			while (a[++i].getFraud() < v.getFraud())
				if (i == hi)
					break;
			while (v.getFraud() < a[--j].getFraud())
				if (j == lo)
					break;
			if (i >= j)
				break;
			exch(a, i, j);
		}
		exch(a, lo, j); 
		return j; 
	}
	private static int partitionFradulenceDescending(Transaction[] a, int lo, int hi) 
	{ 
		int i = lo, j = hi + 1; 
		Transaction v = a[lo]; 
		while (true) 
		{ 
			while (a[++i].getFraud() > v.getFraud())
				if (i == hi)
					break;
			while (v.getFraud() > a[--j].getFraud())
				if (j == lo)
					break;
			if (i >= j)
				break;
			exch(a, i, j);
		}
		exch(a, lo, j); 
		return j; 
	}

}


