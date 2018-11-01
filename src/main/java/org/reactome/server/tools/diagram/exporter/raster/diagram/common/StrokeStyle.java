package org.reactome.server.tools.diagram.exporter.raster.diagram.common;

import java.awt.*;

import static java.awt.BasicStroke.CAP_BUTT;
import static java.awt.BasicStroke.JOIN_MITER;

/**
 * Choose among different stroke widths.
 *
 * @author Lorente-Arencibia, Pascual (pasculorente@gmail.com)
 */
public enum StrokeStyle {

	FLAG(8),
	HALO(5),
	SELECTION(3),
	SEGMENT (1),
	BORDER (2);

	private final Stroke NORMAL;
	private final Stroke DASHED;

	StrokeStyle(float width) {
		NORMAL = new BasicStroke(width, CAP_BUTT, JOIN_MITER);
		DASHED = new BasicStroke(width, CAP_BUTT, JOIN_MITER, 5f, new float[]{5f, 5f}, 5f);
	}

	public final Stroke get(boolean dashed) {
		return dashed ? this.DASHED : NORMAL;
	}
}
