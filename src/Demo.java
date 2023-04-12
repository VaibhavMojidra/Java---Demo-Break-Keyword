
public class Demo {
	public static void main(String[] args) {
		
		int arr[]=new int[] {14,435,92,76,34,90,12,23,43,54,87};
		
		int numberToBeSearched=34;
		boolean found=false;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Iteration count: "+i);
			if(arr[i]==numberToBeSearched) {
				found=true;
				break;
			}
		}
		
		System.out.println("Found "+numberToBeSearched+" : "+found);
		
	}
}
