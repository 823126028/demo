public class Hello {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("running");
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("abc");
                e.printStackTrace();
            }
        }
    }
}
