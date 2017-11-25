package hl;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
		int []a  = new int  []{1,2,3,4,4,4,5,4,6,5,4,2,9,8,8,9,8,7,7,6};
    	int gap;
		for(gap = a.length/2;gap>0;gap/=2){//步长每次缩短一半
		  for(int i = 0;i<gap;i++){//对每个组进行排序 
			  for(int j = i+gap;j<a.length;j+=gap){//插入排序
				  int k;//要插入的位置
				  for(k=i;k<j;k+=gap){
					  if(a[j]>a[k])
						  break;
				  }
				 if(k<j){//复制  移动
					 int temp = a[j];
					 for(int m = j;m>k;m-=gap){
						 a[m]=a[m-gap];
					 }
					 a[k]=temp;
				 } 			  
			  }		  
		  }			
		}
    	System.out.println(Arrays.toString(a));
    	
	}
}
