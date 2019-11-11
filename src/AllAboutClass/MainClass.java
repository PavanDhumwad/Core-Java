package AllAboutClass;


public class MainClass
{
    public static void main(String[] args)
    {
        System.out.println("In inheritance, call to override method will happen depending upon type of Object");
        SuperClass objSuper ;//= new SuperClass(); //showing redundant
        SubClass objSub = new SubClass();
        objSuper = objSub;//Sub-class object is assigned to Super-class reference variable
        objSuper.disp(); //Note: Sub-class disp() is called.If disp() is NOT defined in SuperClass then we get CTE
        objSuper.testStaticMethod(); //Note: Super-class static method called.If testStaticMethod() is NOT defined in SuperClass then we get CTE

        /*SuperClass objSup = new SuperClass();
        objSup.disp();
        SubClass objSub = new SubClass();
        objSub.disp();*/

        SuperClass anonymousObj = new SuperClass(){
            @Override
            void disp() {
                System.out.println("Changed msg using Anonymous Class");
            }
        };
        anonymousObj.disp();
    }
}
