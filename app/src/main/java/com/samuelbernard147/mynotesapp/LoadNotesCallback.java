package com.samuelbernard147.mynotesapp;

import android.database.Cursor;

interface LoadNotesCallback {
    void preExecute();

    void postExecute(Cursor notes);
}

