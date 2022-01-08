
package week1.day2;

public class printDuplicates {

	public static void main(String[] args) {
		int[] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count = 0,i,j;
		for(i=0;i<arr.length;i++)
		{
			count=1;
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					count++;
			}

       if(count>1)
		System.out.println(arr[i]);
	}

}
}

