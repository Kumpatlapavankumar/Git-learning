import java.util.*;
public class classpractise{
    public static void main(String[] args){
        int[]=
    }
    //0/1-knapsack problem;
    public static int knapsack(int[] w,int[] v,int W,int n){
        int[][] t=new int[n+1][W+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=W;j++){
                if(i==0 || j==0){
                    return t[i][j]=0;
                }else if(v[i-1]>j){
                    t[i][j]=t[i-1][j];
                }else{
                    t[i][j]=Math.max(val[i-1]+t[i-1][j-w[i-1]],t[i-1][j]);
                }
            }
        }
        return t[n][W];
    }
    //subset problem
    public static boolean subset(int[] set,int target,int n){
        boolean[][] =t=new boolean[n+1][target+1];
        for(int i=0;i<=n;i++){
            t[i][0]=true;
        }
        for(int j=1;j<=target;j++){
            t[0][j]=false;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                if(set[i-1]>j){
                    t[i][j]=t[i-1][j];
                }else{
                    t[i][j]=t[i-1][j-set[i-1]] || t[i-1][j];
                }
            }
        }
        return t[n][target];
    }
    public static int subset(int[] set,int target,int n){
        int[][] t=new int[n+1][target+1];
        for(int i=0;i<=n;i++){
            t[i][0]=1;
        }
        for(int j=1;j<=target;j++){ 
            t[0][j]=0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                if(set[i-1]>j){
                    t[i][j]=t[i-1][j];
                }else{
                    t[i][j]=t[i-1][j-set[i-1]];
                }
            }
        }
    }
    public static boolean equalpartion(int[] set,int n){
        int sum=0;
        for(int num:set){
            sum+=num;
        }
        if(sum%2!=){
            return false;
        }
        boolean t[][]  t=new boolean[n+1][sum/2+1];
        for(int i=0;i<=n;i++){
            t[i][0]=true;
        }
        for(int j=1;j<=sum/2;j++){
            t[0][j]=false;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum/2;j++){
                if(set[i-1]>j){
                    t[i][j]=t[i-1][j];
                }else{
                    t[i][j]=t[i-1][j-set[i-1]] || t[i-1][j];
                }
            }
        }
    }
    public static int unboudend(int[] w,int[] v,int W,int n){
        int[][] t=new int[n+1][W+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=W;j++){
                if(i==0 || j==0){
                    return t[i][j]=0;
                }else if(v[i-1]>j){
                    t[i][j]=t[i-1][j];
                }else{
                    t[i][j]=Math.max(val[i-1]+t[i][j-w[i-1]],t[i-1][j])
                }
            }
        }
    }
    public static int coinchange(int[] coins,int)
}
public static int[] mergesort(int[] arr){
    return merge(arr,0,arr.length()-1);
}
public static int[] merge(int[] arr,int first,int last){
    if(first<=last){
        int mid=first+(last-first)/2;
    }
}