import java.io.*;
class d implements Serializable
{
	int a;
	transient int b;
	
	d(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
}
public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		d obj = new d(12,24);
		
		FileOutputStream fos = new FileOutputStream("ser.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		
		FileInputStream fis = new FileInputStream("ser.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		d ob = (d)ois.readObject();
System.out.println("You can see 'ser.txt' file  @ P:\\Eclipse Standard 431\\Eclipse Standard 431\\java_lab\\src\\My_java_programs");
System.out.println("Transient memeber can't be serialized");		
System.out.println("a= "+ob.a+" b= "+ob.b);
	}

}
