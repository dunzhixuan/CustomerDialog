package com.dunzhixuan.app.customerdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dunzhixuan.app.custmoerview.CustomerView;

public class MainActivity extends AppCompatActivity {

		@Override
		protected void onCreate(Bundle savedInstanceState) {
				super.onCreate(savedInstanceState);

				//测试推送
				showAlertDialog();
		}

		private void showAlertDialog() {
				//测试打包
				CustomerView.init(this);
		}
}
