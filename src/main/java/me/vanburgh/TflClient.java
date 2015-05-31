package me.vanburgh;

/**
 * Created by George on 30/05/2015.
 */
public class TflClient {

    private String _applicationId;

    private String _applicationKey;

    public BikeApi bikeApi;

    /***
     * Check whether the current client has applicationId/Key values
     * @return True if the client has apiKeys specified
     */
    public boolean isAuthorisedClient()
    {
        return (_applicationId != null && !_applicationId.isEmpty()) &&
               (_applicationKey != null && !_applicationKey.isEmpty());
    }

    /***
     * Create an unauthorised TflClient
     */
    public TflClient()
    {

    }

    /***
     * Create an authorised TflClient
     * @param applicationId The application id to use for authentication
     * @param applicationKey The application key to use for authentication
     */
    public TflClient(String applicationId, String applicationKey)
    {
        this._applicationId = applicationId;
        this._applicationKey = applicationKey;
    }

}
