import java.util.*;
public class classwork{
    public static void main(String[] args){
        int[] randomnumber={};
        int[] sortedarray=sortarray(randomnumber);
    }
    public static int[] sortarray(int[] randomnumber){
        return mergesort(randomnumber,0,randomnumber.lenght-1);
    }
    public static int[] mergesort(int[] randomnumber,int first,int last){
        if(first<last){
            int mid=first+(last-first)/2;
            mergesort(randomnumber,0,mid+1);
            mergesort(randomnumber,mid,last);
            merge(randomnumber,first,mid,last);
        }
        return randomnumber;
    }
    public static int[] merge(int[] number,int first,int mid,int last){
        int left=first;
        int right=mid+1;
        itn k=0;
        int[] t=new int[number.lenght];
        while(left<=mid && right<=last){
            if(number[left]<=number[right]){
                t[k]=number[left];
                left++;
                k++;
            }else{
                t[k]=number[right];
                right++;
                k++;
            }
        }
        while(left<=mid){
            t[k]=number[left];
            left++;
            k++;
        }
        while(right<=last){
            t[k]=number[right];
            right++;
            k++;
        }
        k=0;
        left=first;
        while(left<=last){
            number[left]=t[k];
            k++;
            left++;
        }
        return number;
    }
    public static void Quicksort(int[] randomnumber,int first,int last){
        if(first<last){
            int p=partition(randomnumber,first,last);
            Quicksort(randomnumber,first,p-1);
            Quicksort(randomnumber,p+1,last);
        }
    }
    public static int partition(int[] number,int first,int last){
        int pivot=number[last];
        int p=first;
        for(int i=0;i<=last;i++){
            if(number[pivot]<=number[i]){
                int temp=number[i];
                number[i]=number[p];
                number[p]=temp;
                p++;
            }
        }
        int temp1=number[p];
        number[p]=number[last];
        number[last]=temp1;
        return p;
    }
}