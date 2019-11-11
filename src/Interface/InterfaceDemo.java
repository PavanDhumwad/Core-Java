package Interface;

public interface InterfaceDemo
{
     void abc();

     default int notImplemeted(){
          //possible from 1.8
          return 999;
     }
}
