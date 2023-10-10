//import java.io.FileNotFoundException;
//import java.io.*;
//import java.util.*;
//import java.math.*;
//public class OBJLoader {
//	public static RawModel loadObjModel(String fileName) {
//		FileReader	fr = null;
//			try {
//				fr = new FileReader(new File("C:\\Users\\GFC\\Desktop\\stall.obj"));
//			}catch(FileNotFoundException e) {
//				System.out.println("Couldnt load file!");
//				e.printStackTrace();
//			}
//			BufferedReader reader = new BufferedReader(fr);
//			String line;
//			List<Vector3f> vertices = new ArrayList<Vector3f>();
//			List<Vector2f> textures = new ArrayList<Vector2f>();
//			List<Vector3f> normals = new ArrayList<Vector3f>();
//			List<Integer> indices = new ArrayList<Integer>();
//			float[] verticesArray = null;
//			float[] normalsArray = null;
//			float[] textureArray = null;
//			int[] indicesArray = null;
//			
//			try {
//				while(true) {
//					line = reader.readLine();
//					String[] currentLine = line.split(" ");
//					if(line.startsWith("v ")) {
//						//Vector3f vertex = new Vector3f(Float.parseFloat(currentLine[1]),Float.parseFloat(currentLine[2]),Float.parseFloat(currentLine[3]));
//						vertices.add(vertex);
//					}else if(line.startsWith("vt ")) {
//						
//					}else if(line.startsWith("vn ")) {
//						
//					} else if(line.startsWith("f ")) {
//						
//					}
//				}
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//	}
//}
