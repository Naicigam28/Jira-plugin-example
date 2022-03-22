package ut.com.al.jiraPluginExample;

import org.junit.Test;
import com.al.jiraPluginExample.api.MyPluginComponent;
import com.al.jiraPluginExample.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}