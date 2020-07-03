package sort;

import java.util.Comparator;

public class JapaneseComparator implements Comparator<Result> {

	@Override
	public int compare(Result o1, Result o2) {
		if(o1.getJapanese() < o2.getJapanese()) {
			return 1;
		}
		if(o1.getJapanese() > o2.getJapanese()) {
			return -1;
		}
		return 0;
	}

}
