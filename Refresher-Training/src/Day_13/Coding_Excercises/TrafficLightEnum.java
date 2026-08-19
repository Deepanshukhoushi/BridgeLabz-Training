package Day_13.Coding_Excercises;

enum TrafficLight {
    RED(30), YELLOW(5), GREEN(25);

    private int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    int getDuration() {
        return duration;
    }
}

public class TrafficLightEnum {
    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light + " - " + light.getDuration() + " seconds");
        }
    }
}
