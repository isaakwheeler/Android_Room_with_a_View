package com.zybooks.androidroomwithaview_java;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")
public class Word {


    @NonNull
    @ColumnInfo(name = "word")
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String mWord;

    public Word(@NonNull String word) {this.mWord = word; this.id = id;}

    public String getWord(){return this.mWord;}
    public int getId(){return this.id;}
    public void setId(int id){this.id = id;}
}
