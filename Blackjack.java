import java.util.Scanner;
public class blackjack{

public static void main(String args[]){
System.out.println("Bienvenido a BlackJack");


int ram = (int) (Math.random()*13+1);
int ram2 = (int) (Math.random()*13+1);
int ram3 = (int) (Math.random()*13+1);
int resultado1= (int) (ram+ram2);
int resultado3=(int)(resultado1+ram3);

 
System.out.println("Primera Carta" +ram);
System.out.println("Primera Carta" +ram2);
System.out.println("Agregar una carta mas?");
System.out.println("si(1) no(0)");
Scanner entrada = new Scanner(System.in);

int x=entrada.nextInt();


if(x==1){
System.out.println("nueva carta"+ram3);
System.out.println("Resultado "+resultado3);
}
 else if(x==0){
System.out.println("Suma" +resultado1);
}

 
if(x<21){
System.out.println("Perdio");
}
 else if(x>21){
System.out.println("Perdio");
}


if(resultado1==21){
	System.out.println("Ganaste!");
}
if(resultado3==21){
	System.out.println("Ganaste!");
}


	}
