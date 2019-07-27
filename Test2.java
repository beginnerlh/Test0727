/*

对于一个矩阵，请设计一个算法从左上角(mat[0][0])开始，顺时针打印矩阵元素。

给定int矩阵mat,以及它的维数nxm，请返回一个数组，数组中的元素为矩阵元素的顺时针输出。

测试样例：
[[1,2],[3,4]],2,2
返回：[1,2,4,3]*/
package written_test0727;

//顺时针打印数组
public class Test2 {
}


class Printer {
    public int[] clockwisePrint(int[][] mat, int n, int m) {
        // write code here
        int[] arr = new int[m*n];
        if(mat.length==0){
            return arr;
        }
        int i = 0;  //行
        int j = 0;  //列
        int count = 0;
        while(i<m&&j<n){
            for(int a = j;a<m;a++) arr[count++] = mat[i][a];
            for(int b = i+1;b<n;b++) arr[count++] =mat[b][m-1];
            for(int a = m - 2;a>=i&&n-1!=i;a--) arr[count++] =mat[n-1][a];
            for(int b = n-2;b>i&&m-1!=j;b--) arr[count++] =mat[b][j];
            i++;
            j++;
            m--;
            n--;

        }
        return arr;
    }
}