package com.example.android.bluetoothlegatt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class GraphView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph_view);

        WebView webview = (WebView)this.findViewById(R.id.webview);

        //String html = "<iframe src="http://192.168.22.252:32838/dashboard/db/test?refresh=5s&orgId=1&from=1512268289264&to=1512268589264&var-user=All" name='frame1' scrolling='auto' frameborder='no' align='center'></iframe>";
        //html += "<body><h1>Image?</h1><img src="" /></body></html>";

        //webview.loadDataWithBaseURL("file:///android_res/drawable/", html, "text/html", "UTF-8", null);
    }
}
