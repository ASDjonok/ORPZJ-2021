public class Lab3 {
    public static void main(String[] args) {
        System.out.println("\\");
        String text = "1.2.3";
        final String[] textParts = text.split("\\.");
        for (int i = 0; i < textParts.length; i++) {
            System.out.println(textParts[i]);
        }

        String s = "Done!";
        System.out.println(s);
        String s2 = s;

        s = "Done!!";
        System.out.println(s);
        System.out.println(s2);
        s += "!";
        System.out.println(s);
        /*String s3 = "";
        for (int i = 0; i < 10; i++) {
            s3 += i;
        }
        System.out.println(s3);*/

        /*String s31 = new String("");
        String s41 = "a";
        String s42 = "a";*/

        /*StringBuilder s3 = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            s3.append(i);
        }
        System.out.println(s3);*/

        StringBuffer s3 = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            s3.append(i);
        }
        System.out.println(s3);

        /*s3.append('\uFFFF');
        System.out.println(s3);*/

        System.out.println("a" + "b");
        System.out.println("a" + 2);

        StringBuffer stringBuffer = new StringBuffer();

//        char c = '9';
        /*char c = 9;
        System.out.println(c);
        System.out.println((int)c);
        c += 1;
        System.out.println(c);
        System.out.println((int)c);*/

        /*System.out.println("Done!");
        System.out.println(1);
        System.out.println('1');*/

        /*int a = 1;
        a = (int) 1.0f;
        float float1 = 1.0f;
        float float2 = (float) 1.0;
        double double1 = 1.0;
        char c = '1';*/


    }
}
