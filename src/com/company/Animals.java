package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class Animals
{
    private List<String> afraidList;
    private String navn;

    public Animals()
    {
        setList();
    }

    public void addAnimalToList(String s)
    {
        if(!(afraidList.contains(s)))
        {
            afraidList.add(s);
        }
    }

    public int compareAnimals(Animals a)
    {
        if(afraidList.contains(a.getNavn()))
        {
            return 1;
        }
        return 0;
    }

    public void setList()
    {
        afraidList = new ArrayList<>();
    }

    public String toString()
    {
        return navn;
    }

    public void setNavn(String navn)
    {
        this.navn = navn;
    }

    public List<String> getAfraidList()
    {

        return afraidList;
    }

    public String getNavn()
    {
        return navn;
    }
}
