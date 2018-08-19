package com.soren.androidmvvm.view.profile;

import com.soren.androidmvvm.BR;
import com.soren.androidmvvm.Demo;
import com.soren.androidmvvm.R;
import com.soren.androidmvvm.databinding.FragmentProfileBinding;
import com.soren.androidmvvm.model.User;
import com.soren.androidmvvm.view_model.profile.ProfileVM;
import com.soren.mvvm_base.view.base.BindingFragment;

public class ProfileFragment extends BindingFragment<ProfileVM, FragmentProfileBinding> {

    public static ProfileFragment getInstance() {
        return new ProfileFragment();
    }

    @Override
    protected ProfileVM onCreateViewModel(FragmentProfileBinding binding) {
        User me = Demo.getUsers().get(0);
        return new ProfileVM(this, me);
    }

    @Override
    public int getVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_profile;
    }

}
