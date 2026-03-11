public class TV {
    int channel = 1; // Saluran di set default 1
    int volumeLevel = 1; // Volume juga di set default 1
    boolean on = false; // menyimpan status TV dalam keadaan mati di awal

                    // Constructor kosong karena sudah dinyatakan diatas
    public TV() {
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120) //akan berjalan jika sudah on dan angka tidak boleh lebih kecil dari 1 dan lebih besar dari 120
         {
            channel = newChannel;
        }
    }

    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7) //akan berjalan jika on dan tidak dibawah 1 dan diatas 7
        {
            volumeLevel = newVolumeLevel;
        }
    }

    public void channelUp() {
        if (on && channel < 120) //akan berjalan jika on dan dibawah 120
         {
            channel++; //maka channel akan ditambah
        }
    }

    public void channelDown() {
        if (on && channel > 1) //jika on dan diatas 1 
            {
            channel--; //akan berkurang
        }
    }

    public void volumeUp() {
        if (on && volumeLevel < 7) //jika on dan dibawah 7
             {
            volumeLevel++; //vol akan bertambah
        }
    }

    public void volumeDown() {
        if (on && volumeLevel > 1) //jika on dan vol diatas 1
             {
            volumeLevel--;
        }
    }
}
