package hometask10.images;

public final class Editor {
    private Drawable drawable;

    public Editor(Drawable drawable) { // �����������
        setDrawable(drawable);
    }

    public void setDrawable(final Drawable drawable){
        this.drawable = drawable;
    }

    public void show(){
        drawable.draw();
    }
    @Override
    public Editor clone() {
        try {
            Editor editor = (Editor) super.clone();
            Drawable drawable = (Drawable) super.clone();
            editor.drawable = drawable;
            return editor;
        }
        catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }
}
//������, ��������� � ���� ������. ����� �� ���� ��������� � ������ ����� ������ Editor � ���������� ��� � ���� ����� �� ������������ ������? 