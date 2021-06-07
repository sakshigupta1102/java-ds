//Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
public class ADDdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5432151;
	     int ans=0;

		while (n > 10) {
			int sum = 0;
			while (n > 0) {
				int rem = n % 10;
				sum = sum + rem;

				n = n / 10;

			}
            n=sum;
            ans=sum;
           
		}
		 System.out.println(ans);

	}

}
