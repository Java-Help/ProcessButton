package ru.javahelp.processbutton;
import android.content.*;
import android.app.*;
import android.os.*;
import android.widget.*;
import com.dd.processbutton.iml.*;
import android.view.View.*;
import android.view.*;

public class SignIn extends Activity{
	
	Context context = this;
	ProgressGenerator progressGenerator;
	EditText editEmail, editPassword;
	ActionProcessButton btnSignIn;
	
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);
		
		progressGenerator = new ProgressGenerator();
		editEmail = (EditText) findViewById(R.id.editEmail);
        editPassword = (EditText) findViewById(R.id.editPassword);
        btnSignIn = (ActionProcessButton) findViewById(R.id.btnSignInAPB);
		
		btnSignIn.setMode(ActionProcessButton.Mode.PROGRESS);
		btnSignIn.setOnClickListener(onClick);
	}
	
	OnClickListener onClick = new OnClickListener(){

		@Override
		public void onClick(View v)
		{
			switch(v.getId())
			{
				case R.id.btnSignInAPB:
					btnSignIn.setEnabled(false);
					editEmail.setEnabled(false);
					editPassword.setEnabled(false);
					progressGenerator.start(btnSignIn);
				break;
			}
		}
	};
	
}
