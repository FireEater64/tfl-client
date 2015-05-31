package me.vanburgh.test;

import junit.framework.Assert;
import me.vanburgh.TflClient;
import org.junit.Test;

/**
 * Created by George on 30/05/2015.
 */
public class TestTflClient
{
    @Test
    public void testUnauthorisedClientIsReportedAsSuch()
    {
        TflClient underTest = new TflClient();
        Assert.assertFalse(underTest.isAuthorisedClient());
    }

    @Test
    public void testAuthorisedClientIsReportedAsSuch()
    {
        TflClient underTest = new TflClient("abc", "123");
        Assert.assertTrue(underTest.isAuthorisedClient());
    }
}
