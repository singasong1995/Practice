package hl;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
		int []a  = new int  []{1,2,3,4,4,4,5,4,6,5,4,2,9,8,8,9,8,7,7,6};
    	int gap;
		for(gap = a.length/2;gap>0;gap/=2){//����ÿ������һ��
		  for(int i = 0;i<gap;i++){//��ÿ����������� 
			  for(int j = i+gap;j<a.length;j+=gap){//��������
				  int k;//Ҫ�����λ��
				  for(k=i;k<j;k+=gap){
					  if(a[j]>a[k])
						  break;
				  }
				 if(k<j){//����  �ƶ�
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
