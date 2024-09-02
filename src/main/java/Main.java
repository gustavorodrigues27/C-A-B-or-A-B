import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o valor de A: ");
    int A = sc.nextInt();

    System.out.println("Digite o valor de B: ");
    int B = sc.nextInt();

    int C;

    

    if (A == B){
      System.out.println("Este é o valor:");
      System.out.println(C = A + B);
      
    }
    else{
      System.out.println("Este é o valor: ");
      System.out.println(C = A * B);
    }




    sc.close();
  }


}