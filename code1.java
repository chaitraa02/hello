import java.util.Scanner;
public class code1 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value for a:");
    int a= sc.nextInt();
    System.out.println("enter the value for b:");
    int b=sc.nextInt();
    int sum=a+b;
    int diff=a-b;
    int product=a*b;
    int quotient=a/b;
    System.out.printf("Sum:"+sum+" diff:"+diff+" product:"+product+" quotient:"+quotient);
    
}    
}
