package com.dunzhixuan.app.customerdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dunzhixuan.app.custmoerview.CustomerView;

public class MainActivity extends AppCompatActivity {

		@Override
		protected void onCreate(Bundle savedInstanceState) {
				super.onCreate(savedInstanceState);

				showAlertDialog();
		}

		private void showAlertDialog() {
				CustomerView.init(this);
		}
}
