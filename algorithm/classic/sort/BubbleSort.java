package hl;

import java.util.Arrays;


public class BubbleSort {
      
	  public  static void main(String[] args){
		  
		  int []  a=  new int [] {5,6,7,8,4,9}; 
		  int flag;
		  for(int i =0;i<a.length-1;i++){
			 flag = 0; 
			 for(int j=a.length-1;j>i;j--){//从最后面开始往前面冒泡 冒到有序位置前
				 if(a[j]>a[j-1]){
				    int temp = a[j];
				    a[j]=a[j-1];
				    a[j-1]= temp;
				    flag = 1;
				 }
					 
			 }
			 if(flag == 0)
				 break;
			 System.out.println(Arrays.toString(a));
		  }
		  
		   //System.out.println(Arrays.toString(a));
	  }
	
	
	
}
