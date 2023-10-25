public class Exercise2
{

    public Exercise2()
    {
    }

    public static void main(String a[])
    {
        float X = 2.36F;
        System.out.println((new StringBuilder()).append("Sine: \t\t").append(Math.sin(X)).toString());
        System.out.println((new StringBuilder()).append("Cosine: \t\t").append(Math.cos(X)).toString());
        System.out.println((new StringBuilder()).append("Tangent: \t").append(Math.tan(X)).toString());
        System.out.println((new StringBuilder()).append("Cotangent: \t").append((float)(1.0D / Math.tan(X))).toString());
        System.out.println((new StringBuilder()).append("Square: \t\t").append(Math.pow(X, 2D)).toString());
        System.out.println((new StringBuilder()).append("Square root: \t").append(Math.sqrt(X)).toString());
        System.out.println((new StringBuilder()).append("Cube: \t\t").append(Math.pow(X, 3D)).toString());
        System.out.println((new StringBuilder()).append("Smallest larger integer: ").append(Math.ceil(X)).toString());
        System.out.println((new StringBuilder()).append("Largest smaller integer: ").append(Math.floor(X)).toString());
        float area = (float)(3.1415926535897931D * Math.pow(X, 2D));
        System.out.println((new StringBuilder()).append("Area: \t\t").append(area).toString());
        System.out.println("Pi: \t\t3.141592653589793");
        System.out.println("E: \t\t2.718281828459045");
    }
}
