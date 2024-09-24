class ques1{
    public static int[] mergesort(int[] arr1,int[] arr2){
        int len1=arr1.length;
        int len2=arr2.length;
        int[] mergedarray=new int[len1+len2];
        int i=0,j=0,k=0;
        while(i<len1 && j<len2){
            if(arr1[i]<arr2[j]){
                mergedarray[k++]=arr1[i++];
            }
            else{
                mergedarray[k++]=arr2[j++];
            }
        }
        while(i<len1){
            mergedarray[k++]=arr1[i++];
        }
        while(j<len2){
            mergedarray[k++]=arr2[j++];
        }
        return mergedarray;
    }
    public static void main(String a[]){
        int[] arr1={1,3,11};
        int[] arr2={2,8,9,17,20};
        int[] sorted=mergesort(arr1,arr2);
        for(int i:sorted){
            System.out.print(i+" ");
        }
    }
}