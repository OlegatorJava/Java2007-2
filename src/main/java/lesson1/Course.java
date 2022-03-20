package lesson1;


public class Course {
    private Lat[] arrayLat;

    public Course(Treadmill treadmill, Wall wall) {
        this.arrayLat = new Lat[]{treadmill,wall};
    }




    public void doIt(Team team){
        for (int i = 0; i < team.getArrayMotions().length; i++) {
            for (int j = 0; j < arrayLat.length; j++) {
                if(arrayLat[j].overcome(team.getArrayMotions()[i]) == false){
                    i++;
                    j = -1;    // самому смешно на решение, но работает и даже универсально(если препятствий 85)
                }
            }
        }
    }

}
