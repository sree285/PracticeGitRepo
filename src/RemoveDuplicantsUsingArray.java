
public class RemoveDuplicantsUsingArray {
	public static int removeDuplicants(int arr[], int n) {
		int j=0;
		for(int i = 0;  i < n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j++]=arr[i];
			}
		}
		arr[j++]=arr[n-1];
		return j;
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,2,3,3,4,5};
		int length=arr.length;
			length=	removeDuplicants(arr, length);
		for(int i=0; i<length;i++) {
			System.out.println(arr[i]+ " ");
		}
		

	}

}
