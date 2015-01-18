package ru.javahelp.processbutton;

import android.content.*;
import android.app.*;
import android.os.*;
import android.view.View.*;
import android.view.*;
import com.dd.processbutton.iml.*;

public class StateDemonstration extends Activity{

	Context context = this;
	ActionProcessButton mBtnAction, mBtnActionProgress;
    GenerateProcessButton mBtnGenerate;
    SubmitProcessButton mBtnSubmit;
	
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.state_demonstration);

		mBtnAction = (ActionProcessButton) findViewById(R.id.btnAction);
		mBtnActionProgress = (ActionProcessButton) findViewById(R.id.btnSignIn);
        mBtnSubmit = (SubmitProcessButton) findViewById(R.id.btnSubmit);
        mBtnGenerate = (GenerateProcessButton) findViewById(R.id.btnGenerate);
		
		mBtnActionProgress.setMode(ActionProcessButton.Mode.PROGRESS);
		
		findViewById(R.id.btnProgressLoading).setOnClickListener(onClick);
        findViewById(R.id.btnProgressError).setOnClickListener(onClick);
        findViewById(R.id.btnProgressComplete).setOnClickListener(onClick);
        findViewById(R.id.btnProgressNormal).setOnClickListener(onClick);
		
	}

	OnClickListener onClick = new OnClickListener(){

		@Override
		public void onClick(View v)
		{
			switch(v.getId())
			{
				case R.id.btnProgressLoading:
					mBtnAction.setProgress(50);
					mBtnSubmit.setProgress(50);
					mBtnGenerate.setProgress(50);
					mBtnActionProgress.setProgress(50);
					break;
				case R.id.btnProgressError:
					mBtnActionProgress.setProgress(-1);;
					mBtnAction.setProgress(-1);
					mBtnSubmit.setProgress(-1);
					mBtnGenerate.setProgress(-1);
					break;
				case R.id.btnProgressComplete:
					mBtnAction.setProgress(100);
					mBtnSubmit.setProgress(100);
					mBtnGenerate.setProgress(100);
					mBtnActionProgress.setProgress(100);
					break;
				case R.id.btnProgressNormal:
					mBtnAction.setProgress(0);
					mBtnSubmit.setProgress(0);
					mBtnGenerate.setProgress(0);
					mBtnActionProgress.setProgress(0);
					break;
			}
		}
	};
	
}
