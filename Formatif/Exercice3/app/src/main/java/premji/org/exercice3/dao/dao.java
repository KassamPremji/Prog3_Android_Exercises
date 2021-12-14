package premji.org.exercice3.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import premji.org.exercice3.modele.FinalPremji;

@Dao
public abstract class dao
{
    @Insert
    public abstract Long insertFinal(FinalPremji finalPremji);

    @Query("SELECT * FROM FinalPremji")
    public abstract List<FinalPremji> list();

}
