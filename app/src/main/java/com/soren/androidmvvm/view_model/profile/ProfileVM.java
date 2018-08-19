package com.soren.androidmvvm.view_model.profile;

import android.databinding.Bindable;
import android.databinding.ObservableField;

import com.soren.androidmvvm.model.User;
import com.soren.androidmvvm.view.profile.ProfileFragment;
import com.soren.mvvm_base.view_model.base.BaseFragmentViewModel;

import com.soren.androidmvvm.BR;



public class ProfileVM extends BaseFragmentViewModel<ProfileFragment> {

    private User user;

    public final ObservableField<String> userStatus = new ObservableField<>();

    public ProfileVM(ProfileFragment fragment, User user) {
        super(fragment);
        this.user = user;
    }

    @Bindable
    public User getUser() {
        return user;
    }

    public void updateStatus() {
        this.userStatus.set(this.user.isActivated()? "Activated user": "Unactivated user");
    }

    public void onActivationClicked() {
        this.user.setActivated(true);
        this.notifyPropertyChanged(BR.user);
        this.updateStatus();
    }
}
