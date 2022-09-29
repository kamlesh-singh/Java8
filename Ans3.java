public class Ans3 {
    public static void main(String[] args) {
        new Thread(()->{System.out.println("new Thread");}).start();
    }
}
