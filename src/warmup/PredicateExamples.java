package warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;



public class PredicateExamples {

	public static void main(String[] args) {
		//Predicate, Consumer, Supplier, Function
		List<Integer> lst = new ArrayList<>();
		lst.add(3);
		lst.add(12);
		lst.add(34);
		lst.add(5);
		lst.add(7);
		
		Predicate<Integer> numMoreThan10 = num -> num>10 ;
		for (Integer num : lst) {
			if(numMoreThan10.test(num)) {
				System.out.println(num);
			}
		}
		
		System.out.println(lst);
		lst.removeIf(numMoreThan10);
		System.out.println(lst);
		
		
		List lst2 = new ArrayList();
		
		Predicate strPred = new Predicate() {
			@Override
			public boolean test(Object something) {
				String str = (String) something;
				return str.contains("C");
			}
		};
		
		Boolean hasC = strPred.test("ABCD");
		System.out.println(hasC);
		
//		Predicate<String> letterAFinder = (String s) -> {
//			return s.contains("A");
//		};
		
		Predicate<String> letterAFinder = s -> s.contains("A");
		
		
		

	}

}
