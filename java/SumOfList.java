public class SumOfList {
	static int SumOfList(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] num= {0,3,4};
		System.out.println("sum of list = "+ SumOfList(num));
	}
}