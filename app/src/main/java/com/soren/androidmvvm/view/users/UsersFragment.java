package com.soren.androidmvvm.view.users;

import com.soren.androidmvvm.R;
import com.soren.androidmvvm.BR;
import com.soren.androidmvvm.databinding.FragmentUsersBinding;
import com.soren.androidmvvm.view_model.users.UsersVM;
import com.soren.mvvm_base.view.base.BindingFragment;

public class UsersFragment extends BindingFragment<UsersVM, FragmentUsersBinding> {

    public static UsersFragment getInstance() {
        return new UsersFragment();
    }

    @Override
    protected UsersVM onCreateViewModel(FragmentUsersBinding binding) {
        return new UsersVM(this);
    }

    @Override
    public int getVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_users;
    }

}
