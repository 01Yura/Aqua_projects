package no_bugs.data_structure.tasks.task3;

public class Parameter {
    private String parameterName;
    private String parameterValue;

    public Parameter(String parameterName, String parameterValue) {
        this.parameterName = parameterName;
        this.parameterValue = parameterValue;

    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parametrName) {
        this.parameterName = parametrName;
    }

    public String getParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(String parametrValue) {
        this.parameterValue = parametrValue;
    }

}
