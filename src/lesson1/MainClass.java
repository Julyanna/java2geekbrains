package lesson1;

import lesson1.Competitors.*;
import lesson1.obstacles.*;

public class MainClass {
    public static void main(String[] args) {
        /*
        Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};
        Obstacle[] obstacles = {new Cross(400), new Wall(2), new Water(1)};

        for (Competitor c: competitors){
            for (Obstacle o: obstacles){
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
        */

        Course c = new Course(new Cross(400), new Wall (2), new Water(1)); // Создаем полосу препятствий
        Team team = new Team( "Gaga", new Human ("Rudolf"), new Human ("Tom"), new Cat("Barsik"), new Dog ("Totosha")); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу
        team.dealWithObstacle(); // Показываем результаты

        System.out.println("========================");

    }
}
