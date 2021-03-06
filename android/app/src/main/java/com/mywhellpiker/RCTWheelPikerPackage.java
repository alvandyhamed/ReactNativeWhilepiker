package com.mywhellpiker;

import androidx.annotation.NonNull;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RCTWheelPikerPackage implements ReactPackage {
    @NonNull
    @Override
    public List<NativeModule> createNativeModules(@NonNull ReactApplicationContext reactContext) {

        return Collections.emptyList();
    }
    public List<Class<? extends JavaScriptModule>> createJSModuales(){
        return Collections.emptyList();
    }

    @NonNull
    @Override
    public List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactContext) {
        return Arrays.<ViewManager> asList(
                new RCTWhellPikerManager()
        );
    }
}
