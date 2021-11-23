package org.sabourin.modele;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Personne
{
    @PrimaryKey(autoGenerate = true)
    public Long idPersonne;

    @ColumnInfo
    public String nomPersonne;

    @ColumnInfo
    public int agePersonne;

    @ColumnInfo
    public String adressePersonne;
}
