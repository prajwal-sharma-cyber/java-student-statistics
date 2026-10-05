public class StudentStatistics {

    public static double minimum(double[] marks) {
        double min = marks[0];
        for (double mark : marks) {
            if (mark < min) min = mark;
        }
        return min;
    }

    public static double maximum(double[] marks) {
        double max = marks[0];
        for (double mark : marks) {
            if (mark > max) max = mark;
        }
        return max;
    }

    public static double mean(double[] marks) {
        double total = 0;
        for (double mark : marks) total += mark;
        return total / marks.length;
    }

    public static double variance(double[] marks) {
        double average = mean(marks);
        double total = 0;
        for (double mark : marks) {
            double difference = mark - average;
            total += difference * difference;
        }
        return total / marks.length;
    }

    public static void main(String[] args) {
        double[] marks = {52, 68, 74, 81, 91, 62, 79};

        System.out.println("Student Statistics");
        System.out.println("------------------");
        System.out.println("Minimum: " + minimum(marks));
        System.out.println("Maximum: " + maximum(marks));
        System.out.println("Mean: " + mean(marks));
        System.out.println("Variance: " + variance(marks));
    }
}
