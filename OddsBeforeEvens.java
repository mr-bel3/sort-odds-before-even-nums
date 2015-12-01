
public class OddsBeforeEvens
{
	public static void moveOddsBeforeEvens(int list[])
	{
		int listOfNums [] = new int [list.length];
		for (int i = 0; i < list.length; i++)
		{
			if ((list[i] % 2 == 0))
			{
				swap(list, i, i++);
			}
		}
	}
	
	public static void swap(int list[], int num1 , int num2)
	{
		int hold;
		hold = list[num1];
		list[num1] = list[num2];
		list[num2] = hold;
	}
	
	public static void printArray (int list [])
	{
		for(int i = 0; i < list.length; i++)
		{
			System.out.println( list[i]);
		}
	}
	
	public static void main(String[] args)
	{
		 int list[] = {5, 6, 3, 1, 10, 7, 8, 11, 201, 198, 43};
		   System.out.println("Original list:");
		   printArray(list);
		   moveOddsBeforeEvens(list);
		   System.out.println("\nOdds before evens list:");
		   printArray(list);
	}

}
