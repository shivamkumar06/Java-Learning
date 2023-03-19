import java.util.HashMap;

public class hash_maps_example {
    public static void main(String[] args) {
        HashMap<String,Integer> examScores = new HashMap<String,Integer>();
        examScores.put("Math",75);
        examScores.put("English",90);
        examScores.put("Physics",96);
        examScores.putIfAbsent("Computer",99);
        System.out.println(examScores.toString());
        System.out.println(examScores.get("Math"));
        System.out.println(examScores.get("Biology"));
        System.out.println(examScores.getOrDefault("Chemistry",88));
        //examScores.clear();
        System.out.println(examScores.size());
        examScores.remove("Math");
        System.out.println(examScores.toString());
        System.out.println(examScores.containsKey("English"));
        System.out.println(examScores.containsValue(100));
        System.out.println(examScores.isEmpty());
        examScores.forEach((subject,score) -> {
            System.out.println(subject+"-"+score);
        });
        examScores.forEach((subject,score) -> {
            examScores.replace(subject,score-10);
        });
        System.out.println(examScores.toString());
    }
}
