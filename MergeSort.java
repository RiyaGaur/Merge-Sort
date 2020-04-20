public class MergeSort {
    int arr[];
    public MergeSort(int size){
        arr=new int[size];
    }

    public void mergesort(int arr1[],int l,int u) {
        if(l<u){
            int mid=(l+u)/2;
            mergesort(arr1,l,mid);
            mergesort(arr1,mid+1,u);
            merge(arr1,l,mid,u);
        }
    }

    public void merge(int arr1[],int l,int mid,int u){
        int i=l;
        int j=mid+1;
        int k=l;
        while(i<=mid && j<=u){
            if (arr1[i]<=arr1[j]){
                arr[k]=arr1[i];
                i++;
            }
            else {
                arr[k]=arr1[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while(j<=u){
                arr[k]=arr1[j];
                j++;
                k++;
            }
        }
        else{
            while (i<=mid){
                arr[k]=arr1[i];
                i++;
                k++;
            }
        }
        for (k=l;k<=u;k++){
            arr1[k]=arr[k];
        }
    }

    public static void main(String[] args) {
        int arr[]={50,40,10,60,20,30};
        MergeSort obj=new MergeSort(arr.length);
        obj.mergesort(arr,0,arr.length-1);
        for (int i = 0; i <arr.length-1 ; i++) {
            System.out.println(arr[i]);
        }
    }
}
