package lesson5.task1;

import java.util.ArrayList;
import java.util.HashMap;

class StudentDirectory {
    private HashMap<String, ArrayList<Integer>> studentMap = new HashMap<>();

    void addStudent(String name, Integer grade) {
        if (name == null)
            return;
        if (studentMap.containsKey(name)) {
            studentMap.get(name).add(grade);
        } else {
            studentMap.put(name, new ArrayList<>() {
                {
                    add(grade);
                }
            });
        }
    }

    ArrayList<Integer> findStudent(String name) {
        return studentMap.getOrDefault(name, new ArrayList<>());
    }

    HashMap<String, ArrayList<Integer>> getAllStudents() {
        var result = new HashMap<String, ArrayList<Integer>>();
        for (var element : studentMap.entrySet()) {
            result.put(element.getKey(), element.getValue());
        }
        return result;
    }

    void removeStudent(String name) {
        if (name != null)
            studentMap.remove(name);
    }
}
