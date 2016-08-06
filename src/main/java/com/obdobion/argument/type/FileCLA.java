package com.obdobion.argument.type;

import java.io.File;
import java.text.ParseException;

public class FileCLA extends AbstractCLA<File>
{
    /**
     * @param target
     */
    @Override
    public File convert(final String valueStr, final boolean _caseSensitive, final Object target)
            throws ParseException
    {
        if (_caseSensitive)
            return new File(valueStr);
        return new File(valueStr.toLowerCase());
    }

    @Override
    public String defaultInstanceClass()
    {
        return "java.io.File";
    }

    @Override
    protected void exportCommandLineData(final StringBuilder out, final int occ)
    {
        uncompileQuoter(out, getValue(occ).getAbsolutePath());
    }

    @Override
    protected void exportNamespaceData(final String prefix, final StringBuilder out, final int occ)
    {
        out.append(prefix);
        out.append("=");
        out.append(getValue(occ).getAbsolutePath());
        out.append("\n");
    }

    @Override
    protected void exportXmlData(final StringBuilder out, final int occ)
    {
        xmlEncode(getValue(occ).getAbsolutePath(), out);
    }

    @Override
    public String genericClassName()
    {
        return "java.io.File";
    }

    @Override
    public File[] getValueAsFileArray() throws ParseException
    {
        final File[] result = new File[size()];

        for (int r = 0; r < size(); r++)
            result[r] = getValue(r);

        return result;
    }

    @Override
    public boolean supportsCaseSensitive()
    {
        return true;
    }

    @Override
    public boolean supportsInList()
    {
        return false;
    }

}