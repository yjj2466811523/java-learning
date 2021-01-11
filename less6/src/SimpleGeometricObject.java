public class SimpleGeometricObject {
    private String color ="white";
    private Boolean filled;
    private java.util.Date dateCreated;

    public SimpleGeometricObject(String coloer,boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public SimpleGeometricObject() {
        dateCreated = new java.util.Date();
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled ;
    }

    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    public String toString(){
        return "created on "+dateCreated + "\ncolor" + color +" and filled: " + filled;
    }
}
