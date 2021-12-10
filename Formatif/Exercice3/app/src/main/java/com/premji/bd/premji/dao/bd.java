package com.premji.bd.premji.dao;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.premji.bd.premji.modele.FinalPremji;

@Database(entities = {FinalPremji.class},
        version = 1)
public abstract class bd extends RoomDatabase {
    public abstract MonDao dao();
}
