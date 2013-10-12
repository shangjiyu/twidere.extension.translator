/*******************************************************
 * @Title: TranslateActivity.java
 * @Package org.shangjiyu.twidere.extension.translaetor
 * @Description: TODO(用一句话描述该文件做什么)
 * @author shangjiyu
 * @date 2013-10-11 下午10:01:38
 * @version V1.0
 ********************************************************/

package org.shangjiyu.twidere.extension.translaetor;

import org.mariotaku.twidere.Twidere;
import org.mariotaku.twidere.model.ParcelableStatus;
import org.shangjiyu.twidere.extension.translator.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

/********************************************************
 * @ClassName: TranslateActivity
 * @Description: TODO(显示的唯一一个activity)
 * @author shangjiyu
 * @date 2013-10-11 下午10:01:38
 */

public class TranslateActivity extends Activity implements Constants,org.mariotaku.twidere.Constants,OnClickListener {	

	private TextView mPreview;
	private ImageButton mActionButton;
	private ProgressBar mProgress;
	private String mResult, mUser;
	private ParcelableStatus mStatus;
	private TranslateTask translateTask;
	private boolean isTranslated = false;
	private boolean isOrignal = true;
	private String ORIGINAL_STRING = "";
	private String TRANSLATED_STRING = "";
	
	/********************************************************
	 *Title: onCreate
	 *Description: 
	 * @param savedInstanceState
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 *********************************************************/
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		final Intent intent = getIntent();
		final Uri data = intent.getData();
		final String action = intent.getAction(); 
		mPreview = (TextView) findViewById(R.id.text);
		mActionButton = (ImageButton) findViewById(R.id.action);
		mProgress = (ProgressBar) findViewById(R.id.progress);
		mResult = savedInstanceState != null ? savedInstanceState.getString(Twidere.INTENT_KEY_TEXT) : null;
		mUser = savedInstanceState != null ? savedInstanceState.getString(Twidere.INTENT_KEY_USER) : null;
		setContentView(R.layout.main);
		
	}

	/********************************************************
	 *Title: onClick
	 *Description: 
	 * @param v
	 * @see android.view.View.OnClickListener#onClick(android.view.View)
	 *********************************************************/
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.action:
			
			break;
		}
	}
	
	public final class TranslateTask extends AsyncTask<Void, Void, Object> {

		private final String tweetContent;
		
		public TranslateTask(String tweetContent){
			this.tweetContent = tweetContent;
		}
		
		/********************************************************
		 *Title: doInBackground
		 *Description: 
		 * @param params
		 * @return
		 * @see android.os.AsyncTask#doInBackground(Params[])
		 *********************************************************/
		
		@Override
		protected Object doInBackground(Void... params) {
			// TODO Auto-generated method stub
			
			return null;
		}
		
		
	}
}

