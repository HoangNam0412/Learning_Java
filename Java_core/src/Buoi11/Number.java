package Buoi11;

public class Number {
    public class NumberPrinter implements Runnable {
        private int start;
        private int end;

        public NumberPrinter(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " bắt đầu.");
            for (int i = start; i <= end; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(100); // Giả lập độ trễ để dễ quan sát
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " kết thúc.");
        }
    }

}
