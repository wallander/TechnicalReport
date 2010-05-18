public boolean onTouchEvent() {

    // code

    if (in game over state) {
        if (touch event is action up) {
            if (touch event coordinate matches exit button coordinates) {
                stop the game thread and exit the game
            }
            else if (matches coordinates for other buttons) ...
        }
        else if (other type of touch event) ...
    }
    else if (in other state) ...
	
	// more code
}