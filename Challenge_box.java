
package My_Challenge_box.Math_Socket_Project_1;

import java.util.Random;
import java.util.Scanner;

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
    
    public static void generate_problem(){
        x=Challenge_box.generate_random();
        y=Challenge_box.generate_random();
        char simb = Challenge_box.generate_random_c();
        if(simb == '+'){
            System.out.println(x+" + "+y+" = ?");
            resp = x+y;
        }
        if(simb == '-'){
            System.out.println(x+" - "+y+" = ?");
            resp = x-y;
        }
        if(simb == '*'){
            System.out.println(x+" x "+y+" = ?");
            resp = x*y;
        }
        if(simb == '/'){
            System.out.println(x+" / "+y+" = ?");
            resp = x/y;
        }
    }
    
    public static void check_answer(){
        Scanner ans = new Scanner(System.in);
        System.out.println("Digite la respuestas del problema:");
        float user_ans = ans.nextFloat();
        if (user_ans == resp){
            System.out.println("Respuesta correcta");
        }else{
            System.out.println("Respuesta incorrecta, el resultado es: "+resp);
        }
    }
}