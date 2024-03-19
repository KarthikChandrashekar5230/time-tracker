package training.taylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.List;

/**
 * Created by Jason on 6/19/2015.
 */
@Component
public class Tracker {
    /** TimeEntries list. */
    @Autowired
    private List<TimeEntry> entries;

    /** @param entry object to be added to the list. */
    public final void add(final TimeEntry entry) {
        entries.add(entry);
    }

    /** @param entry object to be removed from the List. */
    public final void remove(final TimeEntry entry) {
        if (entries != null) {
            entries.remove(entry);
        }
    }

    /** @return - Number of TimeEntry Object in the list. */
    public final int size() {
        return entries.size();
    }

    /** @param  index ,specific TimeEntry Object's position from the list
     * @return - Retrieving specific TimeEntry Object from the list
     * */
    public final TimeEntry get(final int index) {
        try {
            if (index < 0) {
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            System.out.println("Execution interrupted with the exception "
                    + e.getMessage());
        }
        return entries.get(index);
    }
}

