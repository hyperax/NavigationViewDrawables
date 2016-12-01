package test.example.navigationviewdrawables;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;

import test.example.navigationviewdrawables.databinding.ActivityNavigationPaneLayoutBinding;

public class AdminActivity extends AppCompatActivity {

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityNavigationPaneLayoutBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_navigation_pane_layout);
        binding.navView.inflateMenu(R.menu.admin_operations);
    }
}