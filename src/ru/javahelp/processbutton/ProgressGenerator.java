package ru.javahelp.processbutton;
import android.os.*;
import com.dd.processbutton.ProcessButton;

public class ProgressGenerator extends AsyncTask<Void, Integer, Void>{

	ProcessButton pb;
	
	public void start(ProcessButton pb){
		this.pb = pb;
		execute();
	}
	
	@Override
	protected Void doInBackground(Void[] args){
		
		try
		{
			for (int i=0; i < 101; i = i+20)
			{
				publishProgress(i);
				Thread.sleep(500);
			}
		}catch (InterruptedException e){}

		return null;
	}

	@Override
	protected void onProgressUpdate(Integer[] values){
		
		if (pb != null){
			pb.setProgress(values[0]);
		}
	}
	
}
