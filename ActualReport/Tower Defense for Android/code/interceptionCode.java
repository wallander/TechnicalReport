set target coordinate to:
    (getMob().getX() + getMob().getWidth()/2,
	getMob().getY()  + getMob().getHeight()/2)
	
calculate the angle, a2, between the projectile and its target

set angle to:
    (a2 - Math.asin(getMob().getSpeed()/getSpeed()*
	Math.sin(Math.PI - a2 + getMob().getAngle())))