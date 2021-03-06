package android.support.v4.view.accessibility;

import android.os.Bundle;
import android.view.View;

class AccessibilityNodeInfoCompat$AccessibilityNodeInfoJellybeanImpl extends AccessibilityNodeInfoCompat.AccessibilityNodeInfoIcsImpl
{
  AccessibilityNodeInfoCompat$AccessibilityNodeInfoJellybeanImpl()
  {
  }

  public void addChild(Object paramObject, View paramView, int paramInt)
  {
    AccessibilityNodeInfoCompatJellyBean.addChild(paramObject, paramView, paramInt);
  }

  public Object findFocus(Object paramObject, int paramInt)
  {
    return AccessibilityNodeInfoCompatJellyBean.findFocus(paramObject, paramInt);
  }

  public Object focusSearch(Object paramObject, int paramInt)
  {
    return AccessibilityNodeInfoCompatJellyBean.focusSearch(paramObject, paramInt);
  }

  public int getMovementGranularities(Object paramObject)
  {
    return AccessibilityNodeInfoCompatJellyBean.getMovementGranularities(paramObject);
  }

  public boolean isAccessibilityFocused(Object paramObject)
  {
    return AccessibilityNodeInfoCompatJellyBean.isAccessibilityFocused(paramObject);
  }

  public boolean isVisibleToUser(Object paramObject)
  {
    return AccessibilityNodeInfoCompatJellyBean.isVisibleToUser(paramObject);
  }

  public Object obtain(View paramView, int paramInt)
  {
    return AccessibilityNodeInfoCompatJellyBean.obtain(paramView, paramInt);
  }

  public boolean performAction(Object paramObject, int paramInt, Bundle paramBundle)
  {
    return AccessibilityNodeInfoCompatJellyBean.performAction(paramObject, paramInt, paramBundle);
  }

  public void setAccessibilityFocused(Object paramObject, boolean paramBoolean)
  {
    AccessibilityNodeInfoCompatJellyBean.setAccesibilityFocused(paramObject, paramBoolean);
  }

  public void setMovementGranularities(Object paramObject, int paramInt)
  {
    AccessibilityNodeInfoCompatJellyBean.setMovementGranularities(paramObject, paramInt);
  }

  public void setParent(Object paramObject, View paramView, int paramInt)
  {
    AccessibilityNodeInfoCompatJellyBean.setParent(paramObject, paramView, paramInt);
  }

  public void setSource(Object paramObject, View paramView, int paramInt)
  {
    AccessibilityNodeInfoCompatJellyBean.setSource(paramObject, paramView, paramInt);
  }

  public void setVisibleToUser(Object paramObject, boolean paramBoolean)
  {
    AccessibilityNodeInfoCompatJellyBean.setVisibleToUser(paramObject, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoJellybeanImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */