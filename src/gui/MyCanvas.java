package gui;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class MyCanvas extends Canvas {
	
	boolean semaforoConsumidorEncendido;
	boolean semaforoProductorEncendido;
	
	// Colores
	Color myWhite = new Color(237, 240, 241);
	Color myPurple = new Color(146, 95, 177);
	Color myGreen = new Color(101, 200, 122);
	Color myRed = new Color(215, 87, 70);
	Color myBlack = new Color(47, 62, 79);
	Color myLightBlack = new Color(56, 73, 92);
	
	public MyCanvas(){
		semaforoConsumidorEncendido = false;
		semaforoConsumidorEncendido = false;
	}
	
	@Override
	public void paint(Graphics g) {
		g.setFont(new Font("Roboto",Font.BOLD, 12));
		
		g.drawString("Productor", 98, 31);
		g.drawString("Consumidor", 341, 31);
		g.drawString("Buffer", 233, 250);
		
		dibujarSemaforo(g, 178, 69, false);
		dibujarSemaforo(g, 294, 69, true);
		dibujarSemaforo(g, 236, 323, true);
		
		dibujarSlot(g, 78, 50, true);
		dibujarSlot(g, 327, 50, false);
		
		dibujarCableIzquierdo(g, false);
		dibujarCableDerecho(g, true);
		
	}
	
	public void dibujarSemaforo(Graphics g, int x, int y, boolean encendido) {
		int w = 27, h = 57;
		// Background
		g.setColor(myBlack);
		g.fillRect(x, y, w, h);
		// Faros
		g.setColor(encendido ? myLightBlack : myRed);
		g.fillOval(x+4, y+6, w-8, w-8);
		g.setColor(encendido ? myGreen : myLightBlack);
		g.fillOval(x+4, y+31, w-8, w-8);
		
		dibujarBuffer(g, 10, 3);
	}
	
	public void dibujarSlot(Graphics g, int x, int y, boolean activo) {
		int w = 94, h = w;
		g.setColor(activo ? myPurple : myWhite);
		g.fillRect(x, y, w, h);
	}
	
	public void dibujarCableIzquierdo(Graphics g, boolean activo) {
		g.setColor(activo ? myGreen: myRed);
		g.drawLine(44, 103, 74, 103);
		g.drawLine(44, 103, 44, 358);
		g.drawLine(44, 358, 236, 358);
	}
	
	public void dibujarCableDerecho(Graphics g, boolean activo) {
		g.setColor(activo ? myGreen: myRed);
		g.drawLine(421, 97, 421+34, 97);
		g.drawLine(421+34, 97, 421+34, 97+255);
		g.drawLine(263, 352, 421+34, 97+255);
	}
	
	public void dibujarBuffer(Graphics g, int nBlocks, int nEnBuffer) {
		int x = 84, y = 275;
		int w = 330, h = 30;
		
		int blockw = Math.floorDiv(w, nBlocks);
		int blockx = x;
		
		g.setColor(myWhite);
		g.drawRect(x, y, w, h);
		g.fillRect(x, y, w, h);
		
		for(int i = 0; i<nBlocks; i++) {
			blockx = x+(i*blockw);
			g.setColor(myBlack);
			g.drawRect(blockx, y, blockw, h);
			g.setColor(i < nEnBuffer ? myPurple : myWhite);
			g.fillRect(blockx, y, blockw, h);
		}
		
	}

}
