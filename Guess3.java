public class Guess3{
public static void main(String [] args){
char ch,answar='k';
System.out.println("I am thinking of a letter b/w A and Z");
System.out.println("Can you guess it ;");
ch=(char) System.in.read();
if(ch==answer) System.out.println("**Right**");
else{
   System.out.println("...Sorry you are");
       if (ch<anwer)
             System.out.println("Too low");
                 else
                        System.out.println("Too hogh");
            
}
}