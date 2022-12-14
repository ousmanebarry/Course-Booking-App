package com.example.coursebookingapp.database;

import com.google.firebase.auth.FirebaseAuth;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;

public class Auth {
    private final FirebaseAuth auth;

    public Auth() {
        auth = FirebaseAuth.getInstance();
    }

    public Task<AuthResult> signIn(String email, String password) {
        return auth.signInWithEmailAndPassword(email, password);
    }

    public Task<AuthResult> signUp(String email, String password) {
        return auth.createUserWithEmailAndPassword(email, password);
    }

    public void signOut() { auth.signOut(); }

    public FirebaseAuth getInstance() { return this.auth; }

    public FirebaseUser getCurrentUser() { return auth.getCurrentUser(); }

    public boolean isSignedIn() { return auth.getCurrentUser() != null; }
}
