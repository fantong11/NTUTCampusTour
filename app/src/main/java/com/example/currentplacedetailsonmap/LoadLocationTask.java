package com.example.currentplacedetailsonmap;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.widget.Toast;

public class LoadLocationTask extends AsyncTask<Void, Void, Boolean> {
    private Activity activity;
    private Intent intent;
    private ProgressDialog progressDialog;

    public LoadLocationTask(Activity activity, Intent intent) {
        this.activity = activity;
        this.intent = intent;
    }

    @Override
    protected void onPreExecute() {
        progressDialog = new ProgressDialog(activity);
        progressDialog.setMessage("Please Wait...");
        progressDialog.setCancelable(false);
        progressDialog.show();
        super.onPreExecute();
    }

    protected Boolean doInBackground(Void... voids) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        return true;
    }

    @Override
    protected void onPostExecute(Boolean result) {
        if (progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        activity.startActivity(intent);
    }
}
