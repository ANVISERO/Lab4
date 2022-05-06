package Auxiliary;

public abstract class StoryCharacters extends Objects{

    protected Status status;
    protected Size size;

    public StoryCharacters(String name, Status status, Size size) {
        super(name);
        this.status = status;
        this.size = size;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Size getSize() {
        return size;
    }

    public String getStatusName(){
        return status.getName();
    }

    public String getSizeName(){
        return size.getName();
    }


}
