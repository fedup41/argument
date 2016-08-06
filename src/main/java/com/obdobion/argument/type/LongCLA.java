package com.obdobion.argument.type;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

/**
 * @author Chris DeGreef
 *
 */
public class LongCLA extends AbstractCLA<Long>
{
    protected NumberFormat FMTin  = NumberFormat.getNumberInstance();
    protected NumberFormat FMTout = new DecimalFormat("0");

    /**
     * @param _caseSensitive
     * @param target
     */
    @Override
    public Long convert(final String valueStr, final boolean _caseSensitive, final Object target)
            throws ParseException
    {
        return FMTin.parse(valueStr).longValue();
    }

    @Override
    public String defaultInstanceClass()
    {
        return "long";
    }

    @Override
    protected void exportCommandLineData(final StringBuilder out, final int occ)
    {
        if (getValue(occ) < 0)
            out.append("'");
        out.append(FMTout.format(getValue(occ)));
        if (getValue(occ) < 0)
            out.append("'");
    }

    @Override
    protected void exportNamespaceData(final String prefix, final StringBuilder out, final int occ)
    {
        out.append(prefix);
        out.append("=");
        out.append(FMTout.format(getValue(occ)));
        out.append("\n");
    }

    @Override
    protected void exportXmlData(final StringBuilder out, final int occ)
    {
        out.append(FMTout.format(getValue(occ)));
    }

    @Override
    public String genericClassName()
    {
        return "java.lang.Long";
    }

    @Override
    public long[] getValueAslongArray() throws ParseException
    {
        final long[] result = new long[size()];

        for (int r = 0; r < size(); r++)
            result[r] = getValue(r).longValue();

        return result;
    }

    @Override
    public Long[] getValueAsLongArray() throws ParseException
    {
        final Long[] result = new Long[size()];

        for (int r = 0; r < size(); r++)
            result[r] = getValue(r);

        return result;
    }
}