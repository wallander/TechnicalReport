mMobInfo = mAllWaves[waveIndex].split(" ");
String sType = mMobInfo[0];

if(sType.equals("NORMAL"))
     iType = Mob.NORMAL;
else if (sType.equals("AIR"))
    iType = Mob.AIR;
else if (sType.equals("FAST"))
    iType = Mob.FAST;
else if (sType.equals("HEALTHY"))
    iType = Mob.HEALTHY;
else // if (sType.equals("IMMUNE"))
    iType = Mob.IMMUNE;

int numberOfMobsInWave = Integer.parseInt(mMobInfo[1]);
int health = Integer.parseInt(mMobInfo[2]);