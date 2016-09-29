package com.CianDuffy.CT417;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Created by cianduffy on 29/09/2016.
 * Singleton Object that handles commonly used utility methods
 */
public class ActionManager
{
    private static ActionManager instance = null;
    private DateTimeFormatter dateTimeFormatter;

    private ActionManager()
    {
        this.dateTimeFormatter = DateTimeFormat.forPattern("dd/MM/yyyy");
    }

    public static ActionManager getInstance()
    {
        if (instance == null)
        {
            instance = new ActionManager();
        }
        return instance;
    }

    public String stringFromDateTime(DateTime dateTime)
    {
        String dateTimeString = this.dateTimeFormatter.print(dateTime);

        return dateTimeString;
    }

    public DateTime dateTimeFromString(String dateTimeString)
    {
        DateTime dateTime =  new DateTime(this.dateTimeFormatter.parseDateTime(dateTimeString));

        return dateTime;
    }
}
