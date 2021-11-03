package org.premji.persist.dao;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import org.premji.persist.modele.PersistPersonne;

@Database(entities = {PersistPersonne.class},
        version = 1)
@TypeConverters({Converters.class})
public abstract class BD extends RoomDatabase
{
    public abstract PersistDAO dao();
}
