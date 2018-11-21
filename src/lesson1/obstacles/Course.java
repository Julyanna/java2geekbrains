package lesson1.obstacles;

import lesson1.Competitors.*;

public class Course {
    Obstacle[] obstacles = new Obstacle[3];

    public Course( Cross obs1, Wall obs2, Water obs3){
        obstacles[0] = obs1;
        obstacles[1] = obs2;
        obstacles[2] = obs3;
    }

    public void doIt(Team team) {
        for (Competitor c: team.comp){
            for (Obstacle o: obstacles){
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }

}
