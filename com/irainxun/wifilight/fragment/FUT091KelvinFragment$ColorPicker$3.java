package com.irainxun.wifilight.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.database.wifi_light;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import java.text.DecimalFormat;

class FUT091KelvinFragment$ColorPicker$3
  implements View.OnClickListener
{
  FUT091KelvinFragment$ColorPicker$3(FUT091KelvinFragment.ColorPicker paramColorPicker, ImageView paramImageView, PopupWindow paramPopupWindow)
  {
  }

  public void onClick(View paramView)
  {
    DecimalFormat localDecimalFormat = new DecimalFormat("00");
    String str = String.valueOf(MyApp.DeviceControl.getMacAddress()) + "aa" + localDecimalFormat.format(MyApp.rain_remoteID);
    wifi_light localwifi_light;
    if (MyApp.deviceService.wifiLight_isDeviceExists(str))
    {
      new wifi_light();
      localwifi_light = MyApp.deviceService.tab1_getMyDevice(str);
      if (this.val$view != FUT091KelvinFragment.ColorPicker.access$0(this.this$1))
        break label140;
      localwifi_light.device1 = "0";
      localwifi_light.wifilight_s1 = "0";
      localwifi_light.wifilight_ang1 = "0";
      localwifi_light.wifilight_b1 = "0";
    }
    while (true)
    {
      MyApp.deviceService.wifiLight_edit(localwifi_light);
      this.val$view.setImageResource(R.drawable.transparent);
      this.val$popupWindow.dismiss();
      return;
      label140: if (this.val$view == FUT091KelvinFragment.ColorPicker.access$1(this.this$1))
      {
        localwifi_light.device2 = "0";
        localwifi_light.wifilight_s2 = "0";
        localwifi_light.wifilight_ang2 = "0";
        localwifi_light.wifilight_b2 = "0";
      }
      else if (this.val$view == FUT091KelvinFragment.ColorPicker.access$2(this.this$1))
      {
        localwifi_light.device3 = "0";
        localwifi_light.wifilight_s3 = "0";
        localwifi_light.wifilight_ang3 = "0";
        localwifi_light.wifilight_b3 = "0";
      }
      else if (this.val$view == FUT091KelvinFragment.ColorPicker.access$3(this.this$1))
      {
        localwifi_light.device4 = "0";
        localwifi_light.wifilight_s4 = "0";
        localwifi_light.wifilight_ang4 = "0";
        localwifi_light.wifilight_b4 = "0";
      }
      else if (this.val$view == FUT091KelvinFragment.ColorPicker.access$4(this.this$1))
      {
        localwifi_light.device5 = "0";
        localwifi_light.wifilight_s5 = "0";
        localwifi_light.wifilight_ang5 = "0";
        localwifi_light.wifilight_b5 = "0";
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT091KelvinFragment.ColorPicker.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */