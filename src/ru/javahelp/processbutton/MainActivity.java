package ru.javahelp.processbutton;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.view.View.*;
import android.content.*;

public class MainActivity extends Activity{
	
	Button btnSignIn, btnEmail, btnDownload, btnStateDemonstration;
	Context context = this;
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		btnSignIn = (Button) findViewById(R.id.btnSignIn);
		btnEmail = (Button) findViewById(R.id.btnEmail);
		btnDownload = (Button) findViewById(R.id.btnDownload);
		btnStateDemonstration = (Button) findViewById(R.id.btnStateDemonstration);
		
		btnSignIn.setOnClickListener(onClick);
		btnEmail.setOnClickListener(onClick);
		btnDownload.setOnClickListener(onClick);
		btnStateDemonstration.setOnClickListener(onClick);
    }
	
	void openActivity(Class c){
			Intent intent = new Intent(context, c);
			startActivity(intent);
	}
	
	OnClickListener onClick = new OnClickListener(){

		@Override
		public void onClick(View v)
		{
			switch(v.getId())
			{
				case R.id.btnSignIn:
					openActivity(SignIn.class);
				break;
				
				case R.id.btnEmail:
					openActivity(Email.class);
				break;
				
				case R.id.btnDownload:
					openActivity(Download.class);
				break;
				
				case R.id.btnStateDemonstration:
					openActivity(StateDemonstration.class);
				break;
				
			}
		}

		
	};
}
