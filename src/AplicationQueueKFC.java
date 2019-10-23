public class AplicationQueueKFC {

    String antrian[];
    int tail;

    public AplicationQueueKFC(int jumlah) {
        antrian = new String[jumlah];
        tail = -1;
    }

    public void enqueu(String nilai) {
        if (tail < antrian.length - 1) {
        tail++;
        antrian [tail] = nilai;
        }
    }
    public boolean isEmpty() {
        return tail <0;
    }
public String dequeue() {
    if (!isEmpty()) {

        String temp = antrian[0];
        for (int i = 0; i < antrian.length - 1; i++) {
            antrian[i] = antrian[i + 1];
        }
        tail--;
        return temp;
    }
    return "";
}
public void print() {
    for (int i = 0; i < antrian.length; i++) {

    }


}}