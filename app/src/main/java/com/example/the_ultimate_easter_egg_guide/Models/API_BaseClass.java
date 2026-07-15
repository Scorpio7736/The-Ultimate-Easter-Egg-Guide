package com.example.the_ultimate_easter_egg_guide.Models;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

import com.example.the_ultimate_easter_egg_guide.Models.Images.ImageTypes;

import java.io.File;

public class API_BaseClass
{
    protected Context context;

    public API_BaseClass(Context context) {
        this.context = context;
    }

    public API_BaseClass() { }

    protected void DownloadImageFromLink(String link, String imageName, ImageTypes imageType)
    {
        
    }

    protected boolean CheckIfConnectedToInternet()
    {
        if (context == null) return false;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null) {
            NetworkCapabilities capabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (capabilities != null) {
                return capabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET);
            }
        }
        return false;
    }

    protected boolean CheckIfImageExists(String imageName)
    {
        if (context == null) return false;
        File file = new File(context.getFilesDir(), imageName);
        return file.exists();
    }

    protected String GenerateImageName(Games game, String imageName, ImageTypes type)
    {
        String formattedName = imageName.toLowerCase().replace(" ", "");
        
        if (type == ImageTypes.YouTuberPortrait) {
            return formattedName + "_" + type.typeCode;
        }

        String gameCode = (game != null) ? game.gameCode.toLowerCase() : "unknown";
        return gameCode + "_" + formattedName + "_" + type.typeCode;
    }

    public String GetImageOrDefault(String imageName, ImageTypes imageType)
    {
        return imageName;
    }
}
