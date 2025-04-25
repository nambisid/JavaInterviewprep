public class StringBufferVsBuilder {
    public static void main(String[] args) {


        //Buffer is Thread safe , can be used for multithreading
        //Supports Synchronization


//        StringBuffer objStringBuffer = new StringBuffer("Buffer"); // when intialised length of the obj will be 16
//                                                                    // + length of the string
//        objStringBuffer.append("object");
//        objStringBuffer.insert(0, "Buffer");
//        System.out.println(objStringBuffer.toString());
//        System.out.println(objStringBuffer.capacity() );
//
//
//        //Faster than string Buffer, used for single threads
//        StringBuilder objStringBuilder = new StringBuilder("Builder");
//
//        objStringBuilder.append("object");
//        System.out.println(objStringBuilder.toString());

     StringBuffer objStringBuilder = new StringBuffer();

     Thread t1 = new Thread(() -> {

          for(int i = 0; i < 1000; i++) {

              objStringBuilder.append("A");

          }


     });


        Thread t2 = new Thread(() -> {

            for(int i = 0; i < 1000; i++) {

                objStringBuilder.append("B");

            }





        });



        t1.start();
        t2.start();

        try
        {
            t1.join();
            t2.join();
        }
        catch (Exception e)
        {

        };

        System.out.println(objStringBuilder.toString().length());

    }
}