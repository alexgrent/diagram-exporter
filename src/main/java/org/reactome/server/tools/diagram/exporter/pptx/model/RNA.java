package org.reactome.server.tools.diagram.exporter.pptx.model;

import com.aspose.slides.IShapeCollection;
import com.aspose.slides.ShapeType;
import org.reactome.server.tools.diagram.data.layout.Node;

/**
 * @author Guilherme S Viteri <gviteri@ebi.ac.uk>
 */

@SuppressWarnings("ALL")
public class RNA extends PPTXNode {

    private final int shapeType = ShapeType.Rectangle;

    public RNA(Node node) {
        super(node);
    }

    @Override
    public void render(IShapeCollection shapes, ColourProfile colourProfile) {
        render(shapes, shapeType, colourProfile.get(RNA.class));
    }
}
