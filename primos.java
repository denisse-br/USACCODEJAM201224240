import java.util.Scanner;  
public class primos {  
public static void main(String[] args) {  
Scanner leer = new Scanner(System.in);
int limite;
System.out.println("ingresa un numero");
limite = leer.nextInt();
System.out.println("-----------Numeros Primos---------");
System.out.print(1+",");

        for(int i=1;i<limite;i++){
         	int count=0;
        for(int j=1; j<=i;j++){

        if(i%j==0)
        count++;
    }
      if(count==2)
      System.out.print(i+",");
    }
       
  }  
}  
