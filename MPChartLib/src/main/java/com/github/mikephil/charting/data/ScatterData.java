
package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;

import java.util.List;

public class ScatterData<E extends Entry>
        extends BarLineScatterCandleBubbleData<E, IScatterDataSet<E>> {

    public ScatterData() {
        super();
    }

    public ScatterData(List<IScatterDataSet<E>> dataSets) {
        super(dataSets);
    }

    public ScatterData(IScatterDataSet<E>... dataSets) {
        super(dataSets);
    }

    /**
     * Returns the maximum shape-size across all DataSets.
     *
     * @return
     */
    public float getGreatestShapeSize() {

        float max = 0f;

        for (IScatterDataSet set : mDataSets) {
            float size = set.getScatterShapeSize();

            if (size > max)
                max = size;
        }

        return max;
    }
}
