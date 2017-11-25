package graph;


public class MatrixUDG {
   private char[] mVexs;//���㼯��
   private int [][] mMatrix;//����

public void print(){//��ӡ����
	for(int i =0;i<mMatrix.length;i++){
		
		for(int j=0;j<mMatrix.length;j++){
			System.out.print(mMatrix[i][j]+" ");
		}
		System.out.println("");
	}
}

private int getPosition(char ch){//������������±�
	   for(int i=0;i<mVexs.length;i++){
	       if(mVexs[i]==ch)
	    	   return i;
	   }
	   return -1;
}
public MatrixUDG(char[] vexs, char[][]edges){//���ݶ���ͱ߹�������ͼ
	   int vlen = vexs.length;
	   int elen = edges.length;
	   mVexs = new char[vlen];
	   for(int i = 0;i< vlen;i++){
		   mVexs[i]=vexs[i];
	   }
	   mMatrix = new int [vlen][vlen];
	   for(int i = 0;i<elen;i++){
		   int p1 = getPosition(edges[i][0]);
		   int p2 = getPosition(edges[i][1]);
		   
		  mMatrix[p1][p2] = 1;
		  mMatrix[p2][p1] = 1;
		   
	   }
	   
	   
   }
   
private int firstNeighbor(int v){//�ҵ�����V�ĵ�һ���ھ�
	if(v<0||v>(mVexs.length-1))
		return -1;
	for (int i = 0; i < mVexs.length; i++) {
		if(mMatrix[v][i]==1)
			return i ;
	}
	
	
	return -1;
}
private int nextVertex(int v , int w){//V�� ��W֮��ĵ�һ���ڽӵ�
	if(v<0 || v>(mVexs.length-1) || w<0 || w>(mVexs.length-1))
	  return -1;
	for (int i = w+1; i < mVexs.length; i++) {
		if(mMatrix[v][i]==1)
			return i ;
	}
	return -1;
	
}
private void verTexDFS(int i,boolean[] visited){//��һ������еݹ�DFS
	visited[i] = true;//��ǰ�ѷ���
	System.out.print(mVexs[i]+" ");
	for(int w = firstNeighbor(i);w>=0;w=nextVertex(i, w)){
		if(!visited[w])
			verTexDFS(w,visited);
	}
	
	
}
public void DFS(){//��ͼ����DFS
	boolean[] visited = new boolean[mVexs.length];//���ʱ��
    for (int i = 0; i < visited.length; i++) {
		 visited[i] = false;
	}
	System.out.println("---------DFS-------- ");
//	for (int i = 0; i < mVexs.length; i++) {
//		if (!visited[i]) {
//			verTexDFS(i, visited);
//		}
//	}
    verTexDFS(0, visited);//�������е�һ���㿪ʼ����
}
public void BFS(){
	int head = 0;
	int rear = 0;
	int [] queue = new int[mVexs.length];
	boolean[] visited = new boolean[mVexs.length];
    for (int i = 0; i < visited.length; i++) {
		 visited[i] = false;
	}
    System.out.println("--------BFS-------");
			visited[0] = true;//�ӵ�һ���㿪ʼ����
			System.out.print(mVexs[0]+" ");
			queue[rear++]=0;//�����

		while(head != rear){
			int j = queue[head++];//������
			for (int k = firstNeighbor(j); k >= 0; k = nextVertex(j, k)) {
				if (!visited[k]) {
					visited[k] = true;
					System.out.print(mVexs[k]+" ");
					queue[rear++] = k;//�����
				}
				
				
			}
			
		}

	
}
   
    public static void main(String[] args) {
		char[] vexs = {'A','B','C','D','E','F'};
		char [][] edges = new char[][]{
			{'A','B'},	
			{'A','C'},
			{'A','D'},
			{'A','E'},
			{'B','C'},
			{'B','F'},
			{'C','D'}	
		};
		MatrixUDG matrixUDG  = new MatrixUDG(vexs, edges);  
		matrixUDG.print();
		matrixUDG.DFS();
		matrixUDG.BFS();
	}

}
