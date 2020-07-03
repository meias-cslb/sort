package sort;

import java.util.List;

public class Sort {

	public static void main(String[] args) {
		List<Result> results = Result.createList(20);

//		国語の点数が高い順 Comparator継承クラスを作成し使用
//		results.sort(new JapaneseComparator());

//		数学の点数が低い順 Comparator継承オブジェクトを作成し使用
//		Comparator<Result> comparator = new Comparator<Result>() {
//			public int compare(Result o1, Result o2) {
//				if(o1.getMathematics() < o2.getMathematics()) {
//					return -1;
//				}
//				if(o1.getMathematics() > o2.getMathematics()) {
//					return 1;
//				}
//				return 0;
//
//				}
//			};
//
//		results.sort(comparator);

//		理科の点数が高い順 ラムダ式
//		results.sort(
//				(result1, result2) -> {
//					if(result1.getScience() < result2.getScience()) {
//						return 1;
//					}
//					if(result1.getScience() > result2.getScience()) {
//						return -1;
//					}
//					return 0;
//					}
//				);

	//		簡単な書き方(int ot Integerに限る)
//			results.sort(
//					(result1, result2) -> {
//							return (result2.getScience() - result1.getScience());
//						}
//					);

//		合計点が高い順 Comparableインターフェース継承
//		Collections.sort(results);


//		社会の点数が高い順 Comparator継承クラスを作成し使用
//		results.sort(new SocialStudies());

//		英語の点数が高い順 ラムダ式 簡単な書き方(int ot Integerに限る)
			results.sort(
					(result1, result2) -> {
						
							return (result2.getEnglish() - result1.getEnglish());
						}
					);


		for(Result result : results) {
			System.out.println(result);
		}

	}

}
