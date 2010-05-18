mMobInfo = mAllWaves[waveIndex].split(" ");
String sType = mMobInfo[0];

if(sType is normal)
    set mob type to normal
else if (sType is air)
    set mob type to air
else if (sType is fast)
    set mob type to fast
else if (sType is healthy)
    set mob type to healthy
else if (sType is immune)
    set mob type to immune

int numberOfMobsInWave = Integer.parseInt(mMobInfo[1]);
int health = Integer.parseInt(mMobInfo[2]);