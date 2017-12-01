import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestRemoveDups {

	LinkedListNode testNode;

	@Before
	public void init(){
		testNode = new LinkedListNode();
		
	}
	@Test
	public void testPushFunction() {
		testNode.push(1);
		//	Assert.assertFalse(testNode ==null);
		Assert.assertEquals(testNode.head.data,1);
		testNode.push(2);
		Assert.assertEquals(testNode.head.data,2);
	}
	
	@Test
	public void testAppendFunction(){
		LinkedListNode appendLinkedListNode = new LinkedListNode();
		for(int i=0;i<10;i++){
			appendLinkedListNode.appendToTail(i);
		}
		Assert.assertEquals(appendLinkedListNode.head.data, 0);
		
	}
	
	@Test
	public void testRemoveDups(){
		LinkedListNode removeLinkedList = new LinkedListNode();
		for (int i=0;i<4;i++){
			removeLinkedList.push(2);
		}
		Assert.assertNotNull(removeLinkedList.head.next);
		RemoveDuplicate.removeDups(removeLinkedList);
		Assert.assertNull(removeLinkedList.head.next);
	}

}
