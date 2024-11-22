package collections;

import java.util.HashSet;

public class HashSetDemo_8 {

	
		public	static	void	main(String[]	args)	{
										
											//	Create	a	hash	set.
											HashSet<String>	hs	=	new	HashSet<String>();

											//	Add	elements	to	the	hash	set.
											hs.add("India");
											hs.add("USA");
											hs.add("Brazil");
											hs.add("Canada");
											hs.add("UK");
											hs.add("China");
											hs.add("France");
											hs.add("Spain");
											hs.add("Italy");
											System.out.println(hs);															
											System.out.println("Hash	Table	contains	USA	:	"	+	hs.contains("USA"));
											System.out.println("Hash	Table	contains	Russia	:	"	+
											hs.contains("Russia"));
											hs.remove("USA");
											System.out.println(hs);
											System.out.println("Hash	Table	contains	USA	:	"	+	hs.contains("USA"));
		}

		
		/* 
		 * we see order of elements is not similar to order of insertion
		 */
}
