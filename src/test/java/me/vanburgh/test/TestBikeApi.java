package me.vanburgh.test;

import me.vanburgh.BikeApi;
import me.vanburgh.BikePoint;
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
