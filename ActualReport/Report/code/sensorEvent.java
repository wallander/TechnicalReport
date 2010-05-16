private SensorEventListener listener = new SensorEventListener() {
    public void onAccuracyChanged(Sensor sensor, int accuracy) {}
    public void onSensorChanged(SensorEvent event) {
        mLatestSensorEvent = event;
    }
};