package premji.org.exercice3.dao;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import premji.org.exercice3.modele.FinalPremji;

@Database(entities = {FinalPremji.class},
        version = 1)
public abstract class bd extends RoomDatabase
{
    public abstract dao dao();
}
