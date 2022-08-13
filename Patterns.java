public class Patterns {
    
    void squarefilledStar(int n){


        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    void squareStar(int n){
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    void pyramidStar(int n,String name){

        for(int i=0;i<n;i++){

            for(int s=n-i;s>0;s--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

            
    }

    void pyramidStarEven(int n){

        int k;
        for(int i=1;i<=n;i++){

            for(int s=n-i;s>0;s--){
                System.out.print(" ");
            }
            k=(2*i)-1;
            for(int j=0;j<=k;j++){
                System.out.print("*");
            }
            System.out.println();
        }

            
    }


    void pyramidStarOdd(int n){

        int k;
        for(int i=1;i<=n;i++){

            for(int s=n-i;s>0;s--){
                System.out.print(" ");
            }
            k=(2*i)-1;
            for(int j=1;j<=k;j++){
                System.out.print("*");
            }
            System.out.println();
        }

            
    }
}
