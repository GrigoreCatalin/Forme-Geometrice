public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(String text, String material, int width, int height) {
        this(text, material);
        this.width = width;
        this.height = height;
    }

    public Rectangle(String text, String material) {
        super(text, material);
    }

    public void displayRectangleHeight() {
        System.out.println("Rectangle height is: " + this.height);
    }

    @Override
    public int getSize() {
        int area = this.width * this.height;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle: height is " + this.height + ",width is: " + this.width + ", made of steel, contains the text: \"Yellow rectangle\"." + super.toString();
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Rectangle rectangleObj = (Rectangle) obj;
        if (super.equals(rectangleObj) && (this.height == rectangleObj.height) && (this.width == rectangleObj.width)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + this.height;
        result = prime * result + this.width;
        return result;
    }
}