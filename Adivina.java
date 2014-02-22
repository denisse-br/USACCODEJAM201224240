import java.util.Scanner;
public class Adivina{
public static void main(String[] args){
Scanner entrada = new Scanner(System.in);
System.out.println("Adivina el numero de 1-100 que estoy pensando:");
int x=entrada.nextInt();
int y = (int) Math.floor(Math.random()*100+1);
do{
if(x>y){
System.out.println("El numero que he elegido es menor");
x=entrada.nextInt();
}
 else{
System.out.println("El numero que he elegido es mayor");
x=entrada.nextInt();
}
}
while(x!=y);

System.out.println("HAS ADIVINADO EL NUMERO, ¡FELICIDADES!");

}
}
