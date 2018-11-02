package com.albertobay.paymentapp.data.api.retrofit.deserializer;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by Alberto Bay on 01,November,2018
 */
public class InstallmentDeserializer<T> implements ListDeserializer<T> {

    @Override
    public List<T> deserialize(JsonElement je, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {
        JsonElement installmentJsonArray = je.getAsJsonObject();
        return new Gson().fromJson(installmentJsonArray, typeOfT);
    }
}