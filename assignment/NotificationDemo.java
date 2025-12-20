interface NotificationService {
    void sendNotification(String message);
}

class EmailNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Email sent: " + message);
    }
}
class SMSNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS sent: " + message);
    }
}
class PushNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Push notification sent: " + message);
    }
}
interface NotificationFactory {
    NotificationService getNotificationService(String type);
}

class NotificationFactoryImpl implements NotificationFactory {

    @Override
    public NotificationService getNotificationService(String type) {

        if (type == null) {
            return null;
        }

        switch (type.toLowerCase()) {
            case "email":
                return new EmailNotification();

            case "sms":
                return new SMSNotification();

            case "push":
                return new PushNotification();

            default:
                System.out.println("Invalid notification type!");
                return null;
        }
    }
}

public class NotificationDemo {

    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactoryImpl();
        NotificationService email =
                factory.getNotificationService("email");
        if (email != null) {
            email.sendNotification("Welcome via Email");
        }
        NotificationService sms =
                factory.getNotificationService("sms");
        if (sms != null) {
            sms.sendNotification("OTP sent via SMS");
        }
        NotificationService push =
                factory.getNotificationService("push");
        if (push != null) {
            push.sendNotification("New update available");
        }
    }
}