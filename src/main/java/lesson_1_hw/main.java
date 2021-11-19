package lesson_1_hw;

public class main {
    public static void main(String[] args) {
        Participant[] participants = new Participant[]{
                new Human("Vanya", 2, 500),
                new Robot("LR300", 10, 1000),
                new Cat("Barsik", 5,1000)
        };
        Obstacle[] obstacles =  new Obstacle[]{
            new RunningTrack(400),
            new Wall(3)
        };

        System.out.println(participants[0].toString());

        for (Obstacle obstacle : obstacles){
            for (Participant participant : participants){
                if (!participant.isStopped()){
                    if (obstacle instanceof Wall){
                        ((Wall)obstacle).accept((Jumpable)participant);
                    }
                    else if (obstacle instanceof RunningTrack){
                        ((RunningTrack)obstacle).accept((Runnable) participant);
                    }
                }
            }
        }
    }
}
