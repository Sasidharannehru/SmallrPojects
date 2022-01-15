package com.sasi.project.com;

public class LongestIncreasingSequence{
	   public static void main(String args[]){
	      int my_arr[] = { 30, 42, 99, 343, 321, 450, 441, 4560 };
	      int arr_len = my_arr.length;
	      System.out.println("The length of the longest increasing subsequence is " +  Increasing_sequence(my_arr, arr_len));
	   }
	

static int Increasing_sequence(int my_arr[], int arr_len){
      int seq_arr[] = new int[arr_len];
      int i, j, max = 0;
      for (i = 0; i < arr_len; i++)
         seq_arr[i] = 1;
      for (i = 1; i < arr_len; i++)
      for (j = 0; j < i; j++)
      if (my_arr[i] > my_arr[j] && seq_arr[i] < seq_arr[j] + 1)
      seq_arr[i] = seq_arr[j] + 1;
      for (i = 0; i < arr_len; i++)
      if (max < seq_arr[i])
      max = seq_arr[i];
      return max;
   }
}