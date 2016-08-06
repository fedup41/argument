package com.obdobion.argument.type;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import com.obdobion.algebrain.Equ;
import com.obdobion.argument.criteria.ICmdLineArgCriteria;
import com.obdobion.argument.input.Token;

/**
 * @author Chris DeGreef
 */
public interface ICmdLineArg<E>
{
    void applyDefaults();

    void asDefinedType(StringBuilder sb);

    Object asEnum(String name, Object[] possibleConstants) throws ParseException;

    Object[] asEnumArray(String name, Object[] possibleConstants) throws ParseException;

    ICmdLineArg<E> clone() throws CloneNotSupportedException;

    E convert(String valueStr) throws ParseException, IOException;

    E convert(String valueStr, boolean caseSensitive, Object target) throws ParseException, IOException;

    String defaultInstanceClass();

    void dontAllowCamelCaps();

    void exportCommandLine(File file) throws IOException;

    void exportCommandLine(StringBuilder str);

    void exportNamespace(File file) throws IOException;

    void exportNamespace(String prefix, StringBuilder str);

    void exportXml(String tag, File file) throws IOException;

    void exportXml(StringBuilder str);

    String genericClassName();

    String getCamelCaps();

    ICmdLineArgCriteria<?> getCriteria();

    List<E> getDefaultValues();

    Object getDelegateOrValue();

    Object getDelegateOrValue(int occurrence);

    String getEnumClassName();

    String getFactoryArgName();

    String getFactoryMethodName();

    String getFormat();

    String getHelp();

    String getInstanceClass();

    Character getKeychar();

    String getKeyword();

    Object getMetaphone();

    int getMultipleMax();

    int getMultipleMin();

    int getUniqueId();

    E getValue();

    E getValue(int index);

    byte[] getValueAsbyteArray() throws ParseException;

    Byte[] getValueAsByteArray() throws ParseException;

    Calendar[] getValueAsCalendarArray() throws ParseException;

    Character[] getValueAsCharacterArray() throws ParseException;

    char[] getValueAscharArray() throws ParseException;

    Date[] getValueAsDateArray() throws ParseException;

    double[] getValueAsdoubleArray() throws ParseException;

    Double[] getValueAsDoubleArray() throws ParseException;

    Equ getValueAsEquation() throws ParseException;

    Equ[] getValueAsEquationArray() throws ParseException;

    File[] getValueAsFileArray() throws ParseException;

    float[] getValueAsfloatArray() throws ParseException;

    Float[] getValueAsFloatArray() throws ParseException;

    int[] getValueAsintArray() throws ParseException;

    Integer[] getValueAsIntegerArray() throws ParseException;

    long[] getValueAslongArray() throws ParseException;

    Long[] getValueAsLongArray() throws ParseException;

    Pattern getValueAsPattern() throws ParseException;

    Pattern[] getValueAsPatternArray() throws ParseException;

    String[] getValueAsStringArray() throws ParseException;

    String getVariable();

    boolean hasValue();

    boolean isCamelCapsAllowed();

    boolean isCaseSensitive();

    boolean isMetaphoneAllowed();

    boolean isMultiple();

    boolean isParsed();

    boolean isPositional();

    boolean isRequired();

    boolean isRequiredValue();

    boolean isSystemGenerated();

    void reset();

    ICmdLineArg<E> resetCriteria();

    int salience(Token word);

    ICmdLineArg<E> setCamelCapsAllowed(boolean bool);

    ICmdLineArg<E> setCaseSensitive(boolean bool);

    ICmdLineArg<E> setDefaultValue(String defaultValue) throws ParseException, IOException;

    ICmdLineArg<E> setEnumCriteria(String enumClassName) throws ParseException, IOException;

    ICmdLineArg<E> setEnumCriteriaAllowError(String enumClassName);

    ICmdLineArg<E> setFactoryArgName(String argName);

    ICmdLineArg<E> setFactoryMethodName(String methodName) throws ParseException;

    ICmdLineArg<E> setFormat(String format) throws ParseException;

    ICmdLineArg<E> setHelp(String p_helpString);

    ICmdLineArg<E> setInstanceClass(String p_instanceClassString) throws ParseException;

    ICmdLineArg<E> setKeychar(final Character _keychar);

    ICmdLineArg<E> setKeyword(final String _keyword);

    ICmdLineArg<E> setListCriteria(String[] values) throws ParseException, IOException;

    ICmdLineArg<E> setMetaphoneAllowed(boolean bool);

    ICmdLineArg<E> setMultiple(boolean bool) throws ParseException;

    ICmdLineArg<E> setMultiple(int min) throws ParseException;

    ICmdLineArg<E> setMultiple(int min, int max) throws ParseException;

    void setObject(Object value);

    ICmdLineArg<E> setParsed(boolean bool);

    ICmdLineArg<E> setPositional(boolean bool);

    ICmdLineArg<E> setRangeCriteria(String min, String max) throws ParseException, IOException;

    ICmdLineArg<E> setRegxCriteria(String pattern) throws ParseException;;

    ICmdLineArg<E> setRequired(boolean bool);

    ICmdLineArg<E> setRequiredValue(boolean bool) throws ParseException;

    ICmdLineArg<E> setSystemGenerated(boolean bool) throws ParseException;;

    void setType(ClaType claType);

    void setUniqueId(int i);

    void setValue(E value);

    void setValue(int index, E value);

    ICmdLineArg<E> setVariable(String p_variableString);

    int size();

    boolean supportsCamelCaps();

    boolean supportsCaseSensitive();

    boolean supportsDefaultValues();

    boolean supportsExcludeArgs();

    boolean supportsFactoryArgName();

    boolean supportsFactoryMethod();

    boolean supportsFormat();

    boolean supportsHelp();

    boolean supportsInList();

    boolean supportsInstanceClass();

    boolean supportsLongName();

    boolean supportsMatches();

    boolean supportsMetaphone();

    boolean supportsMultimax();

    boolean supportsMultimin();

    boolean supportsPositional();

    boolean supportsRange();

    boolean supportsRequired();

    boolean supportsShortName();

    void useDefaults();
}