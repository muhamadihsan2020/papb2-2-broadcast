package apps.jobcourse.broadcastreceiverproject;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        String msg = "";
        switch (intent.getAction()){
            case Intent.ACTION_POWER_CONNECTED:
                msg = "this power is connected";
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                msg = "this power is disconnected";
                break;
            case "ACTION_CUSTOM_BROADCAST":
                msg = intent.getStringExtra("data"); // Cara 2
                // msg = "this is custom broadcast"; // Cara 1
                break;
            default:
                msg = "default message";
                break;
        }

        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
