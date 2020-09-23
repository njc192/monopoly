public class Util {

    public static void print(Object ... strings)
    {
        for(int i = 0; i < strings.length;i++)
        {
            System.out.print(strings[i] + " ");
        }
        System.out.println();
    }
}
