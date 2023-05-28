package DIP;

interface MessageProvider {
    String getMessage();
}

class SimpleMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello, World!";
    }
}

class MessagePrinter {
    private MessageProvider provider;

    public MessagePrinter(MessageProvider provider) {
        this.provider = provider;
    }

    public void printMessage() {
        String message = provider.getMessage();
        System.out.println(message);
    }
}

public class Main {
    public static void main(String[] args) {
        MessageProvider provider = new SimpleMessageProvider();
        MessagePrinter printer = new MessagePrinter(provider);
        printer.printMessage();
    }
}
