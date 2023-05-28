package ISP;

interface Printable {
    void print();
}

interface Scanable {
    void scan();
}

class Printer implements Printable {
    @Override
    public void print() {
        System.out.println("Printing...");
    }
}

class Scanner implements Scanable {
    @Override
    public void scan() {
        System.out.println("Scanning...");
    }
}

class AllInOnePrinter implements Printable, Scanable {
    private Printable printer;
    private Scanable scanner;

    public AllInOnePrinter(Printable printer, Scanable scanner) {
        this.printer = printer;
        this.scanner = scanner;
    }

    @Override
    public void print() {
        printer.print();
    }

    @Override
    public void scan() {
        scanner.scan();
    }
}

public class Main {
    public static void main(String[] args) {
        Printable printer = new Printer();
        Scanable scanner = new Scanner();

        AllInOnePrinter allInOnePrinter = new AllInOnePrinter(printer, scanner);
        allInOnePrinter.print();
        allInOnePrinter.scan();
    }
}
