// Jessica Kamienski

public class Boohbah {
    private String name;
    private String danceMove;
    
    public Boohbah(String name, String danceMove) {
         this.name = name;
         this.danceMove = danceMove;
    }
    public String getName() {
        return name;
    }
    public String getDanceMove() {
        return danceMove;
    }
    
    public String performMove() {
        return name + " performs " + danceMove;
        
    }

// tests the code
    public static void main(String[] args) {
        Boohbah b = new Boohbah("Zing Zing Zingbah", "Spin and Sparkle");
        System.out.println(b.performMove());
}
  //
}
