public abstract class AbstractShape {
	protected Color color;
	
	public AbstractShape() {
		
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public abstract void draw();
}
