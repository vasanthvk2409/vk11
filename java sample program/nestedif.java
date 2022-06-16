public class nestedif {
    public static void main(String[] arg)
    {
        int mark=1;
        {
            if(mark>=90)
                System.out.println("A grade");
            else if(mark>=40)
                System.out.println("pass");
            else if(mark>35)
                System.out.println("justpass");
            else
                System.out.println("fail");
        }
    }
}
