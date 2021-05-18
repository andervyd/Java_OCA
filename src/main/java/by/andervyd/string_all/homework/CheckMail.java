package by.andervyd.string_all.homework;

public class CheckMail {

    public static void checkEmail(String email) {
        System.out.println("Use email: " +
                email.substring(email.indexOf('@') + 1, email.indexOf('.')));
    }
}

class MailRunner {
    public static void main(String[] args) {

        // ya@yahoo.com;
        // on@mail.ru;
        // ona@gmail.com;
        CheckMail.checkEmail("ya@yahoo.com;");
    }
}
