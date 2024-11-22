package collections;

import java.util.TreeMap;

/*
 *  A	Map<>	is	an	interface	that	maps	keys	to	values.	Also	called	a	dictionary.	A	TreeMap<>	is	an
 implementation	of	Map<>	and	is	implemented	using	red-black	balanced	binary	tree	so	the	key
 value	pairs	are	stored	in	sorted	order
 */
public class TreeMap_6 {

	public	static	void	main(String[]	args)	{
		
		//	create	a	tree	map.
		TreeMap<String,	Integer>	tm	=	new	TreeMap<String,	Integer>();
	
		//	Put	elements	into	the	map
		tm.put("Mason",	new	Integer(55));
		tm.put("Jacob",	new	Integer(77));
		tm.put("William",	new	Integer(99));
		tm.put("Alexander",	new	Integer(80));
		tm.put("Michael",	new	Integer(50));
		tm.put("Emma",	new	Integer(65));
		tm.put("Olivia",	new	Integer(77));
		tm.put("Sophia",	new	Integer(88));
		tm.put("Emily",	new	Integer(99));
		tm.put("Isabella",	new	Integer(100));
	
		System.out.println("Total	number	of	students	in	class	::	"	+	tm.size());
		for(String	key	:	tm.keySet())
		{
			System.out.println(key	+	"	score	marks	:"	+	tm.get(key));
		}
		System.out.println("Emma	score	present::"	+	tm.containsKey("Emma"));
		System.out.println("John	score	present::	"	+	tm.containsKey("John"));
		tm.remove("Emma");
		System.out.println("Emma	score	present::"	+	tm.containsKey("Emma"));
}
}
