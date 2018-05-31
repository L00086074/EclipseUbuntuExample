/**
 * 
 */
package clspkg;

import junit.framework.TestCase;

/**
 * @author colin
 *
 */
public class StudentTest extends TestCase {
	Student stu = new Student();

	/**
	 * @param name
	 */
	public StudentTest(String arg0) {
		super(arg0);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		stu.setModuleId(101);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link clspkg.Student#setModuleId(int)}.
	 */
	public final void testSetModuleId() {
		stu.setModuleId(202);
		assertEquals(202,stu.getModuleId());
	}

	/**
	 * Test method for {@link clspkg.Student#getModuleId()}.
	 */
	public final void testGetModuleId() {
		//fail("Not yet implemented"); // TODO
		Student stu = new Student();
		stu.setModuleId(101);
		int x = stu.getModuleId();
		
		assertEquals(101,x);
	}
	

}
