package BasicOOPConcept.Abstraction;

public class MailService {
    private void  connect()
    {
        System.out.println("Connect to Mail service");
    }
    private void  validate()
    {
        System.out.println("Validate email ID");
    }
    public void  send()
    {
        connect();
        validate();
        System.out.println("Send Mail");
        disconnect();
    }
    private void  disconnect()
    {
        System.out.println("DisConnect Mail service");
    }

}
