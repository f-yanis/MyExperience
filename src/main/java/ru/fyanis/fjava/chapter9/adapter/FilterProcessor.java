package ru.fyanis.fjava.chapter9.adapter;

import ru.fyanis.fjava.chapter9.filters.BandPass;
import ru.fyanis.fjava.chapter9.filters.HighPass;
import ru.fyanis.fjava.chapter9.filters.LowPass;
import ru.fyanis.fjava.chapter9.filters.Waveform;
import ru.fyanis.fjava.chapter9.process.Apply;

public class FilterProcessor {
    public static void main(String[] args) {
        Waveform waveform = new Waveform();
        Apply.process(new FilterAdapter(
                      new LowPass(1.0)), waveform);

        Apply.process(new FilterAdapter(
                      new HighPass(2.0)), waveform);

        Apply.process(new FilterAdapter(
                      new BandPass(3.0, 4.0)), waveform);
    }
}
