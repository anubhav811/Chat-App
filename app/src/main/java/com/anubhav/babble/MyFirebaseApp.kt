package com.anubhav.babble

import android.app.Application
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MyFirebaseApp : Application() {
    override fun onCreate() {
        super.onCreate();
        Firebase.database.setPersistenceEnabled(true)
        val chatsRef = Firebase.database.reference.child("chats")
        chatsRef.keepSynced(true)

    }
}
