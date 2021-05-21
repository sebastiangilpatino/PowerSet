import java.util.ArrayList;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		PowerSet powerset = new PowerSet();
		List<Integer> X = new ArrayList<Integer>();
		X.add(1);
		X.add(2);
		X.add(3);
		System.out.println(powerset.doPowerSet(X).toString());
	}

}
