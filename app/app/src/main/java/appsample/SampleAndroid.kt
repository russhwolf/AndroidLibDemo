package appsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import libsample.Sample

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hello()
        Sample().checkMe()
        setContentView(R.layout.activity_main)
    }
}
