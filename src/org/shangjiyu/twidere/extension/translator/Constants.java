/*******************************************************
 * @Title: Constants.java
 * @Package org.shangjiyu.twidere.extension.translaetor
 * @Description: TODO(用一句话描述该文件做什么)
 * @author shangjiyu
 * @date 2013-10-11 下午3:45:39
 * @version V1.0
 ********************************************************/

package org.shangjiyu.twidere.extension.translator;
/********************************************************
 * @ClassName: Constants
 * @Description: TODO(预定义的一些常量)
 * @author shangjiyu
 * @date 2013-10-11 下午3:45:39
 */

public interface Constants {
	
	public static final String LOGCAT = "twidere.extension.translator";
	
	public static final String BAIDU_CLIENT_ID = "0QLIOD1cdfmA1hH1D7wN1nHy";
	public static final String BDTRANSLATEURL_STRING = "http://openapi.baidu.com/public/2.0/bmt/translate";
	
	public static final String MICROSOFT_CLIENT_ID = "firefox_inline_translate";
	public static final String MICROSOFT_CLIEN_SECRET = "l/t7OPv/O+Ye68qESMF2RwN7pV+jajAxrW8YDrMbmoo=";
	public static final String SCOPE_STRING = "http://api.microsofttranslator.com";
	public static final String GRANT_TYPE_STRING = "client_credentials";
	public static final String DATAMARKETACCESSURL_STRING = "https://datamarket.accesscontrol.windows.net/v2/OAuth2-13";
	public static final String MSTRANSLATEURL_STRING = "http://api.microsofttranslator.com/V2/Http.svc/Translate";
	
	public static final String GOOGLETRANSLATEONBAE_STRING = "http://mytranslategoogle.duapp.com";
	
	public static final String NONEED2TRANSLAETPORTION = "((RT\\s?)?(@([a-zA-Z0-9_\\u4e00-\\u9fa5]{1,20})):?)|((https?://)([-\\w\\.]+)+(:\\d+)?(/([\\w/_\\-\\.]*(\\?\\S+)?)?)?)|(\\#[a-zA-Z0-9_%\\u4e00-\\u9fa5]*)";
	
}

