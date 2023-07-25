

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import com.softwareag.util.PipelineUtil;
// --- <<IS-END-IMPORTS>> ---

public final class js

{
	// ---( internal utility methods )---

	final static js _instance = new js();

	static js _newInstance() { return new js(); }

	static js _cast(Object o) { return (js)o; }

	// ---( server methods )---




	public static final void js1 (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(js1)>> ---
		// @sigtype java 3.5
		// [i] field:0:required A
		// [i] field:0:required B
		// [o] field:0:required C
		System.out.println("Build on Service Designer");
		pipeline.getHashCursor().getKey();
		// --- <<IS-END>> ---

                
	}
}

