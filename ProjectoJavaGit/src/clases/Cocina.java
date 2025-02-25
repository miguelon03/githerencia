package clases;

public class Cocina extends Estancia {
	private boolean tendedero;
	private int metrocuadradoTendedero;

	public Cocina(boolean t, int m,  String n, int mc, int np, int nv) {
		super(n, mc, np, nv);
			tendedero=t;
			metrocuadradoTendedero=m;
		
	}
	public String mostrarInfo() {
		String informacion= super.mostrarInfo()+"Tiene tendedero: "+this.tendedero
				+" Metro Cuadrados del tendedero: "+metrocuadradoTendedero;
		return informacion;
	}
}