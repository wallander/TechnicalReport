public void updatePosition(SensorEvent s) {

    setSpeedX(getSpeedX() + s.values[1] / 45);
    setSpeedY(getSpeedY() + s.values[0] / 45);
 
    setX(getX() + getSpeedX());
    setY(getY() + getSpeedY());
}