// Jessica Kamienski

public class DanceRoutine {
  private Boohbah[] boohbahs;
  
  public DanceRoutine(Boohbah[] boohbahs) {
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
}
