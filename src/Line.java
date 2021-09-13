public class Line {

        public int x1,x2,y1,y2;

        public Line(int x1, int x2, int y1, int y2) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }

        public double length(){
            return Math.sqrt((this.x2-this.x1)^2 + (this.y2-this.y1)^2);

        }
}