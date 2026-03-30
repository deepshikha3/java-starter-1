import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Marathon {

    static int A = 1;
    static int B = 2;
    int C = 2;
    int D = 2;


public static void main(String[] args){
    System.out.println(A);
    System.out.println(B);

//    Static, Non-Static , Context, Object

    //    Static methods can access Static variables and static methods
    //    Non-Static Static methods can access Non-Static variables and Non-static methods
    //    Context is Part of Class with static methods and static variables
    //    Object is Part of Class with non-static methods and non-static variables


    List<Participant> participantList = getParticipants();
    showResults();

    List<Participant> maleParticipants = new ArrayList<>();
    List<Participant> femaleParticipants = new ArrayList<>();
    List<Participant> fiveKMParticipants = new ArrayList<>();
    List<Participant> tenKMParticipants = new ArrayList<>();

    participantList.forEach(X -> {
        if (X.getGender() == "M") {
            maleParticipants.add(X);
        }
        if (X.getGender() == "F") {
            femaleParticipants.add(X);
        }
        if (X.marathonType == MarathonTypes.MarathonType.FIVE_KM) {
            fiveKMParticipants.add(X);
        }
        if (X.marathonType == MarathonTypes.MarathonType.TEN_KM) {
            tenKMParticipants.add(X);
        }
    });
    //maleParticipants = participantList.stream().filter(X -> Objects.equals(X.getGender(), "M")).toList();
    //femaleParticipants = participantList.stream().filter(X -> Objects.equals(X.getGender(), "F")).toList();
    System.out.println("-----------------");
    System.out.println("------------------Male Participants");
    maleParticipants.forEach(p -> System.out.println(p.id + " " + p.name + " " + p.age + " " + p.gender + " " + p.marathonType));
    System.out.println("-----------------");
    System.out.println("------------------Female Participants");
    femaleParticipants.forEach(p -> System.out.println(p.id + " " + p.name + " " + p.age + " " + p.gender + " " + p.marathonType));
    System.out.println("-----------------");
    System.out.println("------------------5KM Participants");
    fiveKMParticipants.forEach(p -> System.out.println(p.id + " " + p.name + " " + p.age + " " + p.gender + " " + p.marathonType));
    System.out.println("-----------------");
    System.out.println("------------------10KM Participants");
    tenKMParticipants.forEach(p -> System.out.println(p.id + " " + p.name + " " + p.age + " " + p.gender + " " + p.marathonType));
}

    public static List<Participant> getParticipants(){

      //  System.out.println(C);
        List<Participant> participantList = new ArrayList<>();
        MarathonTypes.MarathonType[] types = MarathonTypes.MarathonType.values();

        int i = 50;
        int randId = 1001;
        while(i>=1){
            String gender = ThreadLocalRandom.current().nextBoolean() ? "M" : "F";
            int randAge = ThreadLocalRandom.current().nextInt(18, 50); // 0–100
            MarathonTypes.MarathonType type = types[ThreadLocalRandom.current().nextInt(types.length)];
            participantList.add(new Participant(randomName(),gender,randAge,randId, type));
            randId++;
            i--;
        }
        participantList.forEach(p->
                System.out.println(p.id + " " + p.name + " " + p.age + " " + p.gender + " " + p.marathonType));
        return participantList;
    }

    private static String randomName() {
        int length = ThreadLocalRandom.current().nextInt(4, 9); // name length 4–8
        String letters = "aoeipluo";
        StringBuilder name = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char c = letters.charAt(ThreadLocalRandom.current().nextInt(letters.length()));
            name.append(c);
        }
        // Capitalize first letter
        name.setCharAt(0, Character.toUpperCase(name.charAt(0)));
        return name.toString();
    }

    public static Map<Participant, Duration> showResults(){
    MarathonResults marathonResults = new MarathonResults();
        return marathonResults.initializeResults();
    }





}
