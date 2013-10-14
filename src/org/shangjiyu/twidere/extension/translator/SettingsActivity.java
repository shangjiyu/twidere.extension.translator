/*******************************************************
 * @Title: SettingsActivity.java
 * @Package org.shangjiyu.twidere.extension.translaetor
 * @Description: TODO(显示设置页面)
 * @author shangjiyu
 * @date 2013-10-10 下午1:55:28
 * @version V1.0
 ********************************************************/

package org.shangjiyu.twidere.extension.translator;

import org.shangjiyu.twidere.extension.translator.R;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceManager;
import android.preference.PreferenceActivity;
import android.widget.Toast;

/********************************************************
 * @ClassName: SettingsActivity
 * @Description: TODO(设置页面)
 * @author shangjiyu
 * @date 2013-10-10 下午1:55:28
 */

public class SettingsActivity extends PreferenceActivity implements
		OnPreferenceChangeListener {

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		PreferenceManager.setDefaultValues(this, R.xml.settings, false);
		addPreferencesFromResource(R.xml.settings);
		findPreference(getString(R.string.baidu_client_id)).setOnPreferenceChangeListener(this);
		findPreference(getString(R.string.Bing_client_secret)).setOnPreferenceChangeListener(this);
	}

	/********************************************************
	 *Title: onPreferenceChange
	 *Description: 
	 * @param preference
	 * @param newValue
	 * @return
	 * @see android.preference.Preference.OnPreferenceChangeListener#onPreferenceChange(android.preference.Preference, java.lang.Object)
	 *********************************************************/
	
	@Override
	public boolean onPreferenceChange(Preference preference, Object newValue) {
		// TODO Auto-generated method stub
		if (preference.getKey().equals(getString(R.string.baidu_client_id))) {
			if (newValue != null && newValue.toString().length() == 24) {
				BDTranslate.BDTRANSLATEKEY_STRING = (String) newValue;
				return true;
			}else {
				Toast.makeText(SettingsActivity.this, "incorrect baidu app key!please reinpiut", Toast.LENGTH_SHORT).show();
			}
		}else if (preference.getKey().equals(getString(R.string.Bing_client_secret))) {
			if (newValue != null && newValue.toString().length() == 44) {
				MSTranslate.CLIEND_SECRET_STRING = (String) newValue;
				return true;
			}else {
				Toast.makeText(SettingsActivity.this, "incorrect Bing API Secret!please reinpiut", Toast.LENGTH_SHORT).show();
			}
		}
		return false;
	}
	
	
	/********************************************************
	 *Title: onSharedPreferenceChanged
	 *Description: 
	 * @param sharedPreferences
	 * @param key
	 * @see android.content.SharedPreferences.OnSharedPreferenceChangeListener#onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String)
	 *********************************************************/
	
//	@Override
//	public void onSharedPreferenceChanged(SharedPreferences sharedPreferences,
//			String key) {
//		// TODO Auto-generated method stub
//		if (sharedPreferences.getBoolean(getString(R.string.baidu_translate_api_checkbox), false)) {
//			String baiduAPIKey = sharedPreferences.getString(getString(R.string.baidu_client_id_value), null);
//			if ( baiduAPIKey != null && baiduAPIKey.length() == 24) {
//				BDTranslate.BDTRANSLATEKEY_STRING = baiduAPIKey;
//			}else {
//				Toast.makeText(SettingsActivity.this, "incorrect baidu app key!please reinpiut", Toast.LENGTH_SHORT).show();
//			}
//		}else if (sharedPreferences.getBoolean(getString(R.string.microsoft_translate_api_checkbox), false)) {
//			String bingAPIkey = sharedPreferences.getString(getString(R.string.Bing_client_secret_value), null);
//			if (bingAPIkey != null && bingAPIkey.length() == 44) {
//				MSTranslate.CLIEND_SECRET_STRING = bingAPIkey;
//			}else {
//				Toast.makeText(SettingsActivity.this, "incorrect Bing API Secret!please reinpiut", Toast.LENGTH_SHORT).show();
//			}
//		}
//	}
	
}

