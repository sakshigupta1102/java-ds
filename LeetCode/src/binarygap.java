
public class binarygap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 37;

		int ans = 0;
		int mult = 1;

		while (n > 0) {

			int rem = n % 2;
			ans = ans + rem * mult;
			mult = mult * 10;

			n = n / 2;
		}

		System.out.println(ans);
	}

}
