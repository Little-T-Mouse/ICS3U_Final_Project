import java.util.ArrayList;

public class ProblemRecommender {
    private ArrayList<Problem> problems;

    public ProblemRecommender() {

    }

    public ProblemRecommender(ArrayList<Problem> problems) {
        this.problems = problems;
    }

    public void addProblem(Problem problem) {
        problems.add(problem);
    }

    public ArrayList<Problem> getProblems(Problem curProblem, int numOfProblem) {
        ArrayList<Problem> ret = new ArrayList<Problem>();
        int relativity[] = new int[problems.size()];
        for(int i = 0; i < problems.size(); i++) {
            relativity[i] = 0;
            // If the different between two problems' difficulty is equals to 0, the problem earn 10 relativity points. As the difference increased by 1, the relativity point decreased by 1, until 0.
            relativity[i] += Math.max(0, 10 - Math.abs(problems.get(i).getDifficulty() - curProblem.getDifficulty()));
            // If the author of the two problems are same, the problem earn 1 additional relativity point.
            relativity[i] += (problems.get(i).getAuthor().equals(curProblem.getAuthor()) ? 1 : 0);
            // If the problem type of the two problems are same, the problem earn 5 additional relativity point.
            relativity[i] += (problems.get(i).getType().equals(curProblem.getType()) ? 5 : 0);
            // The proportion of same characters * 100 is added to the relativity point.
            relativity[i] += similarity(problems.get(i).getContent(), curProblem.getContent());
            if(problems.get(i).getProblemID() == curProblem.getProblemID()) {
                relativity[i] = -1;
            }
        }
        for(int i = 0; i < Math.min(problems.size(), numOfProblem); i++) {
            int maxPoint = -1, maxProblem = -1;
            for(int j = 0; j < problems.size(); j++) {
                if(maxPoint < relativity[j]) {
                    maxPoint = relativity[j];
                    maxProblem = j;
                }
            }
            relativity[maxProblem] = -1;
            ret.add(problems.get(maxProblem));
        }
        return ret;
    }

    public int similarity(String content1, String content2) {
        int ret = 0;
        int frq1[] = new int[26];
        int frq2[] = new int[26];
        for(int i = 0; i < content1.length(); i++) {
            if(Character.isAlphabetic(content1.charAt(i))) {
                frq1[Character.toLowerCase(content1.charAt(i)) - 'a']++;
            }
        }
        for(int i = 0; i < content2.length(); i++) {
            if(Character.isAlphabetic(content2.charAt(i))) {
                frq1[Character.toLowerCase(content2.charAt(i)) - 'a']++;
            }
        }
        for(int i = 0; i < 26; i++) {
            ret += Math.max(frq1[i], frq2[i]);
        }
        return (int)(((double)ret / (double)Math.min(content1.length(), content2.length())) * 100);
    }
}
