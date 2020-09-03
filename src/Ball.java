public class Ball {
    public String type;
    public int R;
    public String color;

    Ball(String type, String color, int R) {
        this.type = type;
        this.R = R;
        this.color = color;
    }
        @Override
        public String toString()
        {
            return this.type+", "+this.R+", "+this.color+". ";
        }

}

