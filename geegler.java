import java.util.Random;
import java.util.Scanner;

public class geegler {
public static void main(String[] args) {
    
Scanner leitor = new Scanner(System.in);
int numeroGerado = new Random().nextInt(100);
 int tentativas = 0;
int numeroDigitado = 0;
while (tentativas < 5) {
System.out.println("Tell what number GEEGA is thinking");
numeroDigitado = leitor.nextInt();
tentativas++;
if (numeroDigitado == numeroGerado){
System.out.println("GEEGA is pleased with your answer.");
break;}
 else if(numeroDigitado < numeroGerado){
 System.out.println("The numer is higher, you dumb");}
 else{
 System.out.println("The number is lower, you dumb.");}
 }
 if (tentativas == 5 && numeroDigitado != numeroGerado){

 System.out.println("You failed, GEEGA will eat you");
 }

}

}