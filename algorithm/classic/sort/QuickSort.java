package hl;

import java.util.Arrays;

public class QuickSort {
	public void quick_sort(int a[],int l,int r){
		 if(l<r){
			int i,j,x;
			i = l;
			j = r;
			x=a[i];//每次取最左边的数为标准,记录下来
			while(i<j){
				while(i<j&&a[j]>x)//从右往左找到第一个比x小的数，放到左边
					j--;
				if(i<j)
					a[i++]=a[j];
				while(i<j&&a[i]<x)//从左往右找到第一个比x大的数，放到右边
				i++;
				if(i<j)
					a[j--] = a[i];

			} 
			a[i]=x;//将标准插进去
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
