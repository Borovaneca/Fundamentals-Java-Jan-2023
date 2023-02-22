package Fundamentals.OOP.Exercise.MoreExercise.TeamworkProject;

import java.util.ArrayList;
import java.util.List;

public class Team {
    String name;
    String creator;
    List<String> members;

    public Team() {
        setMembers(new ArrayList<>());
    }

    public List<String> getMembers() {
        return members;
    }

    public String getName() {
        return name;
    }

    public String getCreator() {
        return creator;
    }

    public void setName(String value) {
        name = value;
    }

    public void setCreator(String value) {
        creator = value;
    }

    public void setMembers(List<String> value) {
        members = value;
    }

    public int numberOfMembers() {
        return members.size();
    }
}
