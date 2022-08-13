import java.lang.Math;



public class Numbers {

    int findIntegerLength(int n){
        int l=0;
        while(n!=0){
            n/=10;
            l++;
        }
        

        // int l = String.valueOf(n).length();
        // System.out.println(l);

        return l;
    }

    void checkEvenOrOdd(int n){
        if(n%2==0){
            System.out.printf("The Given Number %d is Even",n);
        }
        else{
            System.out.printf("The Given Number %d is Odd",n);
        }
    }

    void checkArmstrongNumber(int n){
        

        int copy = n;
        int ans=0;
        while(n!=0){
            int rev = n%10;
            
            ans = (ans * 10) + rev;
            n/=10;

        }
        if(copy == ans){
            System.out.printf("\nThe Given Number %d is Armstrong Number",copy);
        }
        else{
            System.out.printf("\nThe Given Number %d is Not a Armstrong Number",copy);
        }
    }
   
    void autoMorphicNumber(int n){
       
        int l = findIntegerLength(n);
        int ans = n * n;
       
        int sum = 0; 
        
        for(int i = 1;i<=l;i++){
            int rem = ans%10; 
            sum = (sum * 10) + rem; 
            ans/=10;
        }
        int fi = 0;
        while(sum!=0){
            int rem = sum%10;
            fi = (fi * 10) + rem;
            sum/=10;

        }
        if(n == fi){
            System.out.printf("The Given Number %d is a Automorphic Number",n);
        }
        else{
            System.out.printf("The Given Number %d is Not a Automorphic Number",n);
        }
        

    }

    void checkSunnyNumber(int n){

        double sum = n + 1;
        double ans = (Math.sqrt(sum));

        if((ans - (Math.ceil(ans)) == 0)){
            System.out.printf("The Given Number %d is Sunny Number",n);
        }
        else{
            System.out.printf("The Given Number %d is Not Sunny Number",n);
        }

    }

    void checkTechNumber(int n){
        int l = findIntegerLength(n);
        int check = n;

        if(l%2==0){
            int first = 0,last =0;
            int sum = 0;
            for(int i=0;i<l/2;i++){
                int rem = n%10;;
                sum = (sum * 10) + rem;
                n/=10;

            }
            first=n;
            while(sum!=0){
                int rem = sum%10;
                last = (last * 10)+rem;
                sum/=10;
            }
           
            int ans = (first + last) * (first + last);

            if(ans == check){
                System.out.printf("The Given Number %d is Tech Number",check);

            }
            else{
                System.out.printf("The Given Number %d is Not a Tech Number",check);

            }

        }
        else{
            System.out.println("Please Enter the Correct Input : \n The tech Number is Even count Number");

        }
    }

    void checkfasciNatingNumber(int n){
        int n2 = n*2;
        int n3 = n*3;
        String ans = String.valueOf(n) + String.valueOf(n2) + n3;
    
        int i = 1;
        for(i=1;i<ans.length();i++){
            if(ans.charAt(i) == '1' || ans.charAt(i) == '2' ||
            ans.charAt(i) == '3' || ans.charAt(i) == '4' ||
            ans.charAt(i) == '5' ||  ans.charAt(i) == '6' || 
            ans.charAt(i) == '7' || ans.charAt(i) == '8' ||
            ans.charAt(i) == '9' ){


            }
        }
        if(i==9){
            System.out.printf("The Given Number %d is Fascinating Number",n);
        }
        else{
            System.out.printf("The Given Number %d is Not Fascinating Number",n);
        }

    }

    void peterSonNumber(int n){
        int check = n;
        int ans = 0;
        while(n!=0){
            int rem = n % 10;
            ans = ans + findFactorialValue(rem);
            n/=10;
            
        }
        if(ans == check){
            System.out.printf("The Given Number %d is Peterson Number",check);
        }
        else{
            System.out.printf("The Given Number %d is Not Peterson Number",check);
        }
    }

    int findFactorialValue(int n){ 
        int ans = 1 ;
        for(int j=n;j>0;j--){
            ans = ans * j;
        }
        return ans;
    }

    void checkKeithNumber(int  n){

        int check = n;
        int third = n%10;
        n/=10;
        int second = n%10;
        n/=10;
        int first = n%10;

        int ans = first + second + third;
        while(ans <= check){
           
            int temp = ans;
            first = second;
            second = third;
            third = temp;
            ans = first + second + third;
        }

        if(check == ans){
            System.out.printf("The Given Number %d is Keith Number",check);
        }
        else{
            System.out.printf("The Given Number %d is Not a Keith Number",check);
        }
        
        
    }

    void checkAllNumberIsEven(int n){

        //int n = 1600;
        int l = String.valueOf(n).length(); 
        int c = 0;
        while(n!=0){
            int rem = n%10;
            
            if(rem%2==0){
                c++;
            }
            n/=10;
        }
        if(c==l){
            System.out.println(1);
        }
        else{
            System.out.println(-1);
        }
        
    }
}
