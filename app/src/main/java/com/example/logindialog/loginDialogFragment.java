package com.example.logindialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.fragment.app.DialogFragment;

public class loginDialogFragment extends DialogFragment {
    EditText editTextUsername, editTextPassword;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());//based on user interaction due to getActivity
        LayoutInflater inflator = getActivity().getLayoutInflater();
        View DialogView = inflator.inflate(R.layout.layout_login, null);
        builder.setView(DialogView);
        builder.setTitle("Login");
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        editTextUsername = DialogView.findViewById(R.id.editTextUsername);
        editTextPassword = DialogView.findViewById(R.id.editTextPassword);

        return builder.create();
    }
}
