

public class Advance {
    
    void expressionCheck(String input){  // 7(2+2)

        // int bl=0;
        // for(int i=0;i<input.length();i++){
        //     if(input.charAt(i)=='(' || input.charAt(i)==')'){
        //         bl++;
        //     }
        // }
        // if(bl%2!=0){
        //     //System.out.println("error");
        // }

        for(int i=0;i<input.length();i++){
       
            if(input.charAt(i)=='('){

                if((input.charAt(i-1)>0) && (input.charAt(i-1)>9)){
                    //System.out.println("error");
    
                }
                // if(input.charAt(i+1) == '+' || input.charAt(i+1) == '-' ||
                //  input.charAt(i+1) == '*' || input.charAt(i+1) == '/'){
                //     //System.out.println("error");
     
                // }
                // if(input.charAt(i-1)==')'){
                //     //System.out.println("error");
                // }
                
            }
          
          
            // if(input.charAt(i)==')'){
            //     if((0<input.charAt(i-1) && input.charAt(i-1)>9)){
            //         //System.out.println("error");
    
            //     }
            //     if(input.charAt(i-1) == '+' || input.charAt(i-1) == '-' ||
            //      input.charAt(i-1) == '*' || input.charAt(i-1) == '/'){
            //         //System.out.println("error");
     
            //     }
            //     if(input.charAt(i+1)=='('){
            //         //System.out.println("error");
            //     }
            // }


            // if(((int)input.charAt(i))>47 && ((int)input.charAt(i))<58){
            //     //System.out.println(((int)input.charAt(i)));
            //     if(input.charAt(i-1) == ')' || input.charAt(i+1) == '('){
            //         System.out.println("error");
            //     }
            // } 

            

           

            

            
              
        }


        
        
    }
}
