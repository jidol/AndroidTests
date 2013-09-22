package org.idol.movetext;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private boolean isFirst = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void triggerMoveText(View item)
    {
        EditText editText = (EditText) findViewById(R.id.edit_message);
        Editable textFound = editText.getText();
        TextView resultArea = (TextView) findViewById(R.id.resultArea);

        if(isFirst)
        {
            resultArea.append("\n\n");
            isFirst = false;
        }
        resultArea.append(textFound.toString() + "\n");
        textFound.clear();
    }
    
}
