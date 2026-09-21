public class interfacepcts {
    public static void main(String[] args){
        Notification n1 = new Email();
Notification n2 = new SMS();
n1.send();
n2.send();
NotificationService service = new NotificationService();

service.sendEmail();
service.sendSMS();
 
    }
}
interface EmailNotification{
     void  sendEmail();
}
interface SMSNotification{
     void   sendSMS();
}
class NotificationService implements EmailNotification,SMSNotification{
    public void  sendEmail(){
        System.out.println("Email sent successfully");
    }
    public void   sendSMS(){
        System.out.println("SMS sent successfully");
    }
}
abstract class Notification{
    abstract void send();
}
class Email extends Notification{
    void send(){
        System.out.println("Email notification sent");
    }
}
class SMS extends Notification{
    void send(){
        System.out.println(" SMS notification sent");
    }
}