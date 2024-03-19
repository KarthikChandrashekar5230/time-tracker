package training.taylor.timetracker.core.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Jason on 6/19/2015.
 */
@Component
@Scope("prototype")
public class TimeEntry {
    /** TimeEntry Object's description. */
    private String description;
    /** TimeEntry Object's rate. */
    private float rate;

    /** TimeEntry Object's time. */
    private int time;

    /** @return - Getter to retrieve the description. */
    public final String getDescription() {
        return description;
    }

    /** @param value of type string to be set as description. */
    public final void setDescription(final String value) {
        this.description = value;
    }

    /** @return - Getter to retrieve the rate. */
    public final float getRate() {
        return rate;
    }

    /** @param value of type float to be set as Rate. */
    public final void setRate(final float value) {
        this.rate = value;
    }

    /** @return - Getter to retrieve the time. */
    public final int getTime() {
        return time;
    }
    /** @param value of type integer to be set as Time. */
    public final void setTime(final int value) {
        this.time = value;
    }

    /** Method to represent the object into a string format. */
    @Override
    public final String toString() {
        return "TimeEntry{" + "description='" + description + '\''
                + ", rate=" + rate + ", time=" + time + '}';
    }
}
