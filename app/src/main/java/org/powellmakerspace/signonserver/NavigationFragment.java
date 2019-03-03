package org.powellmakerspace.signonserver;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class NavigationFragment extends Fragment {

    private static final String TAG = "NavigationFragment";

    private Button btnWelcome;
    private Button btnArriving;
    private Button btnVisitor;
    private Button btnGroup;
    private Button btnPurpose;
    private Button btnDepature;
    private Button btnLoginForgot;
    private Button btnLogoutForgot;

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.navigation_fragment, container, false);

        btnWelcome = (Button) view.findViewById(R.id.btnWelcome);
        btnArriving = (Button) view.findViewById(R.id.btnArrival);
        btnVisitor = (Button) view.findViewById(R.id.btnVisitor);
        btnGroup = (Button) view.findViewById(R.id.btnGroup);
        btnPurpose = (Button) view.findViewById(R.id.btnPurpose);
        btnDepature = (Button) view.findViewById(R.id.btnDeparting);
        btnLoginForgot = (Button) view.findViewById(R.id.btnLoginForgot);
        btnLogoutForgot = (Button) view.findViewById(R.id.btnLogoutForgot);

        Log.d(TAG,"onCreateView: started.");

        return view;
    }

}
