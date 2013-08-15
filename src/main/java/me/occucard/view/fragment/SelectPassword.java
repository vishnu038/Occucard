package me.occucard.view.fragment;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.google.android.gms.auth.GoogleAuthUtil;

import me.occucard.R;
import me.occucard.utils.auth.OAuthUtils;

/**
 * Created by Shane on 8/15/13.
 */
public class SelectPassword extends Fragment {

    EditText password;

    String email;

    public SelectPassword(String email){
        this.email = email;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.account_password, null);

        v.findViewById(R.id.choose_password).setOnClickListener(new SelectAccountListener());

        ActionBarActivity activity = (ActionBarActivity) getActivity();

        activity.getSupportActionBar().setIcon(R.drawable.logo);
        activity.getSupportActionBar().setDisplayShowTitleEnabled(false);

        return v;
    }

    private class AccountSelectionListener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        }
    }

    private class SelectAccountListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {

        }
    }

    private void goToPasswordScreen(String email){
        //getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new );
    }
}