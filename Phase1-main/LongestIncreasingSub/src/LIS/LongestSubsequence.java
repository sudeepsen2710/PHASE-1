package LIS;

public class LongestSubsequence {

	public static void main(String[] args) {
		int arr[]= {10, 17, 9, 33, 21, 47, 52, 67, 77, 80, 99, 15};
		int arr_len =arr.length;
		System.out.println("The length of the longest insreasing subsequence");
		System.out.println(longest_subsequence(arr,arr_len));
		
	}
  static int longest_subsequence(int ran[], int ran_len)
 
  { 
	  int sq_ran[]=new int[ran_len];
	  int i, j, max=0;
	  for(i=0;i<ran_len;i++)
	    sq_ran[i]=1;
	  for(i=1;i<ran_len;i++)
		  for(j=0;j<i;j++)
			  if(ran[i]>ran[j] && sq_ran[i] < sq_ran[j]+1)
				  sq_ran[i]=sq_ran[j]+1;
	  for (i=0; i<ran_len;i++)
		  if (max < sq_ran[i])
			  max= sq_ran[i];
	  return max;
  }
  

}
