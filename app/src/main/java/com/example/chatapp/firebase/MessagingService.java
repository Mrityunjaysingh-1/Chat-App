package com.example.chatapp.firebase;


import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MessagingService extends FirebaseMessagingService {
    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
//        For Testing Only
//        Log.d("FCM", "Token: "+token);
    }

    @Override
    public void onMessageReceived(@NonNull RemoteMessage message) {
        super.onMessageReceived(message);
//        for testing only
//        Log.d("FCM", "Message: "+message.getNotification().getBody());
    }
}
