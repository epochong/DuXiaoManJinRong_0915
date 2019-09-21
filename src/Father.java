import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/9/15 19:29
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class Father {
    public Father() {
        System.out.println("a");
    }
    public Father(int  x) {
        System.out.println("a" + x);
    }
}
class Test extends Father {
    public Test(int x) {
        System.out.println("b" + x);
    }

    public static void main(String[] args) {
        Test test = new Test(2);
        Scanner input = new Scanner(System.in);
    }
}
