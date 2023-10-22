package hometask10.images;

public final class Editor {
    private Drawable drawable;

    public Editor(Drawable drawable) { // конструктор
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
//Честно, запутался с этим клоном. Нужно ли явно создавать в методе новый объект Editor и складывать все в него чтобы не пересекались ссылки? 