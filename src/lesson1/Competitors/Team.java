package lesson1.Competitors;

public class Team {
    String name;
    public Competitor[] comp = new Competitor[4];

    public Team (String name, Human comp1, Human comp2, Cat comp3, Dog comp4 ){
        this.name = name;
        comp[0] = comp1;
        comp[1] = comp2;
        comp[2] = comp3;
        comp[3] = comp4;
    }

    public void dealWithObstacle(){
        for (Competitor c: comp) {
            if (c.isOnDistance() == true) {
                c.showResult();
            }
        }

    }
    public void infoTeamMembers() {
        for (Competitor c: comp) {
            c.showResult();
        }
    }
}
