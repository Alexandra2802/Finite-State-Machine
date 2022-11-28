public class Transition {
    String fromState;
    String toState;
    char element;

    public Transition(String fromState, String toState,char element) {
        this.fromState = fromState;
        this.toState = toState;
        this.element=element;
    }
}
