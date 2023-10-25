public class Exercise3
{

    public Exercise3()
    {
    }

    public static void main(String args[])
    {
        if(args.length < 3)
        {
            System.out.println("Insert NAME, Year of birth and height in meters.");
        } else
        {
            String name = args[0];
            int year = 0;
            float height = 0.0F;
            try
            {
                year = Integer.parseInt(args[1]);
            }
            catch(Exception e)
            {
                System.out.println("Second element should be YEAR, i.e. integer");
            }
            try
            {
                height = Float.parseFloat(args[2]);
            }
            catch(Exception e)
            {
                System.out.println("The third value shoud be decimal, i.e. height in meters.");
            }
            System.out.println((new StringBuilder()).append("Your name is ").append(name).toString());
            System.out.println((new StringBuilder()).append("You are ").append(2019 - year).append(" old.").toString());
            System.out.println((new StringBuilder()).append("Height: ").append(height * 100F).toString());
        }
    }
}
