package com.zybooks.androidroomwithaview_java;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;
@androidx.room.Dao
public interface WordDao {

    // allowing the insert of the same word multiple times by passing a
    // conflict resolution strategy
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    default void insert(Word word) {

    }

    @Query("DELETE FROM word_table")
    default void deleteAll() {

    }



    @Query("SELECT * FROM word_table ORDER BY word ASC")
    default LiveData<List<Word>> getAlphabetizedWords() {
        return null;
    }
}
