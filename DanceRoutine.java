// Jessica Kamienski

public class DanceRoutine {
  private Boohbah[] boohbahs;
  
  public DanceRoutine(Boohbah[] boohbas) {
      this.boohbahs = boohbahs;
  }
  
  public String buildRoutine() {
      StringBuilder routineString = new StringBuilder();
      for (Boohbah b : boohbahs) {
    routineString.append(b.performMove()).append("\n");
      }
      return routineString.toString();
}

public String modifyRoutine() {
    StringBuilder modified = new StringBuilder(buildRoutine());
    String result = modified.toString().replace("performs", "dances to");
    return result;
}

// test code
public static void main(String[] args) {
        Boohbah b1 = new Boohbah("Zing Zing Zingbah", "Spin and Sparkle");
        Boohbah b2 = new Boohbah("JingBah", "Bouncing Poof");
        Boohbah b3 = new Boohbah("JumBah", "Whirly Weaving");

        Boohbah[] myBoohbahs = {b1, b2, b3};
        DanceRoutine routine = new DanceRoutine(myBoohbahs);

        System.out.println("Original Routine:");
        System.out.println(routine.buildRoutine());

        System.out.println("Modified Routine:");
        System.out.println(routine.modifyRoutine());
    }
//
}
