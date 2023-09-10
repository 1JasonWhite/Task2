public class Wall {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void jump(Participant participant) {
        participant.jump(height);
    }

    public Object getHeight() {
        return null;
    }
}
