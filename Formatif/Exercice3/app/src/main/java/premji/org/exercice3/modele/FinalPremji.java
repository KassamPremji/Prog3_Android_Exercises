package premji.org.exercice3.modele;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class FinalPremji
{
    @PrimaryKey(autoGenerate = true)
    public Long id;

    @ColumnInfo
    public String nom;
}
