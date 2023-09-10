

public class Main {
    public static void main(String[] args) {
        Participant person1 = new Person("John", 1000, 2);
        Participant person2 = new Person("Jane", 500, 1);
        Participant cat1 = new Cat("Tom", 200, 3);
        Participant cat2 = new Cat("Smokey", 300, 2);
        Participant robot1 = new Robot("R2D2", 5000, 10);
        Participant robot2 = new Robot("C3PO", 3000, 5);

        Treadmill treadmill1 = new Treadmill(500);
        Treadmill treadmill2 = new Treadmill(1000);
        Wall wall1 = new Wall(1);
        Wall wall2 = new Wall(2);

        Participant[] participants = {person1, person2, cat1, cat2, robot1, robot2};
        Object[] obstacles = {treadmill1, wall1, treadmill2, wall2};

        for (Participant participant : participants) {
            boolean canComplete = true;
            for (Object obstacle : obstacles) {
                if (obstacle instanceof Treadmill) {
                    ((Treadmill) obstacle).run(participant);
                } else if (obstacle instanceof Wall) {
                    ((Wall) obstacle).jump(participant);
                }
                if (participant instanceof Participant && ((Participant) participant).getMaxJumpHeight() < ((Wall) obstacle).getHeight()
                        || ((Participant) participant).getMaxRunDistance() < ((Treadmill) obstacle).getLength()) {
                    canComplete = false;
                    break;
                }
            }
            if (canComplete) {
                System.out.println(participant.getName() + " прошел полосу препятствий");
            } else {
                System.out.println(participant.getName() + " не смог пройти полосу препятствий");
            }
        }
    }
}