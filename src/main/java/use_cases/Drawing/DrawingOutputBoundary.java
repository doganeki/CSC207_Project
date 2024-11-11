package use_cases.Drawing;

import java.awt.image.RenderedImage;

public interface DrawingOutputBoundary {

    void prepareSuccessView(RenderedImage drawing);

    void prepareFailView(String errorMessage);
}