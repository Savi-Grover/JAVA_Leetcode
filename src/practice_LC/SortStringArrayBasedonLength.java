package practice_LC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStringArrayBasedonLength {

	public static void main(String[] args) 
	{
		 List<String>names = new ArrayList<>(Arrays.asList("Jithin","Arunima","Akhil","Matthew","Benjamin"));
		 
		 Comparator<String>comp= (name1,name2)->(name1.length()>name2.length())?1:-1;
		 
		 Collections.sort(names,comp);
		 System.out.println(names);
		 
		 
		 //method2 
		 var listOfNames = Arrays.asList("Jithin", "Arunima", "Akhil", "Matthew", "Benjamin");
		 listOfNames.sort(Comparator.comparingInt(String::length));

		System.out.println(listOfNames);
		 }

}
