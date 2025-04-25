public class Main {
    public static void main(String[] args)
    {
        //String is immutable
    //System.out.println("Hello, World!");

        String str1 = "Hello";
        // Creating another string "Hello" (refers to the same object in the string pool)
        String str3 = "Hello"; // Due to string interning, it refers to the same object in the string pool

        // Concatenating "World" to str1 and assigning it to str2
        String str2 = str1 + "world";// New string created and stored in the heap

        // Converting str1 to uppercase and assigning it to str1
        str1 = str1.toUpperCase();// New string created and stored in the heap

        // Outputting the values of str1, str2, and str3
        System.out.println("str1: " + str1); // Output: "HELLO"
        System.out.println("str2: " + str2); // Output: "Hello World"
        System.out.println("str3: " + str3); // Output: "Hello"

    }
}