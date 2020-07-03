package sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Result implements Comparable<Result> {
	private Integer number;
	private Integer japanese;
	private Integer mathematics;
	private Integer science;
	private Integer socialStudies;
	private Integer english;

	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Integer getJapanese() {
		return japanese;
	}
	public void setJapanese(Integer japanese) {
		this.japanese = japanese;
	}
	public Integer getMathematics() {
		return mathematics;
	}
	public void setMathematics(Integer mathematics) {
		this.mathematics = mathematics;
	}
	public Integer getScience() {
		return science;
	}
	public void setScience(Integer science) {
		this.science = science;
	}
	public Integer getSocialStudies() {
		return socialStudies;
	}
	public void setSocialStudies(Integer socialStudies) {
		this.socialStudies = socialStudies;
	}
	public Integer getEnglish() {
		return english;
	}
	public void setEnglish(Integer english) {
		this.english = english;
	}

//	合計点計算
	public Integer calculateTotal() {
		Integer[] points = {
				this.japanese,
				this.mathematics,
				this.science,
				this.socialStudies,
				this.english
		};

		Integer total = 0;
		for(Integer point : points) {
			total += point;
		}
		return total;
	}

//	表示方法指定
	public String toString() {
		String string = String.format(
				"生徒%02d (合計 %3d) : 国語=%3d 数学=%3d 理科=%3d 社会=%3d 英語=%3d ",
				this.number,
				this.calculateTotal(),
				this.japanese,
				this.mathematics,
				this.science,
				this.socialStudies,
				this.english

				);
		return string;
	}

//	ランダムな点数データを作成
	public static List<Result> createList(int count) {
		List<Result> list = new ArrayList<Result>();
		Random random = new Random();

		for(int i = 1; i <= count; i++) {
			Result result = new Result();
			result.setNumber(i);
			result.setJapanese(random.nextInt(101));
			result.setMathematics(random.nextInt(101));
			result.setScience(random.nextInt(101));
			result.setSocialStudies(random.nextInt(101));
			result.setEnglish(random.nextInt(101));
			list.add(result);
		}

		return list;
	}
@Override
public int compareTo(Result o) {
	return (o.calculateTotal() - this.calculateTotal());
}
}
