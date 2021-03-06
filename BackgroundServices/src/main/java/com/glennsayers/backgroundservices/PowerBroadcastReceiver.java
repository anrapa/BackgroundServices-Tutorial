package com.glennsayers.backgroundservices;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

/**
 * Created by glenns on 09/08/13.
 */
public class PowerBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context ctx, Intent intent){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(ctx)
                .setSmallIcon(R.drawable.ic_launcher)
                .setContentText("Power cable has been plugged in")
                .setContentTitle("Attention");
        NotificationManager manager = (NotificationManager) ctx.getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0, builder.build());
    }
}
