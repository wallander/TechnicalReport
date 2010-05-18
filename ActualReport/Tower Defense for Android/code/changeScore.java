if (Mob has walked less than 500 pixels) {
    
	The new score is set to:

    Old score + ((Mob max health / 10) * (1 - 0.5 *
        (the distance the mob has walked / 500 pixels)))
		
} else {
    Old score + (Mob max health / 10) * 0.5
}
