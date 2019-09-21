/**
 * @author epochong
 * @date 2019/9/15 19:22
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
class Example {
    private int cnt2;
    int cnt1 = 0;
    public void m() {
        cnt1 += 2;
        cnt2 += 2;
        System.out.println(cnt1 + " " + cnt2);
    }
}

class MyThread extends Thread {
    private Example i;
    public MyThread(Example i) {
        this.i = i;
    }
    public void run() {
        synchronized (i) {
            i.m();
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        Example mv = new Example();
        Thread thread1 = new MyThread(mv);
        Thread thread2 = new MyThread(mv);
        Thread thread3 = new MyThread(mv);
        thread1.start();;
        thread2.start();
        thread3.start();
    }
}
