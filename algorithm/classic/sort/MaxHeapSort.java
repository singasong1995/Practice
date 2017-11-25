package hl;

import java.util.Arrays;

public class MaxHeapSort {
	public void maxHeapDown(int a[],int start,int end){
		int curr = start;//当前要调整的节点
		int left = 2*curr+1;//curr的左孩子
		int val = a[curr];//curr的值
	    
		for(;left<=end;curr=left,left=2*left+1){//一直向下调整
			
			if(left<end&&a[left]<a[left+1])//左孩子和右孩子比较
				left++;//右孩子大   此时left为右孩子下标了。
			if(val>=a[left])//不需要调整
				break;
			else{//往下调整  一下
				a[curr]=a[left];
				a[left]=val;
			}
			
			
		}	
	}
	public void heap_sort(int [] a,int n){
		int i ,temp;
		for( i= n/2-1; i >= 0; i--)
			 maxHeapDown(a, i, n-1);//把初始的数组调整为最大堆,调整多个节点	
		for( i = n-1; i > 0; i--){
	        	temp = a[0];//交换，把最大的数放后面
	        	a[0]=a[i];
	        	a[i]=temp;
	        maxHeapDown(a, 0, i-1);	//把剩下的调整为最大堆,只需调整一个节点
		
		}
	 }	
	
	
	public static void main(String[] args){
		int []a = new int [] {1,2,9,3,7,8,5,4,0,1,2,3,3,3,5,6,4,4};
		MaxHeapSort maxHeapSort = new MaxHeapSort();
		maxHeapSort.heap_sort(a, a.length);
		System.out.print(Arrays.toString(a));
		
		
		
	}
}
