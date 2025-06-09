package GSIPractice;

public class MultipleStatements {

	public static void main(String[] args) {
		int maths = 90;
		int science = 90;
		int english = 75;

		int totalmarks = maths + science + english;

		System.out.println("Total marks is " + totalmarks);

		double averageMarks = totalmarks / 3;

		System.out.println("Average marks of three subjects are " + averageMarks);

		if (averageMarks >= 90 && averageMarks <= 100) {
			System.out.println("Grade A+, , Exellent performance");
		} else if (averageMarks >= 75 && averageMarks <= 89) {
			System.out.println("Grade A, Exellent performance");
		} else if (averageMarks >= 60 && averageMarks <= 74) {
			System.out.println("Grade B, Keep Improving");
		} else if (averageMarks >= 40 && averageMarks <= 59) {
			System.out.println("Grade C, , Keep Improving");
		} else {
			System.out.println("Fail, Please work harder next time");
		}
	}

}
