package GSIPractice;

public class CalculateAndAverageMarks {

	public static void main(String[] args) {
		int maths = 67;
		int science = 70;
		int english = 75;

		int totalmarks = maths + science + english;

		System.out.println("Total marks is " + totalmarks);

		double averageMarks = totalmarks / 3;

		System.out.println("Average marks of three subjects are " + averageMarks);

	}

}
