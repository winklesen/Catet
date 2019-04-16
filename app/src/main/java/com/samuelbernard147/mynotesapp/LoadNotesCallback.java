package com.samuelbernard147.mynotesapp;

import com.samuelbernard147.mynotesapp.entity.Note;

import java.util.ArrayList;


public interface LoadNotesCallback {
    void preExecute();

    void postExecute(ArrayList<Note> notes);
}

