import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import java.util.List;

public class PowerSet {

	public List<Set<Integer>> doPowerSet(List<Integer> X) {
		List<Set<Integer>> P = new ArrayList<Set<Integer>>();
		Set<Integer> S = new HashSet<Integer>();
		P.add(S);
		Set<Integer> T = new HashSet<Integer>();
		Integer f = null;
		Integer size = null;
		while (!X.isEmpty()) {
			f = X.remove(0);
			size = P.size();
			for (int i = 0; i < size; i++) {
				T = new HashSet<>(P.get(i));
				T.add(f);
				P.add(T);
			}
		}
		return P;
	}
}
