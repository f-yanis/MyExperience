package ru.fyanis.fjava.chapter9.adapter;

import ru.fyanis.fjava.chapter9.filters.Filter;
import ru.fyanis.fjava.chapter9.filters.Waveform;
import ru.fyanis.fjava.chapter9.process.Processor;

public class FilterAdapter implements Processor {
    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    public String name() {
        return filter.name();
    }

    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}
