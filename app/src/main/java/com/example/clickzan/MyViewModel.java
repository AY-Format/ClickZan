package com.example.clickzan;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    private MutableLiveData<Integer> mutableLiveData;

    public MutableLiveData<Integer> getMutableLiveData() {
        if (mutableLiveData==null) {
            mutableLiveData = new MutableLiveData<>();
            mutableLiveData.setValue(0);
        }
        return mutableLiveData;
    }

    public void addCount(){
        mutableLiveData.setValue(mutableLiveData.getValue()+1);
    }
}
