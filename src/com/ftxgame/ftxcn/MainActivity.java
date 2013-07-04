package com.ftxgame.ftxcn;

import net.frakbot.imageviewex.Converters;
import net.frakbot.imageviewex.ImageViewEx;
import net.frakbot.imageviewex.ImageViewNext;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	private ImageViewEx imgEx1;
	private ImageViewEx imgEx2;
	private ImageViewNext imgNext1;
	private ImageViewNext imgNext2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ImageViewNext.setMaximumNumberOfThreads(100);

		setContentView(R.layout.activity_main);
		
        ImageViewNext.setClassErrorDrawable(R.drawable.empty_newsthumb);
        ImageViewNext.setClassLoadingDrawable(R.drawable.loader);
        
		imgEx1 = (ImageViewEx) findViewById(R.id.imageViewEx1);
		imgEx2 = (ImageViewEx) findViewById(R.id.imageViewEx2);
		imgNext1 = (ImageViewNext) findViewById(R.id.imageViewNext1);
		imgNext2 = (ImageViewNext) findViewById(R.id.imageViewNext2);
		
		// 1、本地gif读取播放
//		2、本地jpg/png图片读取
//		3、URL gif图片读取播放
//		4、URL jpg/png图片读取
		
		imgEx1.setSource(Converters.assetToByteArray(getAssets(), "test_gif.gif"));
		imgEx2.setBackgroundResource(R.drawable.test);
		
		imgNext1.setUrl("http://static.ftx.cn/images/T1DRhTBXCT1RCvBVdK");
		imgNext2.setUrl("http://static.ftx.cn/images/T12RhTB4VT1RCvBVdK");
//		img1.setDensity(DisplayMetrics.DENSITY_LOW);
	}
}
