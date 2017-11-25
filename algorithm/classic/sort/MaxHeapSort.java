package hl;

import java.util.Arrays;

public class MaxHeapSort {
	public void maxHeapDown(int a[],int start,int end){
		int curr = start;//��ǰҪ�����Ľڵ�
		int left = 2*curr+1;//curr������
		int val = a[curr];//curr��ֵ
	    
		for(;left<=end;curr=left,left=2*left+1){//һֱ���µ���
			
			if(left<end&&a[left]<a[left+1])//���Ӻ��Һ��ӱȽ�
				left++;//�Һ��Ӵ�   ��ʱleftΪ�Һ����±��ˡ�
			if(val>=a[left])//����Ҫ����
				break;
			else{//���µ���  һ��
				a[curr]=a[left];
				a[left]=val;
			}
			
			
		}	
	}
	public void heap_sort(int [] a,int n){
		int i ,temp;
		for( i= n/2-1; i >= 0; i--)
			 maxHeapDown(a, i, n-1);//�ѳ�ʼ���������Ϊ����,��������ڵ�	
		for( i = n-1; i > 0; i--){
	        	temp = a[0];//���������������ź���
	        	a[0]=a[i];
	        	a[i]=temp;
	        maxHeapDown(a, 0, i-1);	//��ʣ�µĵ���Ϊ����,ֻ�����һ���ڵ�
		
		}
	 }	
	
	
	public static void main(String[] args){
		int []a = new int [] {1,2,9,3,7,8,5,4,0,1,2,3,3,3,5,6,4,4};
		MaxHeapSort maxHeapSort = new MaxHeapSort();
		maxHeapSort.heap_sort(a, a.length);
		System.out.print(Arrays.toString(a));
		
		
		
	}
}
