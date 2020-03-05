package BasicOOPConcept.Abstraction;

public class Main
{
    public static void main(String[] args) {
        MailService mailService = new MailService();
        mailService.send();

        System.out.println("Here mailService is interested in sending mail not" +
                " in connecting, validating then sending & after disconnecting." +
                " So all those method should not be Abstracted.");
        System.out.println("If not Abstracted then we would be doing ");
        /*mailService.connect();
        mailService.validate();
        mailService.send();
        mailService.disconnect();*/
        System.out.println("which is bad way..!!!");
    }
}
