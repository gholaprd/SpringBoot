package com.coforge.jay;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenAndCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,3,1,3,4,2,4,5,6};
		int count=0;
		int oddCount=0;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] % 2 == 0)
			{
				count++;
			}
			else {
				oddCount++;
			}
		}
		System.out.println(" even count: " + count +"\n odd count " +oddCount );
		// by using java 8
		List<Integer> arrayList= IntStream.of(a).boxed().collect(Collectors.toList());
		long evenCount = arrayList.stream().filter(i->i%2==0).count();
		System.out.println("Using Java 8 is ------" +evenCount);
		
		long oddCounts = arrayList.stream().filter(i->i%2!=0).count();
		System.out.println("Using Java 8  is -----" + oddCounts);
		
		
        int arr[] = {20,30,10,30,40,40,50,50};  
        int n = arr.length; 
        Arrays.sort(arr);
        n = removeDuplicates(arr, n); 
   
        for (int i=0; i<n; i++) { 
            System.out.print(arr[i]+" ");
        }
	
	}
	static int removeDuplicates(int arr[], int n) 
    { 
        if (n==0 || n==1) 
            return n; 
        int[] temp = new int[n]; 
          
        int j = 0; 
        for (int i=0; i<n-1; i++) {
            if (arr[i] != arr[i+1]) 
                temp[j++] = arr[i]; 
        }
        temp[j++] = arr[n-1];    
        for (int i=0; i<j; i++) {
            arr[i] = temp[i]; 
        }
        return j; 
    } 
      

}
