twidere.extension.translator
============================

this is a translate extension for twidere

Baidu translate API setting
-----------------------------------------
### How to get Baidu Translate API Key
[如何获取Baidu API Key](http://developer.baidu.com/wiki/index.php?title=%E5%B8%AE%E5%8A%A9%E6%96%87%E6%A1%A3%E9%A6%96%E9%A1%B5/%E7%BD%91%E7%AB%99%E6%8E%A5%E5%85%A5/%E5%85%A5%E9%97%A8%E6%8C%87%E5%8D%97)<br />

### Supported languages and translate rules
	1. 源语言被识别为中文，则翻译方向为“中 -> 英”；
    2. 源语言被识别为英文，则翻译方向为“英 -> 中”；
    3. 源语言被识别为日文，则翻译方向为“日 -> 中”。
    4. 其实Baidu的API还支持中英、中日、英日、中泰、英泰、中法、中西、中阿、英阿、中韩等互译
   	5. 每个Key 默认翻译API使用频率为每个IP 1000次/小时，支持扩容(要申请)
    
Bing Translate API setting
------------------------------------------
### How to get Bing Translate API Key
[如何获取Bing Translate API Key](http://blogs.msdn.com/b/translation/p/gettingstarted1.aspx)<br/>

### Supported languages and translate rules
	1. 源语言被识别为中文，则翻译方向为“中 -> 英”；
    2. 源语言被识别为其他，则翻译方向为“其他 -> 中”。
    3. 其他语言(毛估估几十种，地址在：http://msdn.microsoft.com/en-us/library/hh456380.aspx)
    4. 每个Client_Secret免费额度是每个月2000000个character
    
Google Translate API support
------------------------------------------
### How to get Google Translate API Key
[this is a free api but I cannot guarantee its availableness](http://spidernitt.wordpress.com/2013/02/25/use-google-translate-for-free-in-your-apps/)<br/>

### Supported languages and translate rules
    1. 源语言被识别为其他，则翻译方向为“其他 -> 中”。
    2. 其他语言支持71种语言。
    
Contact
---------------------------------------
twitter [@shangjiyu](https://twitter.com/shangjiyu)
sina_weibo [@jia_4tw](http://weibo.com/shangjiyu)