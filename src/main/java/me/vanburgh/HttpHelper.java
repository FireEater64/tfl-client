package me.vanburgh;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by George on 30/05/2015.
 */
public class HttpHelper
{
    private static final String TFL_PROD_ENDPOINT = "api.tfl.gov.uk";

    public static JsonElement getJson(String givenEndpoint)
    {
        StringBuilder responseSb = new StringBuilder();
        try
        {
            URL url = new URL("https", TFL_PROD_ENDPOINT, givenEndpoint);
            url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String receivedLine;
            while ((receivedLine = reader.readLine()) != null)
            {
                responseSb.append(receivedLine);
            }
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        JsonElement jsonElement = new JsonParser().parse(responseSb.toString());

        return jsonElement;
    }
}
