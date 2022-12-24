import java.util.ArrayList;

public class Register {
    private ArrayList<Integer> list;

    public Register() {
        this.list = new ArrayList<>();
    }

    public void addGrade(int grade) {
        this.list.add(grade);
    }

    public double calcAverage() {
        double total = 0;
        int count = 0;
        for (Integer i : list) {
            total += i;
            count++;
        }
        return total / count;
    }

    public double passingGrade() {
        double total = 0;
        int count = 0;
        for (Integer i : list) {
            if (i >= 50) {
                total += i;
                count++;
            }
        }
        return total / count;
    }

    public double passPercentage() {
        double countAbove50 = 0;
        int count = 0;
        for (Integer i : list) {
            count++;
            if (i >= 50) {
                countAbove50++;
            }
        }
        return countAbove50 / count * 100;
    }

    public int[] convertGradeScaleToPointScale() {
        int[] register = { 0, 0, 0, 0, 0, 0 };

        for (int grade : list) {
            if (grade < 50) {
                register[0]++;
            } else if (grade < 60) {
                register[1]++;
            } else if (grade < 70) {
                register[2]++;
            } else if (grade < 80) {
                register[3]++;
            } else if (grade < 90) {
                register[4]++;
            } else {
                register[5]++;
            }
        }
        return register;
    }

    public void printer(int[] points) {
        for (int i = (points.length - 1); i >= 0; i--) {
            String stars = "";
            int count = points[i];
            for (int j = count; j > 0; j--) {
                stars += "*";
            }
            System.out.println(i + ": " + stars);
        }
    }
}