private SensorEventListener listener = new SensorEventListener() {
    public void onAccuracyChanged(sensor, accuracy) {}
    public void onSensorChanged(event) {
        mLatestSensorEvent = event;
    }
};