

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class DesignerGitCommit

{
	// ---( internal utility methods )---

	final static DesignerGitCommit _instance = new DesignerGitCommit();

	static DesignerGitCommit _newInstance() { return new DesignerGitCommit(); }

	static DesignerGitCommit _cast(Object o) { return (DesignerGitCommit)o; }

	// ---( server methods )---




	public static final void threadSleep (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(threadSleep)>> ---
		// @sigtype java 3.5
		// [i] field:0:required statement
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	statement = IDataUtil.getString( pipelineCursor, "statement" );
		pipelineCursor.destroy();
		
		
		// stop the main thread of the program for 5000 milliseconds (5 seconds)
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "statement", statement );
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}
}

