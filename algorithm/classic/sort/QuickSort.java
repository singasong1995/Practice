package hl;

import java.util.Arrays;

public class QuickSort {
	public void quick_sort(int a[],int l,int r){
		 if(l<r){
			int i,j,x;
			i = l;
			j = r;
			x=a[i];//ÿ��ȡ����ߵ���Ϊ��׼,��¼����
			while(i<j){
				while(i<j&&a[j]>x)//���������ҵ���һ����xС�������ŵ����
					j--;
				if(i<j)
					a[i++]=a[j];
				while(i<j&&a[i]<x)//���������ҵ���һ����x��������ŵ��ұ�
				i++;
				if(i<j)
					a[j--] = a[i];

			} 
			a[i]=x;//����׼���ȥ
			quick_sort(a, l, i-1);
			quick_sort(a, i+1, r);
			 
		 }
		
	
		
	}
   public static void main(String[] args){
		int []  a = new int []{11,2,3,1,3,5,7,3,5,2,8,9,1};
		QuickSort quickSort = new QuickSort();
		quickSort.quick_sort(a, 0, a.length-1);
		System.out.print(Arrays.toString(a));
	}
}
