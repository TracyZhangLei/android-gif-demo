package com.tracyzhang.xgif;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.tracyzhang.xgif.adapter.ChatAdapter;


/**
 * 
 * @author tracyZhang   QQ:381356799
 *
 */
public class MainActivity extends Activity {
	
	private ListView list;
	private List<String> msgs;
	private ChatAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		list = (ListView) findViewById(R.id.list);
		
		msgs = new ArrayList<String>();
		StringBuilder msg = new StringBuilder();
		msg.append("this is a demo,you can input the face keyword in the FaceManager.java .It looks like").append(" [得意][偷笑][擦汗][酷]");
		msg.append("and so on .");
		msgs.add(msg.toString());
		
		msgs.add("You can download the demo from https://github.com/TracyZhangLei");
		msgs.add("[微笑][微笑][微笑]");
		msgs.add("[咖啡][微笑][咖啡]");
		msgs.add("[咖啡][微笑][咖啡]");
		msgs.add("[咖啡][微笑][咖啡]");
		msgs.add("[咖啡][微笑][咖啡]");
		msgs.add("[咖啡][微笑][咖啡]");
		msgs.add("[咖啡][微笑][咖啡]");
		msgs.add("[咖啡][微笑][咖啡]");
		
		msgs.add("中华人民共和国万岁！[微笑]");
		msgs.add("Long live the People's Republic of China！[微笑]");
		msgs.add("長い中華人民共和国ライブ！[微笑]");
		
		msgs.add("中华人民共和国万岁！");
		msgs.add("Long live the People's Republic of China！");
		msgs.add("長い中華人民共和国ライブ！");
		
		msgs.add("[微笑]中华人民共和国万岁！");
		msgs.add("[微笑]Long live the People's Republic of China！");
		msgs.add("[微笑]長い中華人民共和国ライブ！");
		
		msgs.add("Talk is cheap,show me the code.");
		
		adapter = new ChatAdapter(this, msgs);
		list.setAdapter(adapter);
		
	}
}
