package com.neyagodamalina.nibnim.request;

import com.neyagodamalina.nibnim.json.JSONResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * POST запрос к сервису Яндекс.Переводчик
 */

public interface Translate {
    @FormUrlEncoded
    @POST("api/v1.5/tr.json/translate")
    Call<JSONResponse> getData(@Field("key") String key, @Field("text") String text, @Field("lang") String lang);
}
