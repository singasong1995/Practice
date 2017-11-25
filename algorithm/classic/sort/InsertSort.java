package hl;

import java.util.Arrays;

public class InsertSort {
     
	
	 public static void main(String[] args){
         int []  a  =  new int []{1,2,3,4,4,4,5,4,6,5,4,2,9,8,8,9,8,7,7,6};
         for (int i = 1; i < a.length; i++) { //i为当前要准备插入的元素 
		    int j;//要插入的位置  
        	 for(j = 0;j<i;j++){
		    	if(a[i]>a[j])
		    	 break;	
		    }
		    if (j<i) {
			   int temp = a[i];
		    	for (int k = i; k >j;k--) {
				  a[k]=a[k-1];
			 }
		    	a[j]=temp;
		    }
		}
    	System.out.printf(Arrays.toString(a));
    	
    }
}
