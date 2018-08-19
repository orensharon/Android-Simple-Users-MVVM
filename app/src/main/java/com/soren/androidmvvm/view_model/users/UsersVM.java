package com.soren.androidmvvm.view_model.users;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.Toast;

import com.soren.androidmvvm.Demo;
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
        this.users = Demo.getUsers();

        RecyclerBindingAdapter<User> adapter = getAdapter();
        this.usersRecycleViewConfiguration.setAdapter(adapter);
    }

    @NonNull
    private RecyclerBindingAdapter<User> getAdapter() {
        RecyclerBindingAdapter<User> adapter = new RecyclerBindingAdapter<>(LAYOUT_HOLDER, BR.model, this.users);
        adapter.setOnItemClickListener((position, item) -> {
            Toast.makeText(this.getActivity(), this.users.get(position).getName() + " Clicked", Toast.LENGTH_LONG).show();
        });
        return adapter;
    }
}
