package uz.mkhodjaev.dto;

public class MyLittleDto {
    private String name;

    public MyLittleDto(String name) {
        this.name = name;
    }

    public MyLittleDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
