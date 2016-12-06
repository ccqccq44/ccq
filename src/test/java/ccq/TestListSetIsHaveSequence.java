package ccq;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TestListSetIsHaveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<String>();
		list.add("ccq");
		list.add("ccq1");
		list.add("ccq2");
		list.add("ccq3");
		list.add("ccq4");
		list.add("ccq5");
		list.add("ccq6");
		list.add("ccq7");
		list.add("ccq8");
		list.add("ccq9");
		list.add("ccq10");
		list.add("ccq11");
		System.out.println(list);
		Set<String> set = new HashSet<String>();
		set.add("ccq");
		set.add("ccq1");
		set.add("ccq2");
		set.add("ccq3");
		set.add("ccq4");
		set.add("ccq5");
		set.add("ccq6");
		set.add("ccq7");
		set.add("ccq8");
		System.out.println(set);
	}

}
