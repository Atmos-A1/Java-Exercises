public class RangeMethod{

	public static boolean isRange(int n, int low, int high){

	boolean range = (n > low) && ( high > low);

	return range;

	}

		public static void main(String[]args){

		boolean isRangeResult = isRange(10, 6, 17);

		System.out.println(isRangeResult);

		}

	}
	