package sort;

import java.util.Comparator;

public class SocialStudies implements Comparator<Result> {

	@Override
	public int compare(Result o1, Result o2) {
		if(o1.getSocialStudies() < o2.getSocialStudies()) {
			return -1;
		}
		if(o1.getSocialStudies() > o2.getSocialStudies()) {
			return 1;
		}
		return 0;
	}

}
