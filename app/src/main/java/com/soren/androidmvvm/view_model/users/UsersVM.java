package com.soren.androidmvvm.view_model.users;

import android.support.v7.widget.LinearLayoutManager;

import com.soren.androidmvvm.R;
import com.soren.androidmvvm.BR;
import com.soren.androidmvvm.model.User;
import com.soren.androidmvvm.view.users.UsersFragment;
import com.soren.mvvm_base.binding.fields.RecyclerConfiguration;
import com.soren.mvvm_base.view.adapter.RecyclerBindingAdapter;
import com.soren.mvvm_base.view_model.base.BaseFragmentViewModel;

import java.util.ArrayList;


public class UsersVM extends BaseFragmentViewModel<UsersFragment> {

    private static final int LAYOUT_HOLDER = R.layout.list_item_user;

    public final RecyclerConfiguration usersRecycleViewConfiguration;

    private ArrayList<User> users;

    public UsersVM(UsersFragment fragment) {
        super(fragment);
        this.users = new ArrayList<>();
        this.usersRecycleViewConfiguration = new RecyclerConfiguration();
        this.usersRecycleViewConfiguration.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        this.usersRecycleViewConfiguration.setAdapter(new RecyclerBindingAdapter<>(LAYOUT_HOLDER, BR.model, this.users));
    }

    @Override
    public void onResume() {
        super.onResume();
        this.users.add(new User(1, "David", ""));
        this.users.add(new User(2, "John", ""));
        this.users.add(new User(3, "Peter", ""));
        this.usersRecycleViewConfiguration.getAdapter().notifyDataSetChanged();
    }
}
