import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.random.RandomGenerator;

public class MarathonResults {
    Map<Participant, Duration> result = new HashMap<>();

    public Map<Participant, Duration> initializeResults(){

        List<Participant> participants = Marathon.getParticipants();
        participants.forEach(p-> result
                .put(p, Duration.ofMinutes(RandomGenerator.getDefault().nextInt(10,60))));
        System.out.println("<--------------------------------Marathon Results------------------------------->");

        result.forEach((key, value) -> System.out.println(key + " Duration= " + value.toMinutes() + " Minutes "));
        getTenKMWinner();
        return result;
    }

    public Map<Participant, Duration> getTenKMWinner(){

        System.out.println("<--------------------------------10KM Winner------------------------------->");

        System.out.println(result.entrySet().stream().min(Map.Entry.comparingByValue()));
        System.out.println();

        return null;
    }


}
