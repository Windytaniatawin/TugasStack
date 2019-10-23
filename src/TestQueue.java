public class TestQueue {
    public static void main(String[] args) {
        AplicationQueueKFC windy = new AplicationQueueKFC(4);
        windy.enqueu("3");
        windy.enqueu("5");
        windy.enqueu("2");
        windy.enqueu("8");

        System.out.println(windy.dequeue());

    }
}
