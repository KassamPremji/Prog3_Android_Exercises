package org.premji.persist.dao;

import androidx.room.TypeConverter;

import org.premji.persist.modele.PersistPersonne;

import java.util.Date;

public class Converters
{
    @TypeConverter
    public Date fromTimestamp(Long value) {
        return value == null ? null : new Date(value);
    }

    @TypeConverter
    public Long dateToTimestamp(Date date) {
        if (date == null) {
            return null;
        } else {
            return date.getTime();
        }
    }

    @TypeConverter
    public String fromEnum(Enum value)
    {
        return value == null ? null : String.valueOf(value);
    }

    @TypeConverter
    public Long stringToEnum(String value)
    {
        if (value == null) {
            return null;
        } else {
            return Enum.valueOf(value);
        }
    }
}
