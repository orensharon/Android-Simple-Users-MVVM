package com.soren.androidmvvm.view.base;

import android.content.Intent;
import android.os.Bundle;

public interface FragmentLifeCycle {
    void onViewCreated();
    void onStart();
    void onStop();
    void onDestroy();
    void onPause();
    void onResume();
    void onDestroyView();
    void onActivityResult(int requestCode, int resultCode, Intent data);
    void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults);
    void onSaveInstanceState(Bundle outState);
    void onViewStateRestored(Bundle savedInstanceState);
}
