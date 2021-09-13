public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Problem");

        Line line1 = new Line(0,3,3,-2);
        Line line2 = new Line(3,-2,8,3);

        boolean equals = line1.equals(line2);
        int result = Double.compare(line1.length(),line2.length());
    }
}

