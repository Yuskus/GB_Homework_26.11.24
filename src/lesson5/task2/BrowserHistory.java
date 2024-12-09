package lesson5.task2;

import java.util.Deque;
import java.util.LinkedList;

class BrowserHistory {
    private Deque<String> history = new LinkedList<>();

    public void visitSite(String site) {
        if (site == null) return;
        history.addFirst(site);
    }

    public String back(int steps) {
        if (steps > history.size() || steps < 0) return null;
        for (String element : history) {
            if (steps-- == 0) return element;
        }
        return null;
    }

    public Deque<String> getHistory() {
        Deque<String> result = new LinkedList<>();
        for (var element : history) {
            result.add(element);
        }
        return result;
    }
}
