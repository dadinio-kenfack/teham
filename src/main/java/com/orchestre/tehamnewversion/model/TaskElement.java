package com.orchestre.tehamnewversion.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

@XmlRootElement(name = "task")
public class TaskElement extends ProcessElement{

    private String url;
    private String pfad;
    private String port;
    private String id;
    private String target;
    private String source;
    private String type;
    private String name;

    public TaskElement() {}

    @XmlAttribute(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @XmlAttribute(name = "pfad")
    public String getPfad() {
        return pfad;
    }

    public void setPfad(String pfad) {
        this.pfad = pfad;
    }

    @XmlAttribute(name = "port")
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @XmlAttribute
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlAttribute
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @XmlAttribute
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @XmlAttribute
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlAttribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TaskElement that = (TaskElement) o;
        return Objects.equals(url, that.url) && Objects.equals(pfad, that.pfad) && Objects.equals(port, that.port) && Objects.equals(id, that.id) && Objects.equals(target, that.target) && Objects.equals(source, that.source) && Objects.equals(type, that.type) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), url, pfad, port, id, target, source, type, name);
    }

    @Override
    public String toString() {
        return "TaskElement{" +
                "url='" + url + '\'' +
                ", pfad='" + pfad + '\'' +
                ", port='" + port + '\'' +
                ", id='" + id + '\'' +
                ", target='" + target + '\'' +
                ", source='" + source + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
