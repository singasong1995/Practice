package hl;

import java.util.Arrays;

public class MergeSort {
	  public void merge(int[] a,int start,int mid,int end){//归并有序数列 
	    	 int [] tmp = new int [end-start+1];//定义临时存储区域
	    	 int i = start;
	    	 int j = mid+1;
	    	 int k =0;
	    	 while(i<=mid &&j<=end){//每次从两半各取一数字比较，小的放进去
	    		 if(a[i]<=a[j])
	    			 tmp[k++]=a[i++];
	    		 else
	    			 tmp[k++]=a[j++];
	    	 }
	    	 while(i<=mid)//一半剩下的放进去
	    		 tmp[k++]= a[i++];
	    	 
	    	 while(j<=end)//另一半剩下的放进去
	    		 tmp[k++]=a[j++];
	    	 
	    	 for(i=0;i<k;i++){//拷贝到数组中
	    		 a[start+i]=tmp[i];
	    		 
	    	 }
	    	tmp =null; 
	     }
	     
	     public void merge_sort(int [] a,int start,int end){
	    	 if(a==null||start>=end)
	    		 return ;
	    	 int mid = (end+start)/2;
	    	 merge_sort(a, start, mid);//左边归并
	    	 merge_sort(a, mid+1, end);//右边归并
	    	 
	    	 merge(a,start,mid,end);//合并左右
	     }
	     
	      public static void main(String[] args){
	    	  MergeSort mergeSort  = new MergeSort();
	    	  int [] a = new int [] {1,0,2,9,3,8,7,4,5,2,1,3,3,4};
	    	  mergeSort.merge_sort(a, 0, a.length-1);
	    	  System.out.print(Arrays.toString(a));
	    	  
	      }
}
