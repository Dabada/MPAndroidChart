
package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet;
import com.github.mikephil.charting.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class BubbleDataSet<E extends BubbleEntry> extends BarLineScatterCandleBubbleDataSet<E> implements IBubbleDataSet<E> {

    protected float mMaxSize;
    protected boolean mNormalizeSize = true;

    private float mHighlightCircleWidth = 2.5f;

    public BubbleDataSet(List<E> yVals, String label) {
        super(yVals, label);
    }

    @Override
    public void setHighlightCircleWidth(float width) {
        mHighlightCircleWidth = Utils.convertDpToPixel(width);
    }

    @Override
    public float getHighlightCircleWidth() {
        return mHighlightCircleWidth;
    }

    @Override
    protected void calcMinMax(E e) {
        super.calcMinMax(e);

        final float size = e.getSize();

        if (size > mMaxSize) {
            mMaxSize = size;
        }
    }

    @Override
    public BubbleDataSet<E> copy() {
        List<BubbleEntry> entries = new ArrayList<>();
        for (int i = 0; i < mValues.size(); i++) {
            entries.add(mValues.get(i).copy());
        }
        BubbleDataSet<E> copied = new BubbleDataSet(entries, getLabel());
        copy(copied);
        return copied;
    }

    protected void copy(BubbleDataSet<E> bubbleDataSet) {
        bubbleDataSet.mHighlightCircleWidth = mHighlightCircleWidth;
        bubbleDataSet.mNormalizeSize = mNormalizeSize;
    }

    @Override
    public float getMaxSize() {
        return mMaxSize;
    }

    @Override
    public boolean isNormalizeSizeEnabled() {
        return mNormalizeSize;
    }

    public void setNormalizeSizeEnabled(boolean normalizeSize) {
        mNormalizeSize = normalizeSize;
    }
}
