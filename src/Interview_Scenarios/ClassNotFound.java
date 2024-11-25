package Interview_Scenarios;


class SystemClass extends ClassLoader
{
    void loadSystemClass() throws ClassNotFoundException
    {
// JVM loads the Constriant class
        Class cl = super.loadClass("com.google.common.collect.Constraint");
//        super.findSystemClass()
//                Class.forName()

// If cl != null then it means cl is loaded
// and there is no need to load it again
        if (cl != null)
        {
            System.out.println("Class is loaded successfully !!!");
        }
        else
        {
            System.out.println("Using system classloader, the given class is loaded !!!");
        }
    }
}

public class ClassNotFound extends Throwable {
    // main method
    public static void main(String[] args) throws Exception
    {
        // Creating an object of the class SystemClass
        SystemClass sc = new SystemClass();
        sc.loadSystemClass();
    }
}