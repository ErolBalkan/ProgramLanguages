interface Two_D_shape {    	
	double PI=3.14;
	
	abstract void parameters(); // only the interface of the method is defined
   	abstract float area();
      	abstract float perimeter();
}
interface Three_D_shape {    	
	abstract float volume();
}

class Triangle implements Two_D_shape {
	int sidea, sideb, sidec, height;	
	Triangle (int sa,int sb, int sc, int h){        
		sidea=sa;
		sideb=sb;
		sidec=sc;
		height=h;
		System.out.println ("A new triangle has been created");    
	}
	public float  perimeter() { 
		return sidea+sideb+sidec;		
	}
	
	public void parameters () { 
		 System.out.println ("Side A: "+ sidea + "  Side B: "+sideb+" i side C: "+sidec);		
	}
	public float area () { 
		return sidea*height/2;		
	} 
	public boolean rectangular () { 
		if (sidea*sidea+sideb*sideb==sidec*sidec)
		return true;
		else
		return false;	
	} 
	
	
}
class Sphere implements Two_D_shape,Three_D_shape  { 
	int radius;
	Sphere (int r )
	{        
		radius=r;
		System.out.println ("A new sphere has been created");    
	}
	
	public void parameters () { 
	 System.out.println ("Radius: "+ radius);	 		
	}
	public float  perimeter() { return 0; }
	
	public float area () { 
		return (float) PI*4*radius*radius;		
	}
	 public float volume () { 
		return (float)PI*radius*radius*radius*((float) 4/3);		
	}
}

public class Shapes 
{    
	public static void main (String[] XXX) 
	{   
		Triangle T1=new Triangle(3,5,6,3);
		Sphere B1=new Sphere(4);
		Two_D_shape T2=new Triangle(8,2,10,16);
		Two_D_shape B2=new Sphere(3);
		Three_D_shape B3=new Sphere(7);
		
		System.out.println("\nfor T1");
		T1.parameters();
		System.out.println("Area:"+T1.area());
		System.out.println("perimeter: "+T1.perimeter());
		System.out.println("Is REctagular: "+T1.rectangular());
	
		System.out.println("\nfor B1");
		B1.parameters();
		System.out.println("Area:"+B1.area());
		System.out.println("perimeter: "+B1.perimeter());
		System.out.println("Volume:"+B1.volume());
	
		System.out.println("\nfor T2");
		T2.parameters();
		System.out.println("Area:"+T2.area());
		System.out.println("perimeter: "+T2.perimeter());
		System.out.println("Is Rectagular: "+((Triangle)T2).rectangular());
			
		
		
		
		System.out.println("\nfor B2");
		B2.parameters();
		System.out.println("Area:"+B2.area());
		System.out.println("Volume:"+((Sphere)B2).volume());
		
		
		System.out.println("\nfor B3");
		((Sphere)B3).parameters();
		System.out.println("Area:"+((Two_D_shape)B3).area());
		System.out.println("perimeter: "+((Two_D_shape)B3).perimeter());
		System.out.println("Volume:"+B3.volume());
        }
}
