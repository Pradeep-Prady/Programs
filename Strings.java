import java.lang.String;

public class Strings {


    int findStringLength(String input){
        int n = 0;

        for(char s : input.toCharArray()){
            n++;
            
            
        }
        return n;
    }

    String stringReverse(String text){
        String input = text;
     
        String output ="";
        for(int i=findStringLength(input)-1;i>=0;i--){
            output  = output + input.charAt(i);
    
        }
        return output;

    }

    int findCharPosition(String text,char c){
        int n = 0;
        for(int i=0;i<findStringLength(text);i++){
            if(text.charAt(i)==c){
                n = i+1;
            }    
        }        
        return n;
               // int t = 0;
        // if(n>0){
        //     n = n;
        // }
        // else{     
        //     System.out.println("This character not present in string");
        // }
    }



    int findPunctuationCount(String input){
        int n = 0;
        String inputString = input;
        for(int i=0;i<findStringLength(input);i++){
            if((inputString.charAt(i) == ';') || (inputString.charAt(i) == '.') 
            ||  (inputString.charAt(i) == '\'') || (inputString.charAt(i) == ',') 
            || (inputString.charAt(i) == ':') || (inputString.charAt(i) == '"')
            || (inputString.charAt(i) == '!')){
                n++;
            }
        }
        return n;
    }

    int findVowelCount(String input){
        int n = 0;

        input.toLowerCase();

        for(int i = 0;i<findStringLength(input);i++ ){
            if(input.charAt(i)=='a' || input.charAt(i)=='e' || 
            input.charAt(i)=='i' || input.charAt(i)=='o' || 
            input.charAt(i)=='u'){
                n++;
            }
        }

        return n;
    }

    int findConstantCount(String input){
        int n = 0;

        input.toLowerCase();

        for(int i = 0;i<findStringLength(input);i++ ){
            
            if(input.charAt(i)=='a' || input.charAt(i)=='e' || 
            input.charAt(i)=='i' || input.charAt(i)=='o' || 
            input.charAt(i)=='u'){
                
            }
            
            else if(input.charAt(i)>='a' && input.charAt(i)<='z'){
                n++;
            }
        }

        return n;
    }


    String[] stringChange(String str){

        str.toLowerCase();
        String s[] = str.split(" ");

        for(int i=0;i<s.length;i++){
            if(i%2==0){
                s[i] = s[i].toUpperCase();
                
                
            }
            System.out.print(s[i] +" ");   
        }
        return s;

    }

    
}
