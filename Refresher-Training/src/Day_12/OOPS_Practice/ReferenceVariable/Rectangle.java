package Day_12.OOPS_Practice.ReferenceVariable;

class Rectangle {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void scale(int factor) {
        length = length * factor;
        width = width * factor;
    }
}
