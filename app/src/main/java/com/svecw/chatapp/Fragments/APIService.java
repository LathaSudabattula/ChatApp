package com.svecw.chatapp.Fragments;

import com.svecw.chatapp.Notifications.MyResponse;
import com.svecw.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorizaztion:Key=AAAAwR0s1lQ:APA91bE1hkEGBL4dIeBDDZLvKGf5imIztI7bKT9g1fgF6Qlr2wGNJwhb6tuvE22KnYcyS9ydwAVLqYgLz84GzugdYBthsdjV7tUje8IKymPFlx-HUyaAE6PX9xtlWK4IIGM6D1EiRlHy"
            }

    )
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
