public class course {
    public String course[] = { "C#", "Applied statistics", "JAVA" };
    public int marks[] = { 70, 100, 30 };
    public void read() {
        for (int i = 0; i < 3; i++) {
            if (marks[i] < 40) {
                System.out.println("Marks less then 40:" + course[i]+ ":" + marks[i]);
            }
        }
    }

}
