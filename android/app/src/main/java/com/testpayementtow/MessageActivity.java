package com.testpayementtow;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class MessageActivity extends ReactContextBaseJavaModule {

    public MessageActivity(@Nullable ReactApplicationContext reactContext){
        super(reactContext);
    }

    @NonNull
    @Override
    public String getName() {
        return "MyMessage";
    }

    @ReactMethod
    public void sayHello(String name, Callback callback){
        try{
            String message="Hello"+name;
            callback.invoke(null,message);
        }catch (Exception e){
            callback.invoke(e,null);
        }
    }

}
