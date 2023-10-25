public class Exercise4
{

    public Exercise4()
    {
    }

    public static void main(String a[])
    {
        if(a.length < 1)
        {
            System.out.println("Please run your program by providing integer value as an argument");
        } else
        {
            int num = Integer.parseInt(a[0]);
            System.out.println((new StringBuilder()).append("Decimal ").append(num).toString());
            System.out.println((new StringBuilder()).append("Binary ").append(Integer.toBinaryString(num)).toString());
            System.out.println((new StringBuilder()).append("Octal ").append(Integer.toOctalString(num)).toString());
            System.out.println((new StringBuilder()).append("Hexadecimal ").append(Integer.toHexString(num)).toString());
        }
    }
}
