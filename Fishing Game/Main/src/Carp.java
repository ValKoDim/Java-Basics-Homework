public class Carp extends Fish{

    private String colour;

    public Carp(String colour, String weight) {
        this.colour = colour;
        setWeight(weight);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString(){

        return String.format("Sheatfish %n " +
                "Weight: %s %n" +
                "Whiskers size: %s ", getWeight(),getColour());
    }
}
