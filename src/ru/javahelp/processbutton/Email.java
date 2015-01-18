package ru.javahelp.processbutton;

import android.content.*;
import android.app.*;
import android.os.*;
import android.view.View.*;
import android.view.*;
import com.dd.processbutton.iml.*;
import android.widget.*;

public class Email extends Activity{

	Context context = this;
	ProgressGenerator progressGenerator;
	SubmitProcessButton btnSend;
	EditText editMessage;
	
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email);

		progressGenerator = new ProgressGenerator();
		editMessage = (EditText) findViewById(R.id.editMessage);
        btnSend = (SubmitProcessButton) findViewById(R.id.btnSend);
        btnSend.setOnClickListener(onClick);
	}
	
	OnClickListener onClick = new OnClickListener(){

		@Override
		public void onClick(View v)
		{
			switch(v.getId())
			{
				case R.id.btnSend:
					progressGenerator.start(btnSend);
				break; 
			}
		}
	};

}
