package count;

//模写　クイックソート
public class QuickSort {
	public static void sort(int[] arr) {
		quickSort(arr,0, arr.length -1);
		
	}
	
	private static void quickSort(int[] arr,int left, int right) {
		
		if(left >= right) return;
		
		int pivot = arr[right];
		int i = left - 1;
		
		for(int j = left; j < right; j++) {
			if(arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
		
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[right];
		arr[right] = temp;
		
		quickSort(arr,left,i);
		quickSort(arr,i + 2, right);
		
		
	}
	

}
