package Task19;

public class ClassA {
    String name = "Ronke";


    //FINAL: Create 3 variables of class A - ballSize, ballColour, ballTexture.
    // Make it impossible to change the value of ballSize in any method in that class

    public static String sharedVariable = "Shared Value";
        final String ballSize;
        String ballColour;
        String ballTexture;


        public ClassA(String ballSize, String ballColour, String ballTexture) {
            this.ballSize = ballSize;
            this.ballColour = ballColour;
            this.ballTexture = ballTexture;
        }

}
