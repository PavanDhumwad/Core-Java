package Java7;

import jdk.nashorn.internal.runtime.ECMAException;

public class try_catch
{
    public static void main(String[] args)
    {
        try
        { tryCatchWithResourceManagement(); }
        catch (Exception e)
        { System.out.println(e.getMessage()); }

        /*try
        { normalTryCatch(); }
        catch (Exception e)
        { System.out.println(e.getMessage()); }*/
    }

    private static void tryCatchWithResourceManagement() throws Exception
    {
        try(MyResource myResource = new MyResource())
        {
            System.out.println("MyResource created in try-with resource(Java 7 feature)");
            if(true)
                throw new Exception("Exception in tryCatchWithResourceManagement");
        }
    }
    private static void normalTryCatch() throws Exception
    {
        MyResource myResource = null;
        try
        {
            myResource = new MyResource();
            System.out.println("--------------------------------");
            System.out.println("MyResource created in normal try-catch block");
            if(true)
                throw new Exception("Exception in normalTryCatch");
        }
        finally
        {
            if(myResource != null)
                myResource.close();
        }
    }
}

class MyResource implements AutoCloseable
{
    @Override
    public void close() throws Exception
    {
        System.out.println("Closing MyResource");
        throw new Exception("Exception in closing");
    }
}
