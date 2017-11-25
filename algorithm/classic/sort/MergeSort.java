package hl;

import java.util.Arrays;

public class MergeSort {
	  public void merge(int[] a,int start,int mid,int end){//�鲢�������� 
	    	 int [] tmp = new int [end-start+1];//������ʱ�洢����
	    	 int i = start;
	    	 int j = mid+1;
	    	 int k =0;
	    	 while(i<=mid &&j<=end){//ÿ�δ������ȡһ���ֱȽϣ�С�ķŽ�ȥ
	    		 if(a[i]<=a[j])
	    			 tmp[k++]=a[i++];
	    		 else
	    			 tmp[k++]=a[j++];
	    	 }
	    	 while(i<=mid)//һ��ʣ�µķŽ�ȥ
	    		 tmp[k++]= a[i++];
	    	 
	    	 while(j<=end)//��һ��ʣ�µķŽ�ȥ
	    		 tmp[k++]=a[j++];
	    	 
	    	 for(i=0;i<k;i++){//������������
	    		 a[start+i]=tmp[i];
	    		 
	    	 }
	    	tmp =null; 
	     }
	     
	     public void merge_sort(int [] a,int start,int end){
	    	 if(a==null||start>=end)
	    		 return ;
	    	 int mid = (end+start)/2;
	    	 merge_sort(a, start, mid);//��߹鲢
	    	 merge_sort(a, mid+1, end);//�ұ߹鲢
	    	 
	    	 merge(a,start,mid,end);//�ϲ�����
	     }
	     
	      public static void main(String[] args){
	    	  MergeSort mergeSort  = new MergeSort();
	    	  int [] a = new int [] {1,0,2,9,3,8,7,4,5,2,1,3,3,4};
	    	  mergeSort.merge_sort(a, 0, a.length-1);
	    	  System.out.print(Arrays.toString(a));
	    	  
	      }
}
