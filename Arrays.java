public class Arrays {

    int[] arraySortAssendingOrder(int[] arr){

       // int[] arr = new int[]{5, 9, 1, 6, 2, 8};

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;

    }

    int[] arrayRemoveDublicatesOrder(int[] arr){

        int temp[] = new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j++]=arr[i];
            
            }    
        }
        temp[j++] = arr[arr.length-1];

        return temp;
    }









    void arrayFrequencyCheck(int[] arr){

        int[] arr2 = new int[arr.length];

        //arraySortAssendingOrder(arr);

        int visit = -1;
        for(int i=0;i<arr.length;i++){

            int c=0;
            
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c++;
                    arr2[j]=visit;
                }
                
                
            }
            if(arr2[i]!=visit){
                arr2[i]=c;
            }
            
        }

        for(int i=0;i<arr2.length;i++){
            if(arr2[i]!=visit){
                System.out.print(arr[i]+" " +(arr2[i]+1));
            }
            System.out.println();
        }



    }
    
}
