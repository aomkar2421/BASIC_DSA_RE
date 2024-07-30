package array;

abstract class Demo{
	int a = 10;
}

public class Test extends Demo
{  

    public static void main (String args[])  
    {  
        Test test = new Test();
        test.print();
    }  
    
    void print() {
    	a=5;
    	System.out.println(a);
    }
}  
