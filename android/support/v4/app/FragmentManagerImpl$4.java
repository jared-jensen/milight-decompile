package android.support.v4.app;

class FragmentManagerImpl$4
  implements Runnable
{
  FragmentManagerImpl$4(FragmentManagerImpl paramFragmentManagerImpl, int paramInt1, int paramInt2)
  {
  }

  public void run()
  {
    this.this$0.popBackStackState(this.this$0.mActivity.mHandler, null, this.val$id, this.val$flags);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.FragmentManagerImpl.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */