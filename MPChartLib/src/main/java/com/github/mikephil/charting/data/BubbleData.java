
package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet;

import java.util.List;

public class BubbleData<E extends BubbleEntry> extends BarLineScatterCandleBubbleData<E, IBubbleDataSet<E>> {

    public BubbleData() {
        super();
    }

    public BubbleData(IBubbleDataSet<E>... dataSets) {
        super(dataSets);
    }

    public BubbleData(List<IBubbleDataSet<E>> dataSets) {
        super(dataSets);
    }


    /**
     * Sets the width of the circle that surrounds the bubble when highlighted
     * for all DataSet objects this data object contains, in dp.
     *
     * @param width
     */
    public void setHighlightCircleWidth(float width) {
        for (IBubbleDataSet set : mDataSets) {
            set.setHighlightCircleWidth(width);
        }
    }
}
