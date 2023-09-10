public class Treadmill {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public void run(Participant participant) {
        participant.run(length);
    }

    public Object getLength() {
        return null;
    }
}

