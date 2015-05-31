package me.vanburgh;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.javadocmd.simplelatlng.LatLng;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by George on 30/05/2015.
 */
public class BikeApi
{
    public BikeApi()
    {

    }

    public ArrayList<BikePoint> getAllBikePoints()
    {
        JsonArray bikeJson = (JsonArray) HttpHelper.getJson("/BikePoint");
        ArrayList<BikePoint> toReturn = new ArrayList<BikePoint>();

        for (JsonElement bikeDetails : bikeJson)
        {
            toReturn.add(this.parseBikeDetails(bikeDetails.getAsJsonObject()));
        }

        return toReturn;
    }

    private BikePoint parseBikeDetails(JsonObject givenBikeDetails)
    {
        BikePoint toReturn = new BikePoint();
        toReturn.setId(givenBikeDetails.get("id").getAsString());
        toReturn.setUrl(givenBikeDetails.get("url").getAsString());
        toReturn.setCommonName(givenBikeDetails.get("commonName").getAsString());

        JsonArray additionalProperties = givenBikeDetails.getAsJsonArray("additionalProperties");

        // Could use horrible reflection to do this - but no.
        for (JsonElement additionalPropertyObject : additionalProperties)
        {
            String key = ((JsonObject) additionalPropertyObject).get("key").getAsString();
            String value = ((JsonObject) additionalPropertyObject).get("value").getAsString();

            // If only Java could switch on strings...
            if (key.equals("Installed"))
                toReturn.setInstalled(Boolean.parseBoolean(value));
            if (key.equals("Locked"))
                toReturn.setLocked(Boolean.parseBoolean(value));
            if (key.equals("InstallDate"))
                // Date is in milliseconds
                if (value.isEmpty())
                    toReturn.setRemovalDate(null);
                else
                    toReturn.setRemovalDate(new Date(Long.parseLong(value)));
            if (key.equals("Temporary"))
                toReturn.setTemporary(Boolean.parseBoolean(value));
            if (key.equals("NbBikes"))
                toReturn.setNbBikes(Integer.parseInt(value));
            if (key.equals("NbEmptyDocks"))
                toReturn.setNbEmptyDocks(Integer.parseInt(value));
            if (key.equals("NbDocks"))
                toReturn.setNbDocks(Integer.parseInt(value));
            if (key.equals("RemovalDate"))
                if (value.isEmpty())
                    toReturn.setRemovalDate(null);
                else
                    toReturn.setRemovalDate(new Date(Long.parseLong(value)));
        }

        double lat = Double.parseDouble(givenBikeDetails.get("lat").toString());
        double lon = Double.parseDouble(givenBikeDetails.get("lon").toString());
        toReturn.setLocation(new LatLng(lat, lon));

        return toReturn;
    }
}
