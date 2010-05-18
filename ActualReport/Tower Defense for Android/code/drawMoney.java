private void drawRewardsAfterDeadMob() {
    for (every dead mob) {
	
        draw the reward graphic
        change y-coordinate of reward
        increase reward frame variable
	
        if (the reward frame variable is higher than 12) {
            remove the dead mob from the list
			remove the reward graphic
        }
    }
}