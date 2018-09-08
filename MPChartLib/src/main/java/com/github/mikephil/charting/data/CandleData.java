package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.ICandleDataSet;

import java.util.List;

public class CandleData<E extends CandleEntry>
        extends BarLineScatterCandleBubbleData<E, ICandleDataSet<E>> {

    public CandleData() {
        super();
    }

    public CandleData(List<ICandleDataSet<E>> dataSets) {
        super(dataSets);
    }

    public CandleData(ICandleDataSet<E>... dataSets) {
        super(dataSets);
    }
}
