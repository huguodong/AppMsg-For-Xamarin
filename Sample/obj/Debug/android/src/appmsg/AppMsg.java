package appmsg;


public class AppMsg
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("AppMsg.AppMsg, AppMsg, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", AppMsg.class, __md_methods);
	}


	public AppMsg () throws java.lang.Throwable
	{
		super ();
		if (getClass () == AppMsg.class)
			mono.android.TypeManager.Activate ("AppMsg.AppMsg, AppMsg, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public AppMsg (android.app.Activity p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == AppMsg.class)
			mono.android.TypeManager.Activate ("AppMsg.AppMsg, AppMsg, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.App.Activity, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
