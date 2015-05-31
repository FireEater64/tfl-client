package me.vanburgh;

import org.junit.Test;

import java.util.List;

/**
 * Created by George on 30/05/2015.
 */
public class TestBikeApi
{
    @Test
    public void testUnauthorisedClientIsReportedAsSuch()
    {
        BikeApi underTest = new BikeApi();
        List<BikePoint> bikes = underTest.getAllBikePoints();
    }
}
