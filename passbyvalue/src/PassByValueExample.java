public class PassByValueExample {

    public static void main(String[] args) {

     int num =10;
     System.out.println("Before calling modifyValue: num = " + num);

     modifyValue(num);
     System.out.println("After calling modifyValue: num = " + num);

     StringBuilder sb = new StringBuilder("Hello");
     System.out.println("Before calling modifyReference: sb = " + sb);

         modifyReference(sb);
         System.out.println("After calling modifyReference: sb = " + sb);

    }

    public static void modifyValue(int num)
    {
        num +=5;
        System.out.println("Inside modifyvalue=" + num);

    }

    public static void modifyReference(StringBuilder sb)
    {
        sb.append("World");
        System.out.println("Inside modifyReference: sb = " + sb);

    }
}