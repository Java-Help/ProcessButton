package ru.javahelp.processbutton;

import android.content.*;
import android.app.*;
import android.os.*;
import com.dd.processbutton.iml.*;
import android.view.View.*;
import android.view.*;

public class Download extends Activity{

	Context context = this;
	ProgressGenerator progressGenerator;
	GenerateProcessButton btnUpload;
	
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.download);
		
		progressGenerator = new ProgressGenerator();
		btnUpload = (GenerateProcessButton) findViewById(R.id.btnUpload);
        btnUpload.setOnClickListener(onClick);
		
	}

	OnClickListener onClick = new OnClickListener(){

		@Override
		public void onClick(View v)
		{
			switch(v.getId())
			{
				case R.id.btnUpload:
					progressGenerator.start(btnUpload);
				break; 
			}
		}
	};
	
}
