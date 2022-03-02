package selenium.programs;

import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
//Level 1= 1 Employee
		String EmpName ="Anusha";
		int EmpId = 1;
		
		//Level 2= 3 Employees
		String [] empNames = new String[3];
		System.out.println("Max number of values we can store: "+empNames.length);
		empNames[0] = "Anusha";
		empNames[1] = "Anil";
		empNames[2] = "Aniket";
		
		int [] empIds = new int[3];
		empIds[0] = 1;
		empIds[1] = 2;
		empIds[2] = 3;
		
		System.out.println("First employee name: "+empNames[0]);
		System.out.println("First employee id: "+empIds[0]);

		//Level 3 = 5 employees - collection 
		//List- ArryList,LinkList
		//Set
		//Map
		
		List<String>empNamesList = new ArrayList<String>();//initiate list
		System.out.println("Size of list is: "+empNamesList.size());//Imp

		//List- ArryList and linked list both are same 
		//it can store duplicate value
		//Adv- can store multiple values of same data type
		//Can do dynamic memory allocation
		//Can store values in Insertion order
		
		List<String>empNamesList1 = new ArrayList<String>();
		
		empNamesList1.add("Anusha");
		empNamesList1.add("Anil");
		empNamesList1.add("Aniket");
		empNamesList1.add("Vasantha");
		empNamesList1.add("Anusha");


		List<Integer>empIdList = new ArrayList<Integer>();
		empIdList.add(1);
		empIdList.add(2);
		empIdList.add(3);
		empIdList.add(4);
		empIdList.add(5);
		
		
	}
}

		
		




		
		

		
		



		
	
