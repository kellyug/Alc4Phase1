package co.ug.skywayhotel.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class ActivityB extends AppCompatActivity {

    private WebView WebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_alc_activity);

        WebView = (WebView) findViewById(R.id.WebView);
        WebView.setWebViewClient(new WebViewClient(){

        public void onReceivedSslError() {
     }

            @Override 
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error)
            {
                handler.proceed();
            }
        });
        WebView.getSettings().getLoadsImagesAutomatically();
        WebView.loadUrl("http://www.andela.com/alc");

        WebSettings webSettings = WebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        WebView.getSettings().setDomStorageEnabled(true);


        getSupportActionBar().setTitle("About ALC");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        // TODO Auto-generated method stub

        view.loadUrl(url);
        return true;
    }


    public void onBackPressed() {
        if (WebView.canGoBack()){
            WebView.goBack();
        } else {
            super.onBackPressed();
        }


}
}
