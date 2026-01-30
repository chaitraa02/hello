public class method5 {
    public static int add(int a,int b){
         int result=a+b;
        return result;
    }
    public static int add(int a,int b,int c){
        int result=a+b+c;
        return result;

    }
    public static void main(String[] args) {
     int result=add(10,20);
        int res=add(10,20,30);
        System.out.println("result"+result);
          System.out.println("result"+res);
    }



    
}
