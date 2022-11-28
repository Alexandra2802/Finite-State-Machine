import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ConfigParser {
    List<String> alphabet=new ArrayList<>();
    List<State> states=new ArrayList<>();
    List<Transition> transitions=new ArrayList<>();

    public void parse(String filename){
        Object obj = null;
        try {
            obj = new JSONParser().parse(new FileReader(filename));
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        JSONObject jo = (JSONObject) obj;

        JSONArray jsonAlphabet = (JSONArray) jo.get("alphabet");
//        List<String> alphabet = new ArrayList<>();
        Iterator alphabetItr = jsonAlphabet.iterator();
        while (alphabetItr.hasNext())
        {
            alphabet.add(alphabetItr.next().toString());
        }
//        System.out.println(alphabet);

        JSONArray jsonStates = (JSONArray) jo.get("states");
//        List<State> states=new ArrayList<>();
        Iterator statesItr = jsonStates.iterator();
        while (statesItr.hasNext())
        {
            JSONObject jsonObject=(JSONObject)statesItr.next();
            String stateTypeString= (String) jsonObject.get("stateType");
            StateType stateType=StateType.valueOf(stateTypeString);
            String stateName= (String) jsonObject.get("stateName");
            State s=new State(stateType,stateName);
            states.add(s);
        }
//        states.forEach(s-> System.out.println(s.stateType+" "+s.name));


        JSONArray jsonTransitions = (JSONArray) jo.get("transitions");
//        List<Transition> transitions=new ArrayList<>();
        Iterator transitionsItr = jsonTransitions.iterator();
        while (transitionsItr.hasNext())
        {
            JSONObject jsonObject=(JSONObject)transitionsItr.next();
            String fromState= (String) jsonObject.get("fromState");
            String toState= (String) jsonObject.get("toState");
            String name= (String) jsonObject.get("name");
            Transition t=new Transition(fromState,toState,name.charAt(0));
            transitions.add(t);
        }
//        System.out.println(transitions);
    }

}
