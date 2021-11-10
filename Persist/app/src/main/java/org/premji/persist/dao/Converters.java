package org.premji.persist.dao;

import android.widget.Switch;

import androidx.room.TypeConverter;

import org.premji.persist.Sexe;
import org.premji.persist.modele.PersistPersonne;

import java.util.Date;

public class Converters
{
    @TypeConverter
    public Date fromTimestamp(Long value)
    {
        return value == null ? null : new Date(value);
    }

    @TypeConverter
    public Long dateToTimestamp(Date date) {
        if (date == null)
        {
            return null;
        }
        else
            {
            return date.getTime();
        }
    }

    @TypeConverter
    public Enum<Sexe> deStringAEnum(String value)
    {
        switch(value) {
            case "Homme":
                return Sexe.Homme;
            case "Femme":
                return Sexe.Femme;
            case "Complexe":
                return Sexe.Complexe;
            default:
                return null;
        }

    }

    @TypeConverter
    public String deEnumAString(Enum<Sexe> value)
    {
        switch(Enum.valueOf(Enum<Sexe>, value))
        {
            case 0:
                return "Homme";
            case 1:
                return "Femme";
            case 2:
                return "Complexe";
            default:
                return null;
        }

    }

}


