package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet_9 {

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
		System.out.println("HashSet	value::	"	+	hs);

		//	Create	a	linked	hash	set.
		LinkedHashSet<String>	lhs	=	new	LinkedHashSet<String>();
		//	Add	elements	to	the	linked	hash	set.
		lhs.add("India");
		lhs.add("USA");
		lhs.add("Brazil");
		lhs.add("Canada");
		lhs.add("UK");
		lhs.add("China");
		lhs.add("France");
		lhs.add("Spain");
		lhs.add("Italy");
		System.out.println("LinkedHashSet	value::	"	+	lhs);						
}
	
	/*
	 * LinkedHashSet	implementation	of	JAVA	Collections
 LinkedHashSet	<>	is	a	class	which	implements	Set<>	interface	which	means	that	it	store	only
 unique	elements.	LinkedHashSet	<>	is	implemented	using	a	hash	table	and	a	linked	list.		Linked
 list	is	used	to	preserver	order	of	elements	based	on	insertion.	Traversing	the	elements	of	the	hash
 table	is	done	in	order	of	insertion.
	 * 
	 * 
	 * Comparison	of	various	Set	classes.
	            TreeSet                                               HashSet                     LinkedHashSet
 Storage-     Red-Black	Tree                                           Hash	Table               Hash	Table	with	Linked	List.
 Performance- Slower	than	HashSet,O(log(N)) Fastest,	           constant	time            More	expensive	then	HashSet,have	to	maintain	linked	list.
 Order	of	Iteration- Increasing	Order                              No	order	guarantee   Order	of	insertio
	 * 
	 * 
	 */

}
