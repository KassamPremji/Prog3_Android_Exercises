package com.premji.bd.premji.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.premji.bd.premji.modele.FinalPremji;

import java.util.List;

@Dao
public interface MonDao {

    @Insert
    Long creerFinal(FinalPremji finalPremji);

    @Query("SELECT * FROM FinalPremji")
    List<FinalPremji> tousLesFinals();

}