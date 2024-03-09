import java.util.Arrays;
import java.util.Scanner;
public class print
{
		public static void main(String[] args){
			int[] arr={1,2,3,4,5,6,7,5,4,3,5};
			Arrays.sort(arr);
			for(int i=1;i<arr.length;i++)if(arr[i-1]==arr[i])System.out.print(arr[i]);
 }
	}	
}