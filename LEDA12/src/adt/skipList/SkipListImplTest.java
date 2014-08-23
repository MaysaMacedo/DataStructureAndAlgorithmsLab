package adt.skipList;
import static org.junit.Assert.*;
 
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
 
public class SkipListImplTest {
	SkipListImpl<Integer> list;
    private int maxLevel = 15;
    
    @Before
    public void setup() {
            list = new SkipListImpl<Integer>(maxLevel);
    }
    
    @Test
    public void testInsert() {
            for (int i = 0; i < 100; i++) {
                    list.insert(i, i);
            }
    }
    
    @Test
    public void testInsertHeight() {
            for (int i = 0; i < 15; i++) {
                    list.insert(i, 5, i);
            }
    }
    
    @Test
    public void testRemove() {
            list.insert(2, 3);
            list.insert(5, 6);
            list.insert(1, 9);
            list.insert(3, 1);
            list.insert(7, 0);
            list.insert(9, 2);
            
            assertEquals(6, list.size());
            
            list.remove(5);
            assertEquals(5, list.size());
            list.remove(1);
            assertEquals(4, list.size());
            list.remove(3);
            assertEquals(3, list.size());
            list.remove(2);
            assertEquals(2, list.size());
            list.remove(7);
            assertEquals(1, list.size());
            list.remove(9);
            assertEquals(0, list.size());
    }
    
    @Test
    public void testHeight() {
            list.insert(2, 5, 14);
            assertTrue(list.height() == 14);
            list.insert(3, 2, 8);
            assertTrue(list.height() == 14);
            list.insert(7, 3, 15);
            assertTrue(list.height() == 15);
    }
    
    @Test
    public void testSearch() {
            assertNull(list.search(2));
            list.insert(4, 4);
            assertEquals(4, list.search(4).getKey());
            list.insert(8, 5);
            assertEquals(8, list.search(8).getKey());
            list.insert(1, 6);
            assertEquals(1, list.search(1).getKey());
            list.insert(-4, 7);
            assertEquals(-4, list.search(-4).getKey());
    }
    
    @Test
    public void testSize() {
            list.insert(2, 2);
            assertTrue(list.size() == 1);
            
            list.insert(3, 3);
            assertTrue(list.size() == 2);
            
            list.insert(4, 4);
            assertTrue(list.size() == 3);
            
            list.insert(5, 6);
            assertTrue(list.size() == 4);
            
            list.insert(6, 1);
            assertTrue(list.size() == 5);
            
            list.insert(7, 6);
            assertTrue(list.size() == 6);
            
            list.insert(8, 9);
            assertTrue(list.size() == 7);
            
            list.insert(1, 5);
            assertTrue(list.size() == 8);
            
            list.insert(0, 11);
            assertTrue(list.size() == 9);

            list.insert(13, 7);
            assertTrue(list.size() == 10);
            
            list.insert(80, 6);
            assertTrue(list.size() == 11);
            
            list.insert(20, 3);
            assertTrue(list.size() == 12);
            
            list.insert(15, 1);
            assertTrue(list.size() == 13);
            
            list.insert(16, 10);
            assertTrue(list.size() == 14);
            
            list.insert(23, 5);
            assertTrue(list.size() == 15);
    }
    
    @Test
    public void testToArray() {
            assertArrayEquals(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE}
            , castArrayOfSkipNode(list.toArray()));
            
            list.insert(4, 5);
            list.insert(6, 5);
            list.insert(8, 5);      
            assertArrayEquals(new int[]{Integer.MIN_VALUE, 4, 6, 8, Integer.MAX_VALUE}
            , castArrayOfSkipNode(list.toArray()));
            
            list.insert(1, 5);
            list.insert(3, 5);
            list.insert(9, 5);
            assertArrayEquals(new int[]{Integer.MIN_VALUE, 1, 3, 4, 6, 8, 9, Integer.MAX_VALUE}
            , castArrayOfSkipNode(list.toArray()));
            
            list.insert(5, 5);
            list.insert(2, 5);
            list.insert(7, 5);
            assertArrayEquals(new int[]{Integer.MIN_VALUE, 1, 2, 3, 4, 5, 6, 7, 8, 9, Integer.MAX_VALUE}
            , castArrayOfSkipNode(list.toArray()));
            
            list.insert(0, 3);
            assertArrayEquals(new int[]{Integer.MIN_VALUE, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, Integer.MAX_VALUE}
            , castArrayOfSkipNode(list.toArray()));
            
    }
    
    @Test
    public void testCase() {
            // TODO
    }

    private int[] castArrayOfSkipNode(SkipNode[] nodes) {
            int[] resp = new int[nodes.length];
            for (int i = 0; i < resp.length; i++) {
                    resp[i] = nodes[i].getKey();
            }
            return resp;
    }
    
 
}