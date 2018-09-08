package com.github.mikephil.charting.interfaces.dataprovider;

import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;

public interface LineDataProvider<E extends Entry, L extends IBarLineScatterCandleBubbleDataSet<E>>
        extends BarLineScatterCandleBubbleDataProvider {

    LineData<E, L> getLineData();

    YAxis getAxis(YAxis.AxisDependency dependency);
}
