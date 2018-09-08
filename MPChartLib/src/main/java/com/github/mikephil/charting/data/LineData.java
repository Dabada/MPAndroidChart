
package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;

import java.util.List;

/**
 * Data object that encapsulates all data associated with a LineChart.
 *
 * @author Philipp Jahoda
 */
public class LineData<E extends Entry, L extends IBarLineScatterCandleBubbleDataSet<E>>
        extends BarLineScatterCandleBubbleData<E, L> {

    public LineData() {
        super();
    }

    public LineData(L... dataSets) {
        super(dataSets);
    }

    public LineData(List<L> dataSets) {
        super(dataSets);
    }
}
