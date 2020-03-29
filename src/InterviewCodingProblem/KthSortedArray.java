package InterviewCodingProblem;

import java.util.Arrays;
import java.util.Scanner;

public class KthSortedArray {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t--!=0){
            int n,p;
            n=sc.nextInt();
            p=sc.nextInt();
            int[] arr=new int[100];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            //code here
            int j,k,key;
            for(j=1;j<n;j++){
                key=arr[j];
                k=j-1;
                while(k>=0&&arr[k]>key){
                    arr[k+1]=arr[k];
                    k=k-1;
                }
                arr[k+1]=key;
            }

            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}