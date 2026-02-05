// Implementation of Binary Search to search for a record/object of a student
import java.util.Scanner;

class Student
{
	int rollno;
	String name;
	double per;   // avoid float bcoz of type conversion issues
}

class Binary_Search
{
	static int comp_count = 0;   // imp, the search() can return a single value only and it's 
				// returning the position of record reqd by user. Hence 
				// declare a global/shared var and as static methods can
				// refer to static members of the class, declare this var as
				// static
	public static void main(String args[ ])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of records :- ");
		int nor = sc.nextInt();
		// create an array of Student Objects
		Student recs[ ] = new Student[nor];  // allocate memory for array
		System.out.println("Enter the records in ASC order by rollno");
		for (int i=0;i<nor;i++)
		{
			// imp - allocate memory for each Student object
			// if you forget, java will throw NullPointerException
			recs[i] = new Student();
			System.out.print("Enter the rollno :- ");
			recs[i].rollno = sc.nextInt();
			System.out.print("Enter the name :- ");
			recs[i].name = sc.next();
			System.out.print("Enter the percent :- ");
			recs[i].per = sc.nextDouble();
		}
		System.out.print("Enter the rollno to search :- ");
		int rno = sc.nextInt();
		// search methods/functions are always "int" functions i.e. they return the position
		// of record in a table/array
		int pos = search(recs,rno);
		// search function if successful, will return a value from 0 to nor-1. However if
		// unsuccessful i.e. if record is not found, should return -1. WHY? bcoz -1 is
		// not a valid position/index in array
		if (pos == -1)
			System.out.print("Search Unsuccessful, Record with rollno " + rno + " not found");
		else
		{
			System.out.println("Search Successful. Record found after " + comp_count + " no of comparisons");
			System.out.print("Rollno " + recs[pos].rollno + ", Name - " + recs[pos].name + ", Percent - " + recs[pos].per);
		}
	}

	static int search(Student recs[ ],int rno)
	{
		int top = 0, bottom = recs.length - 1, mid;  // nor is recs.length
		while (top <= bottom)
		{
			mid = (top + bottom) / 2;
			comp_count++;
			if (rno == recs[mid].rollno)
				return mid;
			
			if (rno > recs[mid].rollno)
				top = mid + 1;  // search lower half
			else
				bottom = mid - 1;  // search upper half
		}
		return -1;  // search unsuccessful
	}
}

