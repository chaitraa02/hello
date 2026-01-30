public class method6 {
    public static double add(double a,double b){
        double result=a+b;
        return result;
    }
    public static int add(int a,int b){
        int result=a+b;
        return result;

    }
    public static void main(String[] args) {
     double result=add(10.5,20.6);
        int res=add(10,20);
        System.out.println("result"+result);
          System.out.println("result"+res);
    }
}