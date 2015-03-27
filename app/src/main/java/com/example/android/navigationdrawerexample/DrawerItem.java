package com.example.android.navigationdrawerexample;

/**
 * Created by SnsPlusVN_05 on 3/26/2015.
 */
public class DrawerItem {
    private String _name;
    private int _image;


    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public int get_image() {
        return _image;
    }

    public void set_image(int _image) {
        this._image = _image;

    }

    public DrawerItem(String name, int image)
    {
        this._image = image;
        this._name = name;
    }
}
