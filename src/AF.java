import java.util.List;

public class AF {
    public List<State> states;
    public State currentState;
    public  List<Transition> transitions;

    public AF(List<State> states, State currentState, List<Transition> transitions) {
        this.states = states;
        this.currentState = currentState;
        this.transitions = transitions;
    }

    public void next(char input){
    }

    public boolean isAccepted(String sequence){
        return currentState.stateType == StateType.Final && sequence.length() == 0;
    }

}
