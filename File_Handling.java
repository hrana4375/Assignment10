package file_handling;


import java.io.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
class File_Handling{
    
        static void Function(String s,ArrayList al) {
          
            File file1 = new File(s);
            File f[] = file1.listFiles();
            for(int i=0;i<f.length;i++) {
                if(f[i].isFile()) {
                                 al.add(f[i].getAbsolutePath()); }
                else {
                    Function(f[i].getAbsolutePath(),al);
                    
                }
            }
        }
  
	public static void main(String args[]) throws IOException
	{
                JFrame jf = new JFrame();
                String path = JOptionPane.showInputDialog(jf, "Enter the Path");
                
		//File file = new File("C:\\Users\\Hims Rana\\Desktop\\abc.txt");
                File file = new File(path);
		FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                ArrayList al = new ArrayList();
		String s1,s2;
		s1 = br.readLine();
                s2=br.readLine();
                      		File file1 = new File(s2);
                                // if(!(file1.exists()))
                    //file1.createNewFile();
                FileWriter fw = new FileWriter(file1);
                BufferedWriter bw = new BufferedWriter(fw);

	        File f = new File(s1);
                if(f.isFile()) {
                    System.out.println("Folder Contains only Single file: ");
                    System.out.println(f.getAbsolutePath());
                }
                    else
                {
                   // if(f.isDirectory())
                        Function(f.getAbsolutePath(),al);
                }
                
                Iterator itr =al.iterator();
                
                while(itr.hasNext()) {
                    bw.write(itr.next().toString());
                    bw.newLine();
                }
                bw.close();
               
        }
    }
