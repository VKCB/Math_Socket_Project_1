
package My_Challenge_box.Math_Socket_Project_1;

import java.util.Random;

public class Challenge_box {
    private static int x,y;
    private static float resp;
    
    
    public static void main(String[] args) {
        
    }
    
    static int generate_random(){
        int max=50,min=0;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        return random_int;
    }
    
    static char generate_random_c(){
        Random random = new Random();
        String setOfChar = "+-*/";
        int randomInt = random.nextInt(setOfChar.length());
        char randomChar = setOfChar.charAt(randomInt);
        return randomChar;
    }
}