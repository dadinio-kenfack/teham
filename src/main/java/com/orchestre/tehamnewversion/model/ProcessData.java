package com.orchestre.tehamnewversion.model;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "Process")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProcessData {
    @XmlElement(name = "connector")
    private List<ProcessElement> process;
    @XmlElement(name = "task")
    private List<TaskElement> taskElements;

    public ProcessData() {
    }

    public List<ProcessElement> getProcess() {
        return process;
    }

    public void setProcess(List<ProcessElement> process) {
        this.process = process;
    }

    public List<TaskElement> getTaskElements() {
        return taskElements;
    }

    public void setTaskElements(List<TaskElement> taskElements) {
        this.taskElements = taskElements;
    }

    @Override
    public String toString() {
        return "ProcessData{" +
//                "process=" + process +
                ", taskElements=" + taskElements +
                '}';
    }
}
