while (mRunThread) {
    canvas = null;
    try {
        canvas = mGamePanel.getHolder().lockCanvas(null);
        synchronized (mGamePanel.getHolder()) {
            mGamePanel.updateModel();
            mGamePanel.updateSounds();
            mGamePanel.onDraw(canvas);
        }
    } catch (InterruptedException ie) {
    // doNothing();
    } finally {
        // do this in a finally so that if an exception is thrown
        // during the above, we don't leave the Surface in an
        // inconsistent state
        if (c != null) {
            mGamePanel.getHolder().unlockCanvasAndPost(canvas);
        }  
    }
}