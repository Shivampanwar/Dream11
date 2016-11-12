package shivam.panwar.actressdetails;

import java.util.UUID;

/**
 * Created by panwa on 10/26/2016.
 */
public class Actress {
    private String name,country;
    private UUID mid;

    public Actress(String name, String country) {
        this.name = name;
        this.country = country;
    }
    public Actress()
    {
      mid=UUID.randomUUID();

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getMid() {
        return mid;
    }
}
