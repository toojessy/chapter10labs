//Jessica Kamienski

public class DanceRoutine {
        private Boohbah[] boohbahs;

        public DanceRoutine(Boohbah[] boohbahs) {
            this.boohbahs = boohbahs;
        }

        public Boohbah[] getBoohbahs(){return boohbahs;}

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
  
// NEW CODE HERE ⬇
  
        public String remixRoutine() {
            StringBuilder base = new StringBuilder();
            base.insert(0,  "--- REMIX ---\n");
            base.delete(base.length()- 1, base.length());
            base.append("\n(Backwards Boohbah Shuffle!)");
            base.reverse();
            return base.toString();
        }

        // DANCE TEST PRINT STATEMENTS
        System.out.println("Remixed Routine:");
        System.out.println(routine.remixRoutine());
}
