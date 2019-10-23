public class AplicationStackingCloth {

    Baju tumpukan[];
    int top;

    public AplicationStackingCloth(int banyak) {
        tumpukan = new Baju[banyak];
        top = -1;
    }

    public void push(Baju nilai) {
        if (top < tumpukan.length - 1) {
            tumpukan[++top] = nilai;
        }
    }

    public Baju pop() {
        if (top >= 0) {
            Baju temp = tumpukan[top--];
            return temp;
        }

        return null;



    }}