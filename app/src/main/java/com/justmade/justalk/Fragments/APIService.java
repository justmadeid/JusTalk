package com.justmade.justalk.Fragments;

import com.justmade.justalk.Notifications.MyResponse;
import com.justmade.justalk.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAASOcggZk:APA91bG9HiHOfQTjLiAJaEJIQixnXbTXYYCnTq3wI3TkWb2K7hRikQeFQP7RLguWl9mEcnYaPAeBdKUaqZN35q88ei384MFkA778ZBt5m-ZkLFLGfhGhjULffDkAz2ciG0an8y7g8IDn"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
