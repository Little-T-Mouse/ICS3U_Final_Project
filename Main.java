import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Problem problem1 = new Problem(1, 1, "Problem 1", "Graph Theory", new Date(2023, 05, 19), null, new User("Tommy Shan", 1, 0, 0, 0, Role.ADMIN));
        Problem problem2 = new Problem(2, 1, "Problem 2", "Graph Theory", new Date(2023, 05, 19), null, new User("Tommy Shan", 1, 0, 0, 0, Role.ADMIN));
        Problem problem3 = new Problem(3, 2, "Problem 3", "Dynamic Programming", new Date(2023, 05, 19), null, new User("Harry Xu", 2, 0, 0, 0, Role.ADMIN));
        Problem problem4 = new Problem(4, 2, "Problem 4", "Dynamic Programming", new Date(2023, 05, 19), null, new User("Perry Xu", 3, 0, 0, 0, Role.MODERATOR));
        ArrayList<Problem> problems = new ArrayList<Problem>();
        problems.add(problem1);
        problems.add(problem2);
        problems.add(problem3);
        ProblemRecommender recgen = new ProblemRecommender(problems);
        ArrayList<Problem> relatedProblem = recgen.getProblems(problem4, 2);
        for(int i = 0; i < relatedProblem.size(); i++) {
            System.out.println("Rank " + (i + 1) + " " + relatedProblem.get(i).getContent());
        }
    }
}
