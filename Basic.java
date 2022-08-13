public class Basic {

    void fibonacciSeries(int n){

        int f1=  0, f2 = 1;

        if(n==1){
            System.out.println(f1);
        }
     
        if(n==2){
            System.out.print(f1 + " " + f2);
                
        }
        int temp = 0;
        if(n>2){
            System.out.print(f1);
            for(int i=0;i<n-1;i++){
                temp = f1 + f2;
                f1 = f2;
                f2 = temp;
                System.out.print(" " +f1);
            }
     
        }   
    }
    
    
    
}
