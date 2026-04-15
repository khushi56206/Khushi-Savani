class TablePrinter {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        System.out.println();
    }
}

class MyThread extends Thread {
    TablePrinter t;
    int num;

    MyThread(TablePrinter t, int num) {
        this.t = t;
        this.num = num;
    }

    public void run() {
        t.printTable(num);
    }
}

public class Q25{
    public static void main(String[] args) {
        TablePrinter obj = new TablePrinter();

        MyThread t1 = new MyThread(obj, 5);
        MyThread t2 = new MyThread(obj, 7);

        t1.start();
        t2.start();
    }
}