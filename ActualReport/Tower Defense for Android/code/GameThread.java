while (thread is set to run by GameView) {    
	clear canvas	
    try {
        initialize and lock canvas with new content
		      
		synchronized {            
			GamePanel.updateModel();
            GamePanel.updateSounds();
            GamePanel.onDraw(canvas);
        }
    } catch (thread is interrupted) {
        do nothing
    } finally {       
        if (canvas exists) {
            unlock canvas
        }  
    }
}