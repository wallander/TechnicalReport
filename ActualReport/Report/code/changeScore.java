if (Mob has walked less than 500 pixels) {
    // The new score is added to the existing score
    // Using the algorithm:
    // Old score + (Mob max health / 10) * 
    //      (the distance the mob has walked / 500 pixels)
} else {
    // Old score + (Mob max health / 10) * 0.5
}
