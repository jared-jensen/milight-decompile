package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;

public class ViewPager$LayoutParams extends ViewGroup.LayoutParams
{
  int childIndex;
  public int gravity;
  public boolean isDecor;
  boolean needsMeasure;
  int position;
  float widthFactor = 0.0F;

  public ViewPager$LayoutParams()
  {
    super(-1, -1);
  }

  public ViewPager$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, ViewPager.access$400());
    this.gravity = localTypedArray.getInteger(0, 48);
    localTypedArray.recycle();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.ViewPager.LayoutParams
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */