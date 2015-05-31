package me.vanburgh;

import com.javadocmd.simplelatlng.LatLng;

import java.util.Date;

/**
 * An object representing a London bike rental stop.
 */
public class BikePoint
{
    protected void setId(String id)
    {
        this.id = id;
    }

    protected void setUrl(String url)
    {
        this.url = url;
    }

    protected void setCommonName(String commonName)
    {
        this.commonName = commonName;
    }

    protected void setLocation(LatLng location)
    {
        this.location = location;
    }

    protected void setInstalled(boolean installed)
    {
        this.installed = installed;
    }

    protected void setLocked(boolean locked)
    {
        this.locked = locked;
    }

    protected void setInstallDate(Date installDate)
    {
        this.installDate = installDate;
    }

    protected void setRemovalDate(Date removalDate)
    {
        this.removalDate = removalDate;
    }

    protected void setTemporary(boolean temporary)
    {
        this.temporary = temporary;
    }

    protected void setNbBikes(int nbBikes)
    {
        this.nbBikes = nbBikes;
    }

    protected void setNbEmptyDocks(int nbEmptyDocks)
    {
        this.nbEmptyDocks = nbEmptyDocks;
    }

    protected void setNbDocks(int nbDocks)
    {
        this.nbDocks = nbDocks;
    }

    public String getId()
    {
        return id;
    }

    public String getUrl()
    {
        return url;
    }

    public String getCommonName()
    {
        return commonName;
    }

    public LatLng getLocation()
    {
        return location;
    }

    public boolean isInstalled()
    {
        return installed;
    }

    public boolean isLocked()
    {
        return locked;
    }

    public Date getInstallDate()
    {
        return installDate;
    }

    public Date getRemovalDate()
    {
        return removalDate;
    }

    public boolean isTemporary()
    {
        return temporary;
    }

    public int getNbBikes()
    {
        return nbBikes;
    }

    public int getNbEmptyDocks()
    {
        return nbEmptyDocks;
    }

    public int getNbDocks()
    {
        return nbDocks;
    }

    private String id;

    private String url;

    private String commonName;

    private LatLng location;

    private boolean installed;

    private boolean locked;

    private Date installDate;

    private Date removalDate;

    private boolean temporary;

    private int nbBikes;

    private int nbEmptyDocks;

    private int nbDocks;
}
