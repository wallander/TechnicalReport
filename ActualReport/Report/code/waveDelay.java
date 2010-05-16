if (!lastMobSent && mWaveDelayI >= mMaxWaveDelay)
    return mTrackWaves.get(mWaveIndex).get(mMobIndex);
else
    mWaveDelayI++;
    return null;